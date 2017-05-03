import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
        
        static GreenfootImage[] images = {new GreenfootImage("Zero.png"), 
                                          new GreenfootImage("One.png"),
                                          new GreenfootImage("Two.png"),
                                          new GreenfootImage("Three.png"),
                                          new GreenfootImage("Four.png"),
                                          new GreenfootImage("Five.png"),
                                          new GreenfootImage("Six.png"),
                                          new GreenfootImage("Seven.png"),
                                          new GreenfootImage("Eight.png"),
                                          new GreenfootImage("Nine.png"),
                                          new GreenfootImage("Star.png"),
                                          new GreenfootImage("Hash.png"),
                                          new GreenfootImage("Yes.png"),
                                          new GreenfootImage("No.png"),
                                          new GreenfootImage("Help.png"),
                                          new GreenfootImage("Cancel.png")                                           
                                        }; 
        int id;
        public Button(int id){
            this.id=id;
            setImage(images[id]);
        }
    
    
    public void act() 
    {
       
    }    
}
