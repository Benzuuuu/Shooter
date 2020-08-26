import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    //FIELDS
    public Player p1;
    public Player p2;
    public List<Wall> wallList = new ArrayList<>();
    public List<Box> box;
    public List<Bullet> bulletList = new ArrayList<>();
    public static final int UP = -90;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        
    }
    
    /*public Game(String imageFile, String Left, String Right, String Down, String Up) {
    Up = p1("W"),p2("up");
    Down = p1("S"),p2("down");
    Left = p1("A"),p2("left");
    Right = p1("D"),p2("right");

    }*/
    public void prepare() {
        p1 = new Player("soldier1.gif");
        p2 = new Player("soldier2.gif");
        addObject(p1, 25,16);
        addObject(p2, 556, 363);
        createWalls();

       
        
    }
    
    public void createWalls() {
        //set up all the wall for this game
        Wall currentWall = new Wall(5,200);
        wallList.add(currentWall);
        addObject(currentWall, 100, 193);
        
        currentWall = new Wall(5,200);
        wallList.add(currentWall);
        addObject(currentWall, 414,208);
        
        currentWall = new Wall(400, 5);
        wallList.add(currentWall);
        addObject(currentWall, 272,336);
    }

    public void act() {
        //movement
        if (Greenfoot.isKeyDown("w")) {
            p1.setRotation(UP);
            if (p1.isAllowedToMove(UP)) {
                p1.move(4);
            }
        }
        if (Greenfoot.isKeyDown("s")) {
            p1.setRotation(DOWN);
            if (p1.isAllowedToMove(DOWN)) {
                p1.move(4);
            }
        }
        if (Greenfoot.isKeyDown("a")) {
            p1.setRotation(LEFT);
            if (p1.isAllowedToMove(LEFT)) {
                p1.move(4);
            }
        }
        if (Greenfoot.isKeyDown("d")) {
            p1.setRotation(RIGHT);
            if (p1.isAllowedToMove(RIGHT)) {
                p1.move(4);
            }
        }
        if (Greenfoot.isKeyDown("up")) {
            p2.setRotation(UP);
            if (p2.isAllowedToMove(UP)) {
                p2.move(4);
            }
        }
        if (Greenfoot.isKeyDown("down")) {
            p2.setRotation(DOWN);
            if (p2.isAllowedToMove(DOWN)) {
                p2.move(4);
            }
        }
        if (Greenfoot.isKeyDown("left")) {
            p2.setRotation(LEFT);
            if (p2.isAllowedToMove(LEFT)) {
                p2.move(4);
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            p2.setRotation(RIGHT);
            if (p2.isAllowedToMove(RIGHT)) {
                p2.move(4);
            }
        }
        //shooting
        if(Greenfoot.isKeyDown("space")){
            p1.shoot();
            Bullet currentB = new Bullet(90, p1.getX(), p1.getY(), p1.getRotation(), 10, 20);
            bulletList.add(currentB);
        
        }
        if(Greenfoot.isKeyDown(",")){
            p2.shoot();
            Bullet currentB = new Bullet(90, p2.getX(), p2.getY(), p2.getRotation(), 10, 20);
            bulletList.add(currentB);
        }
    }
}

