import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{
    public MainMenu()
    {    
        super(Configuration.worldSizeX, Configuration.worldSizeY, 1);
        
        addObject(new Play(), 340, 210);
        addObject(new Instructions(), 300, 270);
        addObject(new CodeAndLicensing(), 300, 317);
    }
}
