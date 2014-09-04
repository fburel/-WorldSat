import java.awt.*;
import java.util.ArrayList;

/**
 * Created by fl0 on 02/09/2014.
 */
public class Zone
{
    /* SINGLETON */

    private static Zone instance;

    public static Zone getInstance()
    {
        if(instance == null)
        {
            instance = new Zone();
        }
        return instance;
    }

    private Zone() {
        name = "toto";
    }

    private String name;

    private ArrayList<Heater> heaters = new ArrayList<Heater>();


    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public ArrayList<Heater> getHeaters() {
        return heaters;
    }

}