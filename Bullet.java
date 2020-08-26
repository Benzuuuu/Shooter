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
    int x;
    int y;
    int direction;
    public static final int UP = -90;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;    
    public int height;
    public int width;
    public Bullet(int speed, int x, int y, int direction, int height, int width) {
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.height = height;
        this.width = width;
        GreenfootImage BulletImage = new GreenfootImage(width, height);
        
        
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
        
        //wall collision
        
        //player collision
        
        //edge of screen
        
    }    
}
