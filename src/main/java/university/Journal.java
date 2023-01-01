package main.java.university;

public class Journal extends Publication
{
    protected String journalName;
    protected double impactFactor = 1;

    @Override
    public double computeScore()
    {
        return (impactFactor * 0.5) / numberOfAuthors;
    }
}
