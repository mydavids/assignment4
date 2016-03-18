package za.ac.cput.mydavids.PLK;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class PLKViolationMain {

    public static void main(String[] args){
        int answer;

        PLKClass1 obj1 = new PLKClass1();
        obj1.setNum1(2);
        obj1.setNum2(5);
        PLKClass2 obj2 = new PLKClass2();

        answer = obj2.add(obj1.getNum1(), obj1.getNum2());

        System.out.println(answer);
    }
}
