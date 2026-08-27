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
        makeButton();
        this.link = link;
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
        
    }
    public void makeButton(){
        GreenfootImage image = new  GreenfootImage(200, 100);
        image.setColor(greenfoot.Color.BLUE);
        image.fill();
        setImage(image);
    }
    
}

