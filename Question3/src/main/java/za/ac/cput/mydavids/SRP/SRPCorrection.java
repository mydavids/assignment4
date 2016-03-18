package za.ac.cput.mydavids.SRP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class SRPCorrection {

    public int calculation(int num1, int num2, int sym){

        int answer = 0;

        if(sym == '+')
            answer = num1 + num2;
        else if (sym == '-')
            answer = num1 - num2;
        else if (sym == '*')
            answer = num1 * num2;
        else if (sym == '/')
            answer = num1 / num2;

        return answer;
    }
}
