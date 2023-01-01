package main.java.university;

public class UniversityTest
{
    public static void main(String[] args)
    {
        University u = new University();
        Author a1 = new Author();
        Author a2 = new Author();

        Publication j1 = new Journal();
        Publication j2 = new Journal();
        Publication j3 = new Journal();
        Publication j4 = new Journal();

        Publication cp1 = new ConferenceProceeding();
        Publication cp2 = new ConferenceProceeding();
        Publication cp3 = new ConferenceProceeding();
        Publication cp4 = new ConferenceProceeding();

        a1.addPublication(j1);
        a1.addPublication(j2);
        a1.addPublication(cp1);
        a1.addPublication(cp2);

        a2.addPublication(j3);
        a2.addPublication(j4);
        a2.addPublication(cp3);
        a2.addPublication(cp4);

        u.addAuthor(a1);
        u.addAuthor(a2);

        /*Due to the fact I didn't have values for the variables numberOfAuthors and impactFactor, I decided to
          set it to 1000 and 1, so as not to get NaN(Not a number) values */
        System.out.println("The first author's score: " + a1.computeScore());
        System.out.println("The second author's score: " + a2.computeScore());
        System.out.println("University score: " + u.computeScore());
    }
}
