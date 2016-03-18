package za.ac.cput.mydavids.ISP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class ISPCorrection2 implements ISPCorrectionInterface{

    @Override
    public String staffID() {
        return "123";
    }

    @Override
    public String jobTitle(String title) {
        return title;
    }
}
