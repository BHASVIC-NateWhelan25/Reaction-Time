import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    public Main main;
    public Play play;
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        main = new Main(); //creates both main and play menus
        play = new Play();
        
        main.createButtons(play); //adds the button to both play and menu
        play.createButtons(main);
        
        Greenfoot.setWorld(main); 
    }
}
