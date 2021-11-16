import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    
    int timer = 50;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //private int actCounter =
    public MyWorld()
    {    
        
        super(1000, 700, 1);
        timer = 50; 
        addObject(new frog(), 10,200);
        addObject(new car(4) , 50, 0);
        addObject(new car(5), 200, 200);
        addObject(new car(3), 100,550);
        
        addObject(new car(4) , 500, 0);
        addObject(new car(5), 600, 200);
        addObject(new car(3), 700,550);
       
    }
    
    public void act(){
       //  int num = (int)(Math.random()*100);
       timer --; 
       if(timer <= 0){
         // addObject(new car(), .getX(), 0);  
          timer = 50;
       }
       //  if(num == 1){
       //   addObject(new car(), (int)(Math.random() * 300+100), 0);         
       //  }
      
         
       
    }
    
}