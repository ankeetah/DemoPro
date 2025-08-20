package errorsTrial;

public class CheckRun {
    public static void main(String[] args){
        validateRun(null);
    }

    public static void validateRun(String name){
        if(name == null){
            throw new ClearRun("name cant be blank");
        }
    }

}
