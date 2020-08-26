import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //Fields
    public static final int UP = -90;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;    
    
    public Player(String imgFile) {
        setImage(imgFile);
/*       
        } */
    }
    
    
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
    }

    public boolean isAllowedToMove(int direction) {
        boolean canMove = true;
        if (isTouching(Wall.class)) {
            //is the wall in the direction of movement
            List<Wall> touchingWalls = getIntersectingObjects(Wall.class);
            
            for(Wall wall : touchingWalls) {
                if(intersects(wall)) {
                    if(direction == UP) {
                        if(wall.getY() > getY()) {
                            int wallLeftX = wall.getX() - wall.width/2;
                            int wallRightX = wall.getX() + wall.width/2;
                            if(getX() >= wallLeftX && getX() <= wallRightX){
                                canMove = false;
                            }
                        }
                    }
                    else if (direction == DOWN) {
                        if(wall.getY() < getY()) {
                            int wallLeftX = wall.getX() - wall.width/2;
                            int wallRightX = wall.getX() + wall.width/2;
                            if(getX() >= wallLeftX && getX() <= wallRightX){
                                canMove = false;
                            }
                        }
                    }
                    else if (direction == LEFT) {
                        if(wall.getX() < getX()) {
                            int wallLeftY = wall.getY() - wall.height/2;
                            int wallRightY = wall.getY() + wall.height/2;
                            if(getX() >= wallLeftY && getY() <= wallRightY){
                                canMove = false;
                            }
                        }
                    }
                    else if (direction == RIGHT) {
                        if(wall.getX() > getX()) {
                            int wallLeftY = wall.getY() - wall.height/2;
                            int wallRightY = wall.getY() + wall.height/2;
                            if(getX() >= wallLeftY && getY() <= wallRightY){
                                canMove = false;
                            }
                        }
                    }
                    //TODO: left and right
                    
                }
                
            }
        }
        return canMove;
    }
/*                if (direction == UP) {
                    //if wall's y is smaller, then return false;
                    if(wall.getY() < getY()){
                        return false;
                    }
                }
                else if (direction == DOWN) {
                    if(wall.getY() > getY()){
                        return false;
                    }
                }
                else if (direction == LEFT) {
                    if(wall.getX() < getX()){
                        return false;
                    }
                }
                else if (direction == RIGHT) {
                    if(wall.getX() > getX()){
                        return false;
                    }
                }
  */      

    
    
    public boolean isTouchingWall(){
        return isTouching(Wall.class);
    }
    
    
    public void shoot()
    {
        /*System.out.println("BANG!");
        
        Bullet bullet = new Bullet();
        getWorld().addObject(getX(), getY());
        bullet1.move(40); 
        
        //create a gun in front of player's gun
        //bullet will have same direction as player direction
        //Game gameBoard = getWorldOfType(Game.class);
        //int bulletX = getX(); //TODO: move in front of player's gun
        //int bulletY = getY();
        //Bullet newBullet = new Bullet(30, bulletX, bulletY, 0);
        //gameBoard.bulletList.add(newBullet);
        */
    }
}
