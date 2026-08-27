import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class bestTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BestTime extends Actor
{
    private long best;
    TimedButton button;
    /**
     * Act - do whatever the bestTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BestTime(TimedButton button){
        setImage(new GreenfootImage("Best Time:\nN/A", 30, Color.WHITE,new Color(0, 0, 0, 150)));
        this.button = button;
    }
    public void act()
    {
        // Add your action code here.
        if(best!=0){
            setImage(new GreenfootImage("Best Time:\n"+best+"ms", 30, Color.WHITE,new Color(0, 0, 0, 150)));
        }
        else{
            setImage(new GreenfootImage("Best Time:\nN/A", 30, Color.WHITE,new Color(0, 0, 0, 150)));
        }
        best = button.checkBest();
    }
    public void checkTimes(){
        //World play = getWorld();
        //Play playWorld = (Play)play;
        //best = playWorld.checkBest();
    }

}
