import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Main extends World
{
    private Button playButton;
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }

    public void createButtons(World play) {
        playButton = new Button(play); // button for start
        addObject(playButton, 300, 250);
        //Enter test = new Enter();
        //addObject(test,300,100);
        Title title = new Title(); // title text
        addObject(title, 300,100);
        PressMe pressMe = new PressMe(); // text for start button
        addObject(pressMe, 300,250);
        Instructions instructions = new Instructions(); // text for instructions
        addObject(instructions, 300,350);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
}
