import java.util.ArrayList;

/**
 * Created by fl0 on 04/09/2014.
 */
public class Tools {

    public static double moyenne(ArrayList<Integer> notes)
    {
        int somme = 0;
        for(Integer i : notes)
        {
            somme += i;
        }
        return somme / notes.size();
    }

    public static double ecartType(ArrayList<Integer> notes)
    {

        String s = "toto";

        double moyenne = moyenne(notes);

        double deviation = 0;

        for(int i = 0 ; i < notes.size(); i++)
        {
            int note = notes.get(i);
            deviation += (note - moyenne) * (note - moyenne);
        }

        deviation /= notes.size();

        return Math.sqrt(deviation);

    }
}
