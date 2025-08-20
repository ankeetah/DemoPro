package polygons;

public class wishfulName extends userApply{
    @Override
    String chosenName(String wishedname) {
        // TODO Auto-generated method stub
        return "Marek";
    }

    @Override
    public String givenName() {
        // TODO Auto-generated method stub
        System.out.println("this was given name " + super.givenName());
        return "Marek would have been my wish";
    }
}
