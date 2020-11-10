package com.dkit.sd2b.BrianMcKenna;

public class Bug
{
    // Instance variables (fields)
    // Code combination required move the bug
    private int initialPosition;
    private BugState direction = BugState.TURN_RIGHT;

    public Bug(int initialPosition)
    {
        this.initialPosition = initialPosition;
    }

    public void turn()
    {
        if(this.direction == BugState.TURN_LEFT)
        {
            this.direction = BugState.TURN_RIGHT;
        }
        else {
            this.direction = BugState.TURN_LEFT;
        }
    }

    public void move()
    {
        if(this.direction == BugState.TURN_RIGHT)
        {
            this.initialPosition += 1;
        }
        if(this.direction == BugState.TURN_LEFT)
        {
            this.initialPosition -= 1;
        }
    }

    public void getPosition()
    {
        System.out.println("Current position: " + this.initialPosition);
    }
}
