package main.java.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University
{
    protected String name;
    protected String location;
    protected Author[] authors = new Author[0];

    void addAuthor(Author a)
    {
        List<Author> authors_list = new ArrayList<>(Arrays.asList(authors));
        authors_list.add(a);
        this.authors = authors_list.toArray(authors);
    }
    double computeScore()
    {
        double sum = 0;
        for (Author a:authors)
        {
            sum += a.computeScore();
        }
        return sum;
    }
}
