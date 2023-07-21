import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    flechamenu flecha= new flechamenu();
    private int opcion=0;
    
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(910, 584, 1); 
        prepararMundo();
    }
    
    private void prepararMundo() {
        addObject(new jugarmenu(), 400,250);
        addObject(new salirmenu(), 400,350);
        addObject(new flechamenu(), 250,250);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("W") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("S") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(250,250 +(opcion*100));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                    case 1:
                        Greenfoot.stop();
                        break;
            }
        }
    }
}
