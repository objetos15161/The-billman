import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facturin extends Actor
{
    private int speed = 5;
    private int verticalSpeed = 0;
    private int exel = 2;
    private int jump = -16;
    private int floor=544;
    private final int left=1;
    private final int right=2;
    private int dir=right;
    private int pasos = 1;
    private boolean tocaCompu;
    int vidas;
    Label lVidas;
    
    
    
   public Facturin()
   {
      
       pasos = 1;
       tocaCompu = false;
       vidas =3;
        lVidas=new Label("LIFES THAT YOU HAVE : 3",30);
       
   }
     
    public void act() 
    {
        keyCheck();
        checkFall();
        getWorld().removeObject(lVidas);
        lVidas=new Label("LIFES THAT YOU HAVE: " + Integer.toString(vidas),30);
        getWorld().addObject(lVidas,200, 100);
        if(isTouching(balaenemigo.class))
        {
            removeTouching(balaenemigo.class);
            vidas--;
            
            if(vidas==0)
            {
             removeTouching(Facturin.class);

            getWorld().addObject(new morire(),300,200);
            removeTouching(balaenemigo.class);
            Greenfoot.stop();
            
            }
        }
        if(isTouching(compu.class))
        {
           tocaCompu = true;
        }
       
           
        //System.out.println(pasos);
    }

    public boolean getTouchComp()
    {
        return tocaCompu;
    }
    
    /**
     * Key Check
     */
    private void keyCheck()
    {
        int direc = 1;
        if(Greenfoot.isKeyDown("F"))
        {
            getWorld().addObject(new bala(direc),getX(),getY());
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("right"))  
        {  
            dir=right; 
            if(pasos==1)
            {
                setLocation ( getX() + speed, getY() );
                if(onGround())
                    setImage("FacturinDer.png");
                else
                    setImage("FacturinDer.png");
            }
            if(pasos==2)
            {
                setLocation( getX() + speed, getY() );
                if(onGround())
                    setImage("FacturinDerCam.png");      
                else
                    setImage("FacturinDer.png");
            }
            if(pasos==3)
            {
                setLocation( getX() + speed, getY() );
                if(onGround())
                    setImage("FacturinDerCam2.png");
                else
                    setImage("FacturinDer.png");
            }
            if(pasos>=3)
                pasos=1;
            else
                pasos++;
                direc = 1;
            }
      
          
        if(Greenfoot.isKeyDown("left"))  
        {  
            dir=left; 
            if(pasos==1)
            {
                setLocation ( getX() - speed, getY() );
                if(onGround())
                    setImage("FacturinIzq.png");
                else
                    setImage("FacturinIzq.png");
            }
            if(pasos==2)
            {
                setLocation( getX() - speed, getY() );
                if(onGround())
                    setImage("facturinIzqsalto.png");      
                else
                    setImage("FacturinIzq.png");
            }
            if(pasos==3)
            {
                setLocation( getX() - speed, getY() );
                if(onGround())
                    setImage("facturinIzqsalto2.png");
                else
                    setImage("FacturinIzq.png");
            }
            if(pasos>=3)
                pasos=1;
            else
                pasos++;
                direc =2;
        }  
          
        if(Greenfoot.isKeyDown("up"))  
        {  
            if(onGround())
            {
                verticalSpeed = jump; 
                fall();                
            }
        }
        
    }
    
    public int getFacturinDir()
    {
        return(dir);
    }
    
    /**
     * Fall
     */
    private void fall()  
    {  
        setLocation (getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + exel;  
    }
    
    /**
     * On Ground
     */
    private boolean onGround()  
    {  
        if(getY()>=floor)
            return true;
        else
            return false;
    }
    
    /**
     * Check Fall
     */
    private void checkFall()  
    {  
        if(onGround()) 
            verticalSpeed=0;
        else
            fall();
  
    } 
  
}
    
   
  
   
     