import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resetButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetButton extends Actor
{
    TimedButton button;
    /**
     * Act - do whatever the resetButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ResetButton(TimedButton button){
        makeButton();
        this.button = button;
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            button.reset();
        }
    }
    public void makeButton(){
        GreenfootImage image = new  GreenfootImage(60, 30);
        image.setColor(greenfoot.Color.BLUE);
        image.fill();
        
        Font font = new Font(true,false,11);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("Reset",15,20);
        
        setImage(image);
    }
}
