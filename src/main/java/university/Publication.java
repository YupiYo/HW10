package main.java.university;

import java.util.Calendar;

public abstract class Publication
{
    protected String name;
    protected Calendar apparition;
    protected int numberOfAuthors = 1000;
    public abstract double computeScore();
}
