import com.sun.istack.internal.NotNull;
import com.sun.javafx.beans.annotations.NonNull;

/**
 * Created by fl0 on 04/09/2014.
 */
public class Rayonnant extends Heater {

    private double setPoint;


    public double getSetPoint() {
        return setPoint;
    }

    public void setSetPoint(double setPoint) {
        this.setPoint = setPoint;
    }

    @Override
    public double getConsumption() {
        return 0;
    }



    @Override
    public String toString() {
        return super.toString() + "setpoint = " + setPoint;
    }
}
