import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Employee {

    public ArrayList<EmpListing> readEmployeeList() {
        ArrayList<EmpListing> empdata = new ArrayList<>();

        try (BufferedReader rd = new BufferedReader(new FileReader("EmployeeList.txt"))) {
            String line;
            while ((line = rd.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String dept = parts[2];
                    empdata.add(new EmpListing(id, name, dept));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // for (EmpListing item : empdata) {
        //     System.out.println(item);
        // }

        return empdata;

    }

}
