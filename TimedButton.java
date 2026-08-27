import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class TimedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimedButton extends Actor
{
    private int state = 0; // state: 0= Not READY, 1= READY, 3= Done
    private long time = 0;//         0= RED,       1= GREEN, 3= BLUE
    private long startTime;
    private long endTime;
    private int timer;
    private long average;
    private long best;
    ArrayList<Long> times = new ArrayList<>(); // array of times
    /**
     * Act - do whatever the TimedButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TimedButton(){
        makeButton();
        setTimer();
    }
    public void act()
    {
        // Add your action code here.
        if (state==1){ // if in state 1 changes the button to green
            changeButton();
        }
        if (Greenfoot.mouseClicked(this)&&state==1){ // to allow user to click on green button
            state = 3;
            endTime = System.currentTimeMillis();
            finalButton();
        }
        if (timer==0&&state==0){ // turns button to state 1 if timer over
            state=1;
            startTime = System.currentTimeMillis();
        }
        timer--;
        
    }
    public long timeDiff(){
        return (endTime-startTime); // calcs time from green button to blue button
    }
    public void makeButton(){ // creation of button
        GreenfootImage image = new  GreenfootImage(200, 100);
        image.setColor(Color.RED);
        image.fill();
        
        Font font = new Font(true,false,24);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("Don't Click!",35,60);
        
        setImage(image);
    }
    public void defaultButton(){ // RED button, default state
        getImage().setColor(Color.RED);
        getImage().fill();
        
        Font font = new Font(true,false,24);
        getImage().setFont(font);
        getImage().setColor(Color.WHITE);
        getImage().drawString("Don't Click!",35,60);

    }
    public void changeButton(){ // Green button, ready to be clicked
        getImage().setColor(Color.GREEN);
        getImage().fill();
        
        Font font = new Font(true,false,24);
        getImage().setFont(font);
        getImage().setColor(Color.WHITE);
        getImage().drawString("Click!",70,60);

    }
    public void finalButton(){ // time displayed on button
        time = timeDiff();
        times.add(time);
        best = checkBest();
        getImage().setColor(Color.BLUE);
        getImage().fill();
        Font font = new Font(true,false,20);
        getImage().setFont(font);
        getImage().setColor(Color.WHITE);
        getImage().drawString("Time: "+time+"ms",45,60);
        
        
    }
    public void addTime(){ // for adding a time to the array
        times.add(time);
    }
    public void reset(){
        state = 0;
        defaultButton();
        setTimer();
    }
    public void setTimer(){
        timer = 50 + Greenfoot.getRandomNumber(200);
    }
    public long checkBest(){
        if(times.size()>0){
            long best = times.get(0);
            long val;
            for(int i=1;i<times.size();i++){
                val = times.get(i);
                if(val<best){
                    best = val;
                }
            }
            return best;
        }
        return 0;
    }

}
