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
        addObject(new MenuButton(), 600, 100);
        addObject(new MenuButton(), 600, 160);
        addObject(new MenuButton(), 600, 220);
        addObject(new MenuButton(), 600, 280);
        addObject(new Screen(), 350, 200);
        addObject(new MenuButton(), 100, 100);
        addObject(new MenuButton(), 100, 160);
        addObject(new MenuButton(), 100, 220);
        addObject(new MenuButton(), 100, 280);
        addObject(new CardSlot(), 700, 125);
        addObject(new Card(0), 800, 125);
        addObject(new Card(1), 850, 125);
        addObject(new Nozzle(0), 750, 450 );
        addObject(new Nozzle(1), 850, 450 );
        addObject(new ReceiptPrinter(), 700, 250);
        
        /*
         1 2 3 YES
         4 5 6 NO
         7 8 9 HELP
         * 0 # CANCEL                         
        */
                
        addObject(new Button(1), 225, 375);
        addObject(new Button(2), 310, 375);
        addObject(new Button(3), 400, 375);
        addObject(new Button(12),490 ,375); //yes        
        addObject(new Button(4), 225, 425);
        addObject(new Button(5), 310, 425);
        addObject(new Button(6), 400, 425);
        addObject(new Button(13),490, 425); //no        
        addObject(new Button(7), 225, 475); 
        addObject(new Button(8), 310, 475);
        addObject(new Button(9), 400, 475);
        addObject(new Button(14),490, 475); //help                
        addObject(new Button(10),225, 525); //star
        addObject(new Button(0), 310, 525);        
        addObject(new Button(11),400, 525); //hash
        addObject(new Button(15),490, 525); //cancel   
        
    }
    
}
