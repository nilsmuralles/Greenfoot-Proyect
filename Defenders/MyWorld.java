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
        Meteor meteor = new Meteor();
        act();
    }
    
    public void generateMeteors()
    {
        Meteor meteor = new Meteor();
        Meteor[] numOfMeteors = new Meteor [Greenfoot.getRandomNumber(10)];
        for (int i = 0; i < numOfMeteors.length; i++) {
            int inicialPositionY = Greenfoot.getRandomNumber(getHeight());
            int inicialPositionX = Greenfoot.getRandomNumber(1500);
            numOfMeteors[i] = new Meteor();
            addObject(numOfMeteors[i], inicialPositionX, inicialPositionY);
        }
    }
    
    public void act() {
        if (numberOfObjects() <= 5) {
            generateMeteors();
        }         
    }
}
