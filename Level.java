import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level extends World
{
    WorldGeneration worldGenerator;
    
    public Player player;
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(Configuration.worldSizeX, Configuration.worldSizeY, 1); 
        
        player = new Player();
        
        this.addObject(player, 150, 100);
        
        worldGenerator = new WorldGeneration(this);
        
        this.addObject(new Vignette(), Configuration.worldSizeX/2, Configuration.worldSizeY/2);
        this.addObject(new ScoreIndicator(), Configuration.worldSizeX/2, Configuration.worldSizeY - 20);
        
        setPaintOrder(
            ShieldUsed.class,
            ScoreIndicator.class,
            Text.class,
            Vignette.class,
            Schweineunternehmen.class,
            Ground.class,
            Player.class
        );
    }
    
    public void act() {
        worldGenerator.generationTick();
    }
    
    public void gameOver() {
        Greenfoot.setWorld(new Level());
    }
}
