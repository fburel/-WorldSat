import acm.program.ConsoleProgram;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends ConsoleProgram
{



    public void run()
    {
        Zone zone = new Zone();

        while (true)
        {
            println();
            println();


            println("**************************");
            int choix = afficherMenuPrinicpal();





            switch (choix)
            {
                case 1  :
                    afficherListeDesRadiateurs(zone);
                    break;
                case 2 :
                    ajouterUnRadiateur(zone);
                    break;
                case 3 :
                    renommerLaZone(zone);
                    break;
                case 0:
                default:
                    return;
            }
        }

    }

    private void renommerLaZone(Zone zone)
    {
        println();
        println();

        String name = readLine("nouveau nom de la zone");
        zone.setName(name);
    }

    private void ajouterUnRadiateur(Zone zone)
    {
        println();
        println();

        println("type:");
        println("1 - Rayonnant");
        println("2 - Seche Serviette");
        int choix = readInt("?:", 1, 2);

        Heater h = null;

        switch (choix)
        {
            case 1:
                h = new Rayonnant();
                break;
            case 2:
                h = new SecheServiette();
                break;
        }

        String name = readLine("nom du radiateur?");
        h.setName(name);

        zone.getHeaters().add(h);

        // savoir si un objet est instance d'une classe
        if(h instanceof Rayonnant)
        {
            Rayonnant r = (Rayonnant) h;
            r.setSetPoint(35);
        }

    }

    private void afficherListeDesRadiateurs(Zone zone) {

        println();
        println();


        for (Heater h : zone.getHeaters())
        {
            println(h.toString());
        }
    }

    private int afficherMenuPrinicpal()
    {
        println("1 - Afficher la liste des radiateurs");
        println("2 - Ajouter un radiateur");
        println("3 - Renommer la zone");
        println();
        println("0 - Quitter");



        return readInt("? :", 0, 3);
    }


}
