package errorsTrial;

public class InputValidator  {

    public void validate(String input) throws CheckInputs{
        if(input == null){
            throw new CheckInputs(100);
        } else if (!input.matches("[a-zA-Z]+")) {
            throw new CheckInputs(300);
        } else if (input.isBlank()) {
            throw new CheckInputs(350);            
        }

        System.out.println("Valid Input");
    }

}
