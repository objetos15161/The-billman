import greenfoot.*;

/**
 * Write a description of class botonPortda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonPortda extends Actor
{
    /**
     * Act - do whatever the botonPortda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

if(Greenfoot.mouseClicked(this))
        {
           
            Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Menu2());
     
  
            
           
        }
}// Add your action code here.
}
