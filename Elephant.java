import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here. no
 * 
 * @author (Chasec) 
 * @version (04/28)
 */
public class Elephant extends Actor
{
    static int speed = 0;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            speed+=2;
        }
        if(Greenfoot.isKeyDown("left")){
            speed-=2;
        }
        eat();
        move(speed/2);
        if(speed<0)
        {
            speed++;
        }
        else if(speed>0)
        {
            speed--;
        }
    }
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}