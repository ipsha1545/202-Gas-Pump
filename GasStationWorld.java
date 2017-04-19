import greenfoot.*;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GasStationWorld extends World
{
    public CardSlot cardSlot=new CardSlot();
    public Card card=new Card();
    public Screen screen=new Screen();
    public Keypad keypad = new Keypad();
    public ReceiptPrinter receiptPrinter = new ReceiptPrinter();
    public Fuel fuel = new Fuel(1);                                         //fuel type default 1
    public Nozzle nozzle1=new Nozzle(1);                                     //nozzle type default 1
    public Nozzle nozzle2=new Nozzle(2);  
    public Nozzle nozzle3=new Nozzle(3); 
    Button[] buttonArray=new Button[8];
    
    public GasStationMachine gasStationMachine;
    
    public GasStationWorld()
    {    
        super(1000, 600, 1);
        prepare();
        gasStationMachine = new GasStationMachine(cardSlot, card, screen, keypad, receiptPrinter, fuel, nozzle1, nozzle2, nozzle3, buttonArray);
    }

    public void prepare(){
        GasStationMachine g = new GasStationMachine();
        addObject(screen, 400, 200);
        addObject(cardSlot, 750, 200);
        addObject(card, 825, 200);
        //addObject(keypad, 500, 500);
        //addObject(receiptPrinter, 500, 300);
        //addObject(nozzle1, 500, 300);
        //addObject(nozzle2, 500, 300);
        //addObject(nozzle3, 500, 300);
        

    }

}
