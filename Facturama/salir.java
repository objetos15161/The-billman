import greenfoot.*;

/**
 * Write a description of class salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salir extends Actor
{
    /**
     * Act - do whatever the salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        salir();
    }
        private void salir()
        {
            if (Greenfoot.mouseClicked(this))
            {
                Greenfoot.playSound("botonjugar.mp3");
                Greenfoot.setWorld(new Portada());
                Greenfoot.stop();
            }
        
        
   // Add your action code here.
    }    
}
