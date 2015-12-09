import greenfoot.*;

/**
 * Write a description of class Ayudamundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayudamundo extends World
{

    /**
     * Constructor for objects of class Ayudamundo.
     * 
     */
    public Ayudamundo()
    {super(800,600,1);
        addObject(new ayuda1(), 400, 300);
        addObject(new salir(), 725, 450);
        
    }
}
