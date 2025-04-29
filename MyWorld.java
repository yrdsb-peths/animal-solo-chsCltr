import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
        createApple();
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel,300,200);
    }
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(580);
        addObject(apple, x+10, 0);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
