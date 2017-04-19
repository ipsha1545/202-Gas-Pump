import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasStationMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasStationMachine extends Actor
{
     CardSlot cardSlot;
     Card Card;
     Screen Screen;
     Keypad Keypad;
     ReceiptPrinter ReceiptPrinter;
     Fuel Fuel;
     Nozzle Nozzle;
     Nozzle Nozzle2;
     Nozzle Nozzle3;
     Button[] bArray; 
 
    
    public GasStationMachine(){} 
     
    public GasStationMachine(CardSlot myCS, Card myC, Screen myS, Keypad myK, ReceiptPrinter myRP, Fuel myF, Nozzle myN,Nozzle myN2, Nozzle myN3, Button[] array){
         cardSlot=myCS;
         card=myC;
         screen=myS;
         keypad;
         receiptPrinter;
         fuel;
         nozzle;
         nozzle2;
         nozzle3;
         bArray=array;
    }
    
    
    public void act() 
    {
        
    }    
}
