package za.ac.cput.mydavids;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class Staff {

    private String staffID;
    //Composition Staff has-a Person
    private Person person;

    public Staff(String name){
        this.person = new Person();
        person.setName(name);
    }

    public Staff(){

    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return person.getName();
    }

    public String getAge() {
        return person.getAge();
    }

}
