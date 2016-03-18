package za.ac.cput.mydavids.ISP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class ISPViolation1 implements ISPViolationInterface{


    @Override
    public String staffID() {
        return "123";
    }

    public String jobTitle(String title){
        return title;
    }
}
