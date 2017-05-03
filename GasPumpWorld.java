import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GasPumpWorld extends World
{
    public Screen screen = new Screen();
    
    
    public Button [] buttons = {
                                    new Button(1), new Button(2), new Button(3), new Button(12),
                                    new Button(4), new Button(5), new Button(6), new Button(13),
                                    new Button(7), new Button(8), new Button(9), new Button(14),
                                    new Button(10), new Button(0), new Button(11), new Button(15)                                                                        
                              };
                              
                              
    public MenuButton [] menuButtons = {
                                    new MenuButton(0),new MenuButton(1), new MenuButton(2), new MenuButton(3), 
                                    new MenuButton(4),new MenuButton(5), new MenuButton(6), new MenuButton(7)                                    
                              };
                              
   public CardSlot cardslot = new CardSlot();                              
   public Card originalCard = new Card(0);
   public Card duplicateCard =new Card(1);
   
   public ReceiptPrinter receiptPrinter = new ReceiptPrinter();
   
   public Nozzle fuelType0= new Nozzle(0);
   public Nozzle fuelType1= new Nozzle(1);   
    
    public GasPumpWorld()
    {     
        
        super(1000, 600, 1); 
        prepare();
    }
    
    
    public void prepare(){
        
        addObject(new Screen(), 350, 200);
        addObject(new MenuButton(0), 600, 100);
        addObject(new MenuButton(1), 600, 160);
        addObject(new MenuButton(2), 600, 220);
        addObject(new MenuButton(3), 600, 280);
        addObject(new Screen(), 350, 200);
        addObject(new MenuButton(4), 100, 100);
        addObject(new MenuButton(5), 100, 160);
        addObject(new MenuButton(6), 100, 220);
        addObject(new MenuButton(7), 100, 280);
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
