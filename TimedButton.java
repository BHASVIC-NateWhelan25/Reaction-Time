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
    private int state = 0; // state: 0 = Not READY, 1= READY, 3=Done
    private long time = 0;
    private long startTime;
    private long endTime;
    private int timer;
    private long average;
    private long best;
    ArrayList<Long> times = new ArrayList<>();
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
        if (state==1){
            changeButton();
        }
        if (Greenfoot.mouseClicked(this)&&state==1){
            state = 3;
            endTime = System.currentTimeMillis();
            finalButton();
        }
        if (timer==0&&state==0){
            state=1;
            startTime = System.currentTimeMillis();
        }
        timer--;
        
    }
    public long timeDiff(){
        return (endTime-startTime);
    }
    public void makeButton(){
        GreenfootImage image = new  GreenfootImage(200, 100);
        image.setColor(Color.RED);
        image.fill();
        
        Font font = new Font(true,false,24);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("Don't Click!",35,60);
        
        setImage(image);
    }
    public void defaultButton(){
        getImage().setColor(Color.RED);
        getImage().fill();
        
        Font font = new Font(true,false,24);
        getImage().setFont(font);
        getImage().setColor(Color.WHITE);
        getImage().drawString("Don't Click!",35,60);

    }
    public void changeButton(){
        getImage().setColor(Color.GREEN);
        getImage().fill();
        
        Font font = new Font(true,false,24);
        getImage().setFont(font);
        getImage().setColor(Color.WHITE);
        getImage().drawString("Click!",70,60);

    }
    public void finalButton(){
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
    public void addTime(){
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
