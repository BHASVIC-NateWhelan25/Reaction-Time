import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{

    /**
     * Constructor for objects of class Play.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
    }
    public void createButtons(World main) {
        ExitButton exitButton = new ExitButton(main); // button to leave game menu
        addObject(exitButton, 200, 350);
        ExitText exitText = new ExitText(); // text for the exit button
        addObject(exitText, 200, 350);
        TimedButton timedButton  = new TimedButton(); // adds the main reaction time button
        addObject(timedButton , 200, 150);
        ResetButton resetButton  = new ResetButton(timedButton); // adds a button to reset buttons
        addObject(resetButton , 200, 275);
        BestTime bestTime = new BestTime(timedButton); // text for best time
        addObject(bestTime, 350,28);
    }
}
