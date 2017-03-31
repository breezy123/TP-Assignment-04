package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
public class Engine {

    private int capacity;
    private double litersOfOil;

    public Engine(int cc, double oilInLiters)
    {
        this.capacity = cc;
        this.litersOfOil = oilInLiters;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLitersOfOil() {
        return litersOfOil;
    }

    public void setLitersOfOil(double litersOfOil) {
        this.litersOfOil = litersOfOil;
    }
}
