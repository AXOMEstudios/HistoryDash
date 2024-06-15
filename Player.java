import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private void setImageSize(int x, int y) {
        GreenfootImage image = getImage();  
        image.scale(x, y);
    }
    
    public Player() {
        setImageSize(32, 32);
    }
    
    private boolean isGrounded() {
        Actor touchingGround = getOneIntersectingObject(Ground.class);
        return (touchingGround != null);
    }
    
    private boolean isGameOver() {
        return getY() > 398 || getOneIntersectingObject(Schweineunternehmen.class) != null;
    }
    
    private void handleProtectionItems() {
        if (protectionTimer > 0) {
            protectionTimer--;
        } else {
            isProtected = false;
            setImage("Chippy.png");
            setImageSize(32, 32);
        }
        
        ShieldItem shield = ((ShieldItem)getOneIntersectingObject(ShieldItem.class));
        if (shield == null) return;
        
        isProtected = true;
        protectionTimer = Configuration.shieldProtectionDuration;
        setImage("ChippyProtected.png");
        setImageSize(32, 32);
        getWorld().removeObject(shield);
    }
    
    
    boolean jumping = false;
    double remainingJumpForce = 0.0;
    double fallSpeed = 0.0;
    public boolean isProtected = false;
    public int protectionTimer = -1;
    
    public void act()
    {
        if (isGameOver()) {
            if (isProtected) {
                isProtected = false;
                protectionTimer = -1;
                setImage("Chippy.png");
                setImageSize(32, 32);
                setLocation(getX(), 32);
                getWorld().addObject(new ShieldUsed(), Configuration.worldSizeX / 2, Configuration.worldSizeY / 2);
                return;
            }
            Level world = (Level)getWorld();
            world.gameOver();
        }
        
        handleProtectionItems();
        
        if (!isGrounded()) {
            fallSpeed += Configuration.gravitationalAcceleration;
            if (remainingJumpForce > 0) {
                remainingJumpForce -= Configuration.decraseFactor;
                setRotation(getRotation() + 12);
            }
        } else {
            fallSpeed = -1;
            remainingJumpForce = 0;
            
            if (Greenfoot.isKeyDown(Configuration.jump)) {
                remainingJumpForce = Configuration.jumpForce;
                getWorld().addObject(new ParticleSystem("Jump-Effect.png", 20, 1), getX(), getY());
            }
            
            setRotation(0);
        }
        
        setLocation(
            getX(),
            getY() + (int)fallSpeed - (int)remainingJumpForce
        );
        
        getWorld().addObject(new ParticleSystem("Traces.png", 30, 2), getX()-16, getY());
    }
}
