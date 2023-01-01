package main.java.university;

public class ConferenceProceeding extends Publication
{
    protected String volumeName;
    protected boolean indexed;
    @Override
    public double computeScore()
    {
        double score;
        if (indexed)
        {
             score = 0.25 / numberOfAuthors;
        }
        else
        {
            score = 0.2 / numberOfAuthors;
        }
        return score;
    }
}
