import greenfoot.*;
import java.util.*; 

public class GasPumpMachine  extends Actor //implements IComponent
{
   public Screen screen;
   public Button [] buttons;
   public MenuButton [] menuButtons;
   public CardSlot cardSlot;
   public Card originalCard;
   public Card duplicateCard;  
   public ReceiptPrinter receiptPrinter;
   public Nozzle nozzle0;
   public Nozzle nozzle1;
   
   
   public GasPumpMachine(Screen s, Button [] b, MenuButton [] m, CardSlot cs, Card o, Card d, ReceiptPrinter rp, Nozzle n0, Nozzle n1){
       this.screen=s;
       this.buttons=b;
       this.menuButtons=m;
       this.cardSlot=cs;
       this.originalCard=o;
       this.duplicateCard=d;
       this.receiptPrinter=rp;
       this.nozzle0=n0;
       this.nozzle1=n1;           
   }
   
   public void act(){

         
    
    
   }
    
}
