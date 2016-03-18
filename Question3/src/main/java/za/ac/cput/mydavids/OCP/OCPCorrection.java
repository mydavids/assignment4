package za.ac.cput.mydavids.OCP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class OCPCorrection implements OCPCorrentInterface{

    String name = "Michael";
    String surname = "Jackson";
    int age = 54;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void changeName(){
        this.name = "George";
    }

    public void changeSurname(){
        this.surname = "Benson";
    }

    public void changeAge(){
        this.age = 59;
    }
}
