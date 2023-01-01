package main.java.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author
{
    protected String name;
    protected Publication[] publications = new Publication[0];
    protected double sum;
    void addPublication(Publication p)
    {
        List<Publication> publications_list = new ArrayList<>(Arrays.asList(publications));
        publications_list.add(p);
        this.publications = publications_list.toArray(publications);
    }
    double computeScore()
    {
        double sum = 0;
        for (Publication p:publications)
        {
            sum += p.computeScore();
        }
        return sum;
    }
}
