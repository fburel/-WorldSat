import java.util.Random;

/**
 * Created by fl0 on 01/09/2014.
 */
public class Heater
{

    // Declaration
    private static final int POWER_DEFAULT = 500;


    private String serial;
    private int power = POWER_DEFAULT; // en Watt
    private String name;
    private double runningTime = 3600 * 3; // en secondes

    // Accessors (getters and setters)
    public int getPower()
    {

        return power;
    }

    public double getRunningTime()
    {
        return runningTime;
    }

    public double getConsumption() // en Joule
    {
        return power * runningTime;
    }

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
