import greenfoot.*; 

public class Text extends Actor
{
    int willPersistFor = Configuration.textPersistence;
        
    public Text(int index)
    {
        if (index < 0 || index >= Configuration.texts.length) {
            willPersistFor = 0;
            return;
        }
            
        setImage(new GreenfootImage(Configuration.texts[index], 20, Color.WHITE, new Color(0, 0, 0, 0)));
        getImage().setTransparency(255);
    }
    
    public void act() {
        if (willPersistFor > Configuration.textPersistence - 50) {
            getImage().setTransparency((int)(((double)(Configuration.textPersistence - willPersistFor) / 50)*255));
        }
        
        if (willPersistFor <= 0) {
            getWorld().removeObject(this);
            return;
        }
        
        if (willPersistFor <= 50) {
            getImage().setTransparency((int)(((double)willPersistFor / 50)*255));
        }
        
        willPersistFor--;
        int yPos = getY() - (willPersistFor / 290);
        setLocation(getX(), yPos);
    }
}
