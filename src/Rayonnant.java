/**
 * Created by fl0 on 04/09/2014.
 */
public class Rayonnant extends Heater {

    private double setPoint;

    public Rayonnant() {
       
    }

    public double getSetPoint() {
        return setPoint;
    }

    public void setSetPoint(double setPoint) {
        this.setPoint = setPoint;
    }

    @Override
    public String toString() {

        String precedent = super.toString();
        return precedent + " ("  + setPoint + ")";
    }
}
