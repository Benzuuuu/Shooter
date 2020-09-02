import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    //Fields
    int speed;
    public static final int UP = 270;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;    
    
    public Bullet(int speed, int direction) {
        this.speed = speed;
        setRotation(direction);
        
        GreenfootImage BulletImage = new GreenfootImage(5, 5);
        
        
        BulletImage.setColor(Color.RED);
        BulletImage.fill();
        
        
       setImage(BulletImage);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // move the bullet
        move(speed);
        
        //wall collision
        if(isTouching(Wall.class)) {
            remove();
            
        }
        
        //player collision
        else if(isTouching(Player.class)) {
            remove();
        }
        
        //edge of screen
        else if(this.isAtEdge()){
            remove();
        }
    }
    
    public void remove() {
        //remove the object from the game board
        Game world = (Game)getWorld();
        world.removeObject(this);
        
        //remove the bullet from the bulletList
        world.bulletList.remove(this);
    }
}
