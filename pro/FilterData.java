
import java.util.*;

public class FilterData {
    public ArrayList<EmpListing> NoDuplicates(ArrayList<EmpListing> Employee){
        
            ArrayList <EmpListing> unrepeatedList = new ArrayList<>();
            Set<String> seen = new HashSet<>();
            for(EmpListing employee: Employee){
                String key = employee.getName();
                if(!seen.contains(key)){
                    seen.add(key);
                    unrepeatedList.add(employee);
                }
            }



            return unrepeatedList;
    }

    
}
