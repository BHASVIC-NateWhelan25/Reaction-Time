import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World link;
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(World link){
        makeButton(); // creates the button design
        this.link = link; // allows start button to be linked to the play menu
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link); // allows user to click to enter program
        }
        
    }
    public void makeButton(){
        GreenfootImage image = new  GreenfootImage(200, 100);
        image.setColor(greenfoot.Color.BLUE);
        image.fill();
        setImage(image);
    }
    
}

