package za.ac.cput.mydavids.PLK;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class PLKCorrectionMain {

    public static void main(String[] args){
        int answer;

        PLKClass1 obj = new PLKClass1();
        obj.setNum1(1);
        obj.setNum2(5);

        answer = obj.getNum1() + obj.getNum2();

        System.out.println(answer);
    }
}
