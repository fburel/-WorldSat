import java.io.Serializable;

/**
 * Created by fl0 on 04/09/2014.
 */
public class SecheServiette extends Heater implements Printable, Serializable{



    private int puissanceSouflerie = 55;


    public int getPuissanceSouflerie() {
        return puissanceSouflerie;
    }

    public void setPuissanceSouflerie(int puissanceSouflerie) {
        this.puissanceSouflerie = puissanceSouflerie;
    }

    @Override
    public double getConsumption() {
        return 0;
    }

    @Override
    public String toString() {
        
        return "seche-serviette de" + puissanceSouflerie + "W";
    }

    @Override
    public String toJSON() {
        return null;
    }
}
