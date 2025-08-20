package errorsTrial;

public class CheckInputs extends Exception{
    private int errorcode;
    public CheckInputs(int errorcode){
        super("" + errorcode); // super(errorcode) this is int and the constructor of the Exception is not ready for this.
        this.errorcode = errorcode;
    }

    public int geterrorcode(){
        return errorcode;
    }
}
