import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed;
    public car(int speed){
        this.speed = speed;
    }
    public void act() 
    {
        setRotation(90);
       move(speed);
        if(getX()== 250){
           setLocation(300,0);
       }
        if(isAtEdge()&& getY() != 0){
            
           getWorld().addObject(new car((int)(Math.random()*5+7)), this.getX(),0);
           getWorld().removeObject(this);
       }
        
       
    }    
}
