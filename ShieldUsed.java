import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ShieldUsed extends Actor
{
    int ttl = 60;
    int initialTTL = 60;
    
    public void act()
    {
        ttl--;
        if (ttl <= 0) {
            getWorld().removeObject(this);
            return;
        }
        getImage().setTransparency((int)(255*(ttl/(double)initialTTL)));
    }
}
