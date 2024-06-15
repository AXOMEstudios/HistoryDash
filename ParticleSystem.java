import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ParticleSystem extends Actor
{
    int ttl = 1;
    int initialTTL = 0;
    int effect = 0;
    
    public ParticleSystem(String particle, int ttl, int effect) {
        setImage(new GreenfootImage(particle));
        this.ttl = ttl;
        this.initialTTL = ttl;
        this.effect = effect;
        
        if (effect == 1) {
            GreenfootImage image = getImage();
            image.scale((int)(image.getWidth() / 2), (int)(image.getHeight() / 2));
        }
    }
    
    public void act()
    {   
        if (ttl <= 0) {
            getWorld().removeObject(this);
            return;
        }
        ttl--;
        
        if (effect == 0) return;
        GreenfootImage image = getImage();
        
        if (effect == 1) {
            image.scale(image.getWidth() + 3, image.getHeight() + 3);
            image.setTransparency((int)(255*(ttl/(double)initialTTL)));
            setRotation(getRotation() - 6);
        } else if (effect == 2) {
            setLocation(getX() - Configuration.moveSpeed, getY());
            image.setTransparency((int)(255*(ttl/(double)initialTTL)));
            setRotation(getRotation() -2);
        }
    }
}
