import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frog extends Actor
{
  private int speed;
  private boolean gameOver;
    public frog(){
        speed = 0;
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 200, image.getHeight() - 200);
        setImage(image);
  }
    public frog(int speed, boolean gameOver){
        this.gameOver = false;
        this.speed = speed;
  }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(5);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(5);
        }
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5);
        }
       
         
        if(isTouching(car.class)){
            getWorld().showText("Game Over!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().removeObject(this);
            
            
        }
        
        
  }  
  
  
  
  
}
