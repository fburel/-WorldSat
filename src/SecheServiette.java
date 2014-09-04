/**
 * Created by fl0 on 04/09/2014.
 */
public class SecheServiette extends Heater {



    private int puissanceSouflerie = 55;


    public int getPuissanceSouflerie() {
        return puissanceSouflerie;
    }

    public void setPuissanceSouflerie(int puissanceSouflerie) {
        this.puissanceSouflerie = puissanceSouflerie;
    }

    @Override
    public String toString() {
        return "seche-serviette de" + puissanceSouflerie + "W";
    }

}
