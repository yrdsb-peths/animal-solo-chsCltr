import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor that moves left and right, speeds up and slows down,
 * and flips its image based on direction.
 * It creates a translucent image at the start of the dash.
 * 
 * @author (Chase)
 * @version (04/28)
 */
public class Elephant extends Actor
{
    static int speed = 0;
    private GreenfootImage unflippedImage;
    private GreenfootImage flippedImage;
    boolean isFacingLeft = false;

    // For creating the translucent ghost image
    private GreenfootImage ghostImage;
    private int ghostX, ghostY;

    public Elephant()
    {
        unflippedImage = new GreenfootImage("elephant.png");
        flippedImage = new GreenfootImage(unflippedImage);
        flippedImage.mirrorHorizontally();
        setImage(unflippedImage);
    }

    public void act()
    {
        // Movement and acceleration logic
        if(Greenfoot.isKeyDown("right")) {
            move(5);
            setImage(unflippedImage);  // Face right
            isFacingLeft = false;
        }
        if(Greenfoot.isKeyDown("left")) {
            move(-5);
            setImage(flippedImage);  // Face left
            isFacingLeft = true;
        }
        if(Greenfoot.isKeyDown("up")){
            
        }
        if(Greenfoot.isKeyDown("down")){
            
        }
        // Dash logic: Create the translucent image when the dash starts
        if(Greenfoot.isKeyDown("c")) {
            if (!isTouching(Apple.class)) {
                if(isFacingLeft) {
                    move(-25);  // Dash left
                } else {
                    move(25);   // Dash right
                }
            }
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
