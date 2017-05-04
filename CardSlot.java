import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CardSlot extends Actor implements IComponent
{

    public void act() 
    {       
      MouseInfo minfo=Greenfoot.getMouseInfo();
      OriginalCard oCard = (OriginalCard) getOneIntersectingObject(OriginalCard.class);
      DuplicateCard dCard = (DuplicateCard) getOneIntersectingObject(DuplicateCard.class);

      GasPumpWorld gpw = (GasPumpWorld) getWorld(); 
        
         //if(Greenfoot.mouseDragged(gpw.getOriginalCard())){
             if(oCard != null){
                if(minfo.getX()>700 && minfo.getX()<800 && minfo.getY()>125 && minfo.getY()<200)
                {                          
                    getWorld().removeObject(oCard);
                    Greenfoot.playSound("swipe.wav");                   
                }  
             }
             
             if(dCard != null){
                if(minfo.getX()>700 && minfo.getX()<800 && minfo.getY()>125 && minfo.getY()<200)
                {                          
                    getWorld().removeObject(dCard);
                    getWorld().addObject(new displaymessage("Sorry,the card entered is invalid!!!! Please insert a valid card"),350,10);
                                      
                }  
             }
        //}
        
    }    
}
