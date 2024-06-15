import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScoreIndicator extends Actor
{
    public int score = 0;
    public static int maxScore = 8800;
    
    public void act()
    {
        int percentage = Helpers.clampInt((int)(100*(score/(double)maxScore)), 0, 100);
        setImage(
            new GreenfootImage(
                "Punkte: " + (score/10) + " (" + percentage + "%)",
                16,
                new Color(100, 100, 230, 128),
                new Color(0, 0, 0, 0)
            )
        );
        score++;
    }
}
