import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ground extends Actor
{
    public Ground(String image) {
        boolean customImage = false;
        if (!image.equals("")) {
            setImage(image);
            customImage = true;
        }
        
        Helpers.setImageSize(Configuration.platformLength * (customImage ? 2 : 1), (customImage ? -1 : 40), this);
    }
    
    public void act()
    {
        move(-Configuration.moveSpeed);
        
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
