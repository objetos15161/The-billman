import greenfoot.*;

/**
 * Write a description of class ayuda1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ayuda1 extends Actor 
   { /**
     * Act - do whatever the ayuda1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu2());
        }

    }    
}
