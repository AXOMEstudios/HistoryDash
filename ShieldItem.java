import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShieldItem extends Actor
{
    public ShieldItem() {
        setImage("Shield.png");
        Helpers.setImageSize(32, 32, this);
    }
    
    public void act()
    {
        move(-Configuration.moveSpeed);
        
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
