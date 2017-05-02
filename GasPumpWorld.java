import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GasPumpWorld extends World
{
    public GasPumpWorld()
    {     
        
        super(1000, 600, 1); 
        prepare();
    }
    
    
    public void prepare(){
        
        addObject(new Screen(), 350, 200);
        addObject(new LeftMenuButton(), 600, 100);
        addObject(new LeftMenuButton(), 600, 160);
        addObject(new LeftMenuButton(), 600, 220);
        addObject(new LeftMenuButton(), 600, 280);
        addObject(new Screen(), 350, 200);
        addObject(new LeftMenuButton(), 100, 100);
        addObject(new LeftMenuButton(), 100, 160);
        addObject(new LeftMenuButton(), 100, 220);
        addObject(new LeftMenuButton(), 100, 280);
        addObject(new CardSlot(), 675, 125);
        addObject(new Card(), 750, 125);
        addObject( new Nozzle(1), 750, 400 );
    }
    
}
