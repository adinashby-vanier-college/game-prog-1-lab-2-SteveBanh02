// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{
    private int crabEaten;

    /**
     * //number of crab eaten is 0
     */
    public Lobster()
    {
        crabEaten = 0;
    }

    /**
     * //see if lobster and crab are on the same location
     */
    public boolean foundCrab()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        return crab != null;
    }

    /**
     * //eat the crab if it is on the same location
     */
    public void eatCrab()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (crab != null) {
            getWorld().removeObject(crab);
            crabEaten = crabEaten + 1;
        }
    }

    /**
     * //see how many crab eaten
     */
    public int getCrabEaten()
    {
        return crabEaten;
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if (Greenfoot.isKeyDown("a")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(-4);
        }
        if (foundCrab()) {
            eatCrab();
        }
    }
}
