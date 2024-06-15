import greenfoot.*; 

public class Schweineunternehmen extends Actor
{
    public Schweineunternehmen() {
        getImage().scale(36, 30);
    }
    
    public void act()
    {
        move(-6);
        
        if (getX() <= 0) getWorld().removeObject(this);
    }
}
