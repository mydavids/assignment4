package za.ac.cput.mydavids.LSP;

/**
 * Created by Yusiry Davids on 3/18/2016.
 */
public class LSPCorrection implements LSPCorrectionInterface {
    @Override
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subNumbers(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
