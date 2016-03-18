package za.ac.cput.mydavids;

/**
 * Created by Yusiry Davids on 3/16/2016.
 */
public class Staff extends Person {

    private String staffID;
    private String age = "Age of Staff";

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getAge() {
        return age;
    }

}
