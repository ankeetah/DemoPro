package errorsTrial;

public class InputValidator  {
    // using extends as this is method which may give the error, if on class level then entire class is an exception
    // also as its checked execption the implementation will require the try and catch or the method throws the checkInputs again.
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
