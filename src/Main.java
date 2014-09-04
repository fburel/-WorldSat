import acm.program.ConsoleProgram;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends ConsoleProgram
{

    @Override
    public void run()
    {

        Heater h = new Heater();


        println(h.toString());


        Heater h2 = new Heater("super");

        println(h2.toString());
    }




    /*
        public void run()
        {
            Zone zone = Zone.getInstance();

            while (true)
            {
                println();
                println();


                println("**************************");
                int choix = afficherMenuPrinicpal();





                switch (choix)
                {
                    case 1  :
                        afficherListeDesRadiateurs();
                        break;
                    case 2 :
                        ajouterUnRadiateur();
                        break;
                    case 3 :
                        renommerLaZone();
                        break;
                    case 0:
                    default:
                        return;
                }
            }

        }

    */
    private void renommerLaZone()
    {
        println();
        println();

        String name = readLine("nouveau nom de la zone");
        Zone.getInstance().setName(name);
    }

    private void ajouterUnRadiateur()
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

        Zone.getInstance().getHeaters().add(h);

        // savoir si un objet est instance d'une classe
        if(h instanceof Rayonnant)
        {
            Rayonnant r = (Rayonnant) h;
            r.setSetPoint(35);
        }

    }

    private void afficherListeDesRadiateurs() {

        println();
        println();


        for (Heater h : Zone.getInstance().getHeaters())
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
