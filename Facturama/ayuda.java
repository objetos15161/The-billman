import greenfoot.*;

/**
 * Write a description of class ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ayuda extends Actor
{
     public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Ayudamundo());
       
        }

    }    
}
