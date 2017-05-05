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
                    displaymessage d = new displaymessage("Credit card scan was succcessful.Please enter zip code");
                    getWorld().addObject(d,350,100);
                    Greenfoot.delay(60);
                    getWorld().removeObject(d);
                    
                    /*
                    
                MouseInfo mouse = Greenfoot.getMouseInfo();
                if (Greenfoot.mouseClicked(null))
                {
                if (mouse.getX() >= 225 &&
                mouse.getX() <= 275 &&
                mouse.getY() >= 375 &&
                 mouse.getY() <= 425)
                {
                    displaymessage d = new displaymessage("1");
                }
}

                    
                    
                    
                    */
                }  
             }
             
             if(dCard != null){
                if(minfo.getX()>700 && minfo.getX()<800 && minfo.getY()>125 && minfo.getY()<200)
                {                          
                    getWorld().removeObject(dCard);
                    displaymessage de = new displaymessage("Duplicate credit card");
                    getWorld().addObject(de,350,100);
                    Greenfoot.delay(60);
                    getWorld().removeObject(de);
                                      
                }  
             }
        //}
        
    }    
}
