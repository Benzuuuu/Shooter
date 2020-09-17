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
        public static final int UP = 270;
        public static final int UP_LEFT = 225;
        public static final int UP_RIGHT = 315;
        public static final int DOWN = 90;
        public static final int LEFT = 180;
        public static final int RIGHT = 0; 
        public static final int DOWN_RIGHT = 45;
        public static final int DOWN_LEFT = 135;
        public long bulletTime = 0;
        public String weapon; //"gun" "rocket launcher"
        public int health = 100;
        
        
        public Player(String imgFile) {
            weapon = "gun";
            setImage(imgFile);
        }
        
        
        /**
         * Act - do whatever the Player1 wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act(){
            
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
    public void movePlayer(int direction)
    {
        setRotation(direction);
        move(2);
        if (isTouching(Wall.class)) {
            move(-2);
        }
    }
    
    public void shoot()
    {
        if (getCurrentTime() - bulletTime > 200) {
            Projectile projectile;
            int direction = getRotation();
            //create a projectile
            if (weapon.equals("gun")){
                projectile = new Bullet(direction);
            }
            else { //if (weapon.equals("rocket launcher")) {
                projectile = new Rocket(direction);
            }

            //add projectile to projectileList
            Game gameWorld = (Game)getWorld();
            gameWorld.projectileList.add(projectile);
            
            //add projectile to the world
            if(direction == RIGHT){
                gameWorld.addObject(projectile, (getX()+25), (getY()+12));
            } else if (direction == LEFT){
                gameWorld.addObject(projectile, (getX()-25), (getY()-12));
            } else if (direction == UP){
                gameWorld.addObject(projectile, (getX()+12), (getY()-25));
            } else if (direction == DOWN) {
                gameWorld.addObject(projectile, (getX()-12), (getY()+25));
            } else if (direction == UP_LEFT) {
                gameWorld.addObject(projectile, (getX()-12), (getY()-25));
            } else if (direction == UP_RIGHT){
                gameWorld.addObject(projectile, (getX()+36), (getY()-30));
            } else if (direction == DOWN_LEFT){
                gameWorld.addObject(projectile, (getX()-36), (getY()+12));
            } else if (direction == DOWN_RIGHT){
                gameWorld.addObject(projectile, (getX()+12), (getY()+25));
            } 
           
        //set the time of the last bullet fired (seconds)
            
            bulletTime = getCurrentTime();
        }
    }
    
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
