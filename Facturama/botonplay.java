import greenfoot.*;

/**
 * Write a description of class botonplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonplay extends Actor
{
    /**
     * Act - do whatever the botonplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound s;

    public botonplay(GreenfootSound m)
    {
        s=m;
    }

    public void act() 
    {
        botonplay();
    }

    private void botonplay()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Facturamamundo());
            Menu2 menu = (Menu2)getWorld();
            menu.detenM(s);
        }
    }
}

// Add your action code here.

