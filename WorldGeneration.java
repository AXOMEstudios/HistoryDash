import greenfoot.*;
import java.util.Random;

public class WorldGeneration  
{
    World worldObject;
    Random rand;
        
    public WorldGeneration(World initWorld) {
        this.worldObject = initWorld;
        
        rand = new Random();
        rand.setSeed(Configuration.seed);
        
        for (int i = 0; i <= 8; i++) {
            generate(
                (Configuration.worldSizeX) - (i * (Configuration.platformLength))
            );
        }
        
        
    }
    
    int getRandNumber(int limit) {
        return rand.nextInt(limit);
    }
    
    int passedSinceLastGeneration = 0;
    int lastYCoordinate = 350;
    int sameSince = 0;
    int sinceLastImage = 0;
    int curImage = -1;
    boolean useCustomImage = false;
    boolean lastOneOmitted = false;

    public void generationTick() {
        passedSinceLastGeneration += Configuration.moveSpeed;
        if (passedSinceLastGeneration < Configuration.platformLength - 1) return;
        
        generate(Configuration.worldSizeX + 50);
    }
    
    private void generate(int customXCoord) {
        boolean differCoordinate = (
            (sameSince >= Configuration.maxSamePlatformHeights) ||
            (
                getRandNumber(15) == 1 &&
                sameSince >= Configuration.minSamePlatformHeights
            )
        );
        int newCoordinate = lastYCoordinate;
        
        if (differCoordinate) {
            int differCoordinateBy = 0;
            
            differCoordinateBy = 25 * (1 - getRandNumber(3));
            newCoordinate = Helpers.clampInt(
                lastYCoordinate + differCoordinateBy,
                200,
                Configuration.worldSizeY - 110
            );
            
        } else {
            sameSince++;
        }
        
        sinceLastImage++;
        useCustomImage = false;
        if (sinceLastImage > 10) {
            sinceLastImage = 0;
            curImage++;
            useCustomImage = true;
            
            Text infoText = new Text(curImage);
            worldObject.addObject(infoText, Configuration.worldSizeX / 2, 50);
            passedSinceLastGeneration = -50;
        } else {
            passedSinceLastGeneration = 0;
        }
        
        if (!lastOneOmitted && !useCustomImage && getRandNumber(10) == 1) {
            lastOneOmitted = true;
            return;
        } else {
            lastOneOmitted = false;
        }
        
        Ground platform = new Ground((useCustomImage && curImage < Configuration.images.length) ? Configuration.images[curImage] : "");
        
        worldObject.addObject(platform, customXCoord, newCoordinate);
        
        lastYCoordinate = newCoordinate;
        
        if (getRandNumber(32) == 1 && curImage > 3)  {
            worldObject.addObject(new Schweineunternehmen(), customXCoord, getRandNumber(400));
        }
        
        if (getRandNumber(25) == 1) {
            worldObject.addObject(new ShieldItem(), customXCoord, newCoordinate - 32);
        }
    }
}
