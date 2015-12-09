import greenfoot.*;

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends World
{

    /**
     * Constructor for objects of class Menu2.
     * 
     */
    public Menu2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     
        super(900, 600, 1); 
        GreenfootSound sound =new GreenfootSound("pilot.mp3");
        sound.play();
        addObject(new botonplay(sound), 470, 320);
        addObject(new ayuda(), 185, 320);
        //addObject(new Boton_Record(), 400, 390);
        addObject(new salir(), 725, 320);
        //addObject(new Titulo(), 400, 90);
        
        
   
    }
    public void detenM(GreenfootSound m)
    {
        m.stop();
    
}
}
