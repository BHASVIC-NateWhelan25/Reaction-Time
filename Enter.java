import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Actor
{
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enter() {
        GreenfootImage image = new  GreenfootImage(300, 100);
        image.setColor(greenfoot.Color.BLUE);
        image.fill();
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new  GreenfootImage(300, 100);
        image.setColor(greenfoot.Color.BLUE);
        image.fill();
        setImage(image);
    }
}
