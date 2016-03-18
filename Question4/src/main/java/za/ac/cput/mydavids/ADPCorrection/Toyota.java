package za.ac.cput.mydavids.ADPCorrection;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class Toyota implements Vehicle {

    @Override
    public String getModel() {
        return "522i";
    }

    @Override
    public String getMake() {
        return "Toyota";
    }

    @Override
    public int getWeight() {
        return 5000;
    }
}
