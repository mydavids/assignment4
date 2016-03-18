package za.ac.cput.mydavids.LSP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class LSPViolation implements LSPViolationInterface{

    private int salary = 1000;

    @Override
    public int addCalculation(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public String female() {
        return "I am a girl";
    }

    @Override
    public String male() {
        return "I am a boy";
    }

    public int increaseSalary(int increase){
        return salary + increase;
    }

    public int getSalary(){
        return salary;
    }
}
