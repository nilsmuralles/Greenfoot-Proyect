import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(910, 584, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Spaceship spaceship = new Spaceship();
        addObject(spaceship,168,307);
        spaceship.setLocation(77,304);
        act();
    }
    
    public void generateMeteors()
    {
        if (numberOfObjects() <= 8) 
        {
            int inicialPositionY = Greenfoot.getRandomNumber(getHeight());
            int inicialPositionX = 1500;
            Meteor met = new Meteor(Greenfoot.getRandomNumber(3)+6);
            addObject(met, inicialPositionX, inicialPositionY);
        }
         
    }
    
    public void act() {
        generateMeteors();
    }
}
