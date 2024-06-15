import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InformationPanel extends Actor
{
    public InformationPanel() {
        Helpers.setImageSize(Configuration.worldSizeX - 120, -1, this);
    }
    
    public void act()
    {
        if (getY() > Configuration.worldSizeY / 2) {
            setLocation(getX(), getY() - 8);
        }
        
        if (Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
        }
    }
}
