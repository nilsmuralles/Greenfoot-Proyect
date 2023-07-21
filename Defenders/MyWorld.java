import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class MyWorld extends World
{
    public static Counter lifeCount = new Counter();
    public static Counter score = new Counter();
    public static GreenfootSound backgroundMusic;
    public static Label scoreText = new Label("Puntaje", 32);
    public static Label lifeText = new Label("Vidas", 32);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(910, 584, 1);
        addObject(lifeCount, 750 ,500);
        lifeCount.setValue(5);
        addObject(lifeText, 675, 475);
        lifeText.setFillColor(Color.BLACK);
        lifeText.setLineColor(Color.BLUE);
        
        addObject(score, 150, 75);
        addObject(scoreText, 80, 100);
        scoreText.setFillColor(Color.BLACK);
        scoreText.setLineColor(Color.BLUE);
        prepare();
        
        backgroundMusic = new GreenfootSound("disparo.wav");
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(45);
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
