import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    int accell = 0;
    
    public void act()
    {
        accell++;
        setLocation(getX(), getY()+accell/15);
    }
}
