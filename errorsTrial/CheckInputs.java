package errorsTrial;

public class CheckInputs extends Exception{
    private int errorcode;
    public CheckInputs(int Errorcode){
        super("" + Errorcode); // super(errorcode) this is int and the constructor of the Exception is not ready for this.
        this.errorcode = Errorcode;
    }

    public int geterrorcode(){
        return errorcode;
    }
}
