import greenfoot.*;

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala extends Actor
{
    private int band_dir = 0;
    

    public bala(int dir)
    {
        band_dir = dir;
        
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();// Add your action code here.
        checkCollide();
        
        
        /*if(isTouching(balaenemigo.class))
        {
            getWorld().removeObject(this);
            removeTouching(balaenemigo.class);

        }
        if(isTouching(mounstruo.class))
        {
            getWorld().removeObject(this);
            removeTouching(mounstruo.class);

        }
        if(isTouching(balaenemigo.class))
        {
            getWorld().removeObject(this);
            removeTouching(balaenemigo.class);

        }
        if(isTouching(mounstruo1.class))
        {
            getWorld().removeObject(this);
            removeTouching(mounstruo1.class);

        }

        if (this .atWorldEdge()==true)
        {
            getWorld().removeObject(this);
            return;
        }*/

    }

    protected void muevete()
    {
        int band = Greenfoot.getRandomNumber(2);
        int x = getX(), y = getY();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 1:
                //setImage("Balajug1.png");
                setLocation(x+20,y);
                break;
            }
            /*if(isAtEdge())
            {
            getWorld().removeObject(this);
            }*/
        }
        if(band_dir == 2)
        {
            switch(band)
            {
                case 1:
                setImage("Balajug1_i.png");
                setLocation(x-20,y);
                break;
            }

        }/*if(isAtEdge())
        {
        getWorld().removeObject(this);
        }*/
        if(isTouching(balaenemigo.class))
      {
          removeTouching(balaenemigo.class);
          
      }
    }

    public boolean atWorldEdge()
    {
        if (getX() > getWorld().getWidth() - getImage().getWidth() || getY() > getWorld().getHeight() - getImage().getHeight())    

        {    
            return true;    
        }    
        else   
        {    
            return false;
        }    
    }

    private void checkCollide()
    {
        Actor a = this.getOneIntersectingObject(balaenemigo.class);
        Actor b = this.getOneIntersectingObject(mounstruo.class);
        Actor c = this.getOneIntersectingObject(mounstruo1.class);
        Actor d = this.getOneIntersectingObject(mounstruo2.class);
        Actor e = this.getOneIntersectingObject(mounstruo3.class);
        Actor f = this.getOneIntersectingObject(mounstruo4.class);
        Actor g = this.getOneIntersectingObject(mounstruo5.class);
        Actor h = this.getOneIntersectingObject(mounstruo6.class);
        if(a != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(a);
            
        }
        if(b != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(b);
        }
        if(c != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(c);
        }
        if(d != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(d);
        }
        if(e != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(e);
        }
         if(f != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(f);
        }
         if(g != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(g);
        }
        if(h != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(h);
        }
        if(atWorldEdge()==true)
        {
            getWorld().removeObject(this);
        }
    }
    
}