import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here. no
 * 
 * @author (Chasec) 
 * @version (04/28)
 */
public class Elephant extends Actor
{
    static int speed = 2;
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(speed);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-speed);
        }
        eat();
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