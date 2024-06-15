import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CodeAndLicensing extends Button
{
    public CodeAndLicensing() {
        Helpers.setImageSize(120, -1, this);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            getWorld().addObject(new SourcePanel(), Configuration.worldSizeX / 2, Configuration.worldSizeY);
        }
    }
}
