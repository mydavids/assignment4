package za.ac.cput.mydavids;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class Person {

    private String name;
    private String age = "Age of Person";

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
}
