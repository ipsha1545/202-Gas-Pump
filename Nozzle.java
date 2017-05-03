import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Nozzle extends Actor implements IComponent
{
    int nozzleType;
    static GreenfootImage[] images = {new GreenfootImage("red-nozzle.png"), new GreenfootImage("yellow-nozzle.png")}; 

    public Nozzle(int type){
        nozzleType=type;
        setImage(images[type]); 
    }
    
    public void act() {}    
}
