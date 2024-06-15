import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    public Play() {
        Helpers.setImageSize(200, -1, this);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level());
        }
    }
}
