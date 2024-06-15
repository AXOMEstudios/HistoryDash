import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Instructions extends Button
{
    public Instructions() {
        Helpers.setImageSize(120, -1, this);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            getWorld().addObject(new InstructionsPanel(), Configuration.worldSizeX / 2, Configuration.worldSizeY);
        }
    }
}
