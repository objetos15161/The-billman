import greenfoot.*;

/**
 import greenfoot.*;

/**
 * Write a description of class Facturamamundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facturamamundo2 extends World
{
    /**
     * Constructor for objects of class Facturamamundo.
     * 
     */
  
    private Facturin facturin;
    private gracias mundoGracias;
    public Facturamamundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        facturin = new Facturin();
        mundoGracias = new gracias();
        insertarNave();
        insertarFacturin();
        insertarMounstro();
        insertarcompu();
       
        Greenfoot.playSound("harold.mp3");
    }
    public void insertarFacturin()
    {
        addObject(facturin, 100,550);
    }
    
    public void act()
    {
        if(facturin.getTouchComp())
            Greenfoot.setWorld(mundoGracias);
    
    }
    
    public void insertarNave()
    {
        
    }

  public void insertarMounstro()
  {
       addObject(new mounstruo(), 400,550);
       addObject(new mounstruo1(), 470,550);
       addObject(new mounstruo2(), 540,550);
       addObject(new mounstruo3(), 850,550);
       addObject(new mounstruo4(), 660,550);
       addObject(new mounstruo5(), 720,550);
       addObject(new mounstruo6(), 670,550);
       //addObject(new mounstruo6(), 800,550);
       
       
    }

      public void insertarcompu()
  {
       addObject(new compu(), 740,560);
    }
}

   

    
 