package com.dkit.sd2b.BrianMcKenna;


public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start()
    {
        Bug myBug = new Bug(10);

        myBug.getPosition();
        myBug.move();
        myBug.getPosition();
        myBug.turn();
        myBug.getPosition();
        myBug.move();
        myBug.getPosition();
        myBug.move();
        myBug.getPosition();
        myBug.turn();
        myBug.getPosition();
        myBug.move();
        myBug.move();
        myBug.move();
        myBug.getPosition();

    }
}
