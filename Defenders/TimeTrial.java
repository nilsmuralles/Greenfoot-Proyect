import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeTrial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeTrial extends World
{
    public static TTCounter ttCounter = new TTCounter();
    public static Label ttScoreText = new Label("Puntaje", 32);
    public static SimpleTimer timer = new SimpleTimer();
    public static TTCounter timeCount = new TTCounter();
    /**
     * Constructor for objects of class TimeTrial.
     * 
     */
    public TimeTrial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(910, 584, 1);
        addObject(ttCounter, getWidth()/2, 75);
        addObject(ttScoreText, getWidth()/2 - 60, 100);
        ttScoreText.setFillColor(Color.BLACK);
        ttScoreText.setLineColor(Color.RED);
        
        addObject(timeCount, getWidth()/2, getHeight() - 60);
        timer.mark();
        prepare();
    }
    
    public void prepare()
    {
        act();
        Spaceship spaceship = new Spaceship();
        addObject(spaceship,168,307);
        spaceship.setLocation(77,304);
    }
    
    public void generateMeteors()
    {
        if (numberOfObjects() <= 8) 
        {
            int inicialPositionY = Greenfoot.getRandomNumber(getHeight());
            int inicialPositionX = 1500;
            Meteor met = new Meteor(Greenfoot.getRandomNumber(10)+6);
            addObject(met, inicialPositionX, inicialPositionY);
        }
         
    }
    
    public void act() {
        timeCount.setValue(timer.millisElapsed() / 1000);
        generateMeteors();
        if (timeCount.getValue() == 60) {
            MyWorld.score.setValue(0);
            Greenfoot.setWorld(new Menu());
        }
    }
}
