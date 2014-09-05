import java.io.BufferedReader;
import java.util.Random;

/**
 * Created by fl0 on 01/09/2014.
 */
public abstract class Heater
{

    // Declaration
    private static final int POWER_DEFAULT = 500;


    private DeviceType type;
    private String serial;
    private int power; // en Watt
    private String name;
    private double runningTime; // en secondes






    // Accessors (getters and setters)
    public int getPower()
    {

        return power;
    }

    public double getRunningTime()
    {
        return runningTime;
    }

    public abstract double getConsumption();

    public void setName(String name)
    {
        name = name.toUpperCase();
        this.name = name;
    }

    public String getSerial() {

        return serial;
    }



    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setRunningTime(double runningTime) {
        this.runningTime = runningTime;
    }

    @Override
    public String toString() {
        return name;
    }


}
