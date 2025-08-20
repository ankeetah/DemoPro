package errorsTrial;

public class EnterInputs{
    public static void main(String[] args){
        InputValidator inputval = new InputValidator();
        try{
            inputval.validate("  ");
        } catch(CheckInputs e){
            System.out.println(e.geterrorcode());
        }
        

    }

}
