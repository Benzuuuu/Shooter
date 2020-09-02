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
    public static final int UP = 270;
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
        createLevel1();
//           createLevel2();
       
        
    }
    
    public void createLevel1() {
        //set up all the wall for this game
        Wall currentWall = new Wall(10,200);
        wallList.add(currentWall);
        addObject(currentWall, 100, 193);
        
        currentWall = new Wall(10,200);
        wallList.add(currentWall);
        addObject(currentWall, 414,208);
        
        currentWall = new Wall(400, 10);
        wallList.add(currentWall);
        addObject(currentWall, 272,336);
    }

    public void act() {
        //movement
        if (Greenfoot.isKeyDown("w")) {
            p1.movePlayer(UP);
        }
        if (Greenfoot.isKeyDown("s")) {
            p1.movePlayer(DOWN);
        }
        if (Greenfoot.isKeyDown("a")) {
            p1.movePlayer(LEFT);
        }
        if (Greenfoot.isKeyDown("d")) {
            p1.movePlayer(RIGHT);
        }
        if (Greenfoot.isKeyDown("up")) {
            p2.movePlayer(UP);
        }
        if (Greenfoot.isKeyDown("down")) {
            p2.movePlayer(DOWN);
        }
        if (Greenfoot.isKeyDown("left")) {
            p2.movePlayer(LEFT);
        }
        if (Greenfoot.isKeyDown("right")) {
            p2.movePlayer(RIGHT);
        }
        //shooting
        if(Greenfoot.isKeyDown("space")){
            p1.shoot();
        }
        if(Greenfoot.isKeyDown(",")){
            p2.shoot();
            
        }
    }
}

