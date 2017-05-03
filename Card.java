import greenfoot.*;  

public class Card extends Actor 
{
    int type;
    static GreenfootImage[] images = {new GreenfootImage("Original.png"), new GreenfootImage("Duplicate.jpeg")}; 
    public Card(int type){
        this.type=type;
        setImage(images[type]);
    }
    public void act() 
    {
        
    }    
}
