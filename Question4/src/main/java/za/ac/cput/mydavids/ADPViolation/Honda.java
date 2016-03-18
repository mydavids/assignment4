package za.ac.cput.mydavids.ADPViolation;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class Honda implements Vehicle {

    @Override
    public String getModel() {
        return "Vtech";
    }

    @Override
    public String getMake() {
        return "Honda";
    }

    @Override
    public int getWeight() {
        return 4500;
    }
}
