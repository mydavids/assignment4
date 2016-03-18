package za.ac.cput.mydavids.ISP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class ISPViolation2 implements ISPViolationInterface {

    @Override
    public String staffID() {
        return "123";
    }

    public int salary(int sal){
        return sal;
    }
}
