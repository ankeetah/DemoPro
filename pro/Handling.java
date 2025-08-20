import java.util.ArrayList;

public class Handling {
    public static void main(String[] args) {
        System.out.println("fjhhjh");
        // Employee emp = new Employee();
        Employee empdata = new Employee();
        ArrayList<EmpListing> empList = empdata.readEmployeeList();

        FilterData fd = new FilterData();
        ArrayList<EmpListing> unique = fd.NoDuplicates(empList);
        for (EmpListing emp : unique) {
            System.out.println(emp);
        }

    }

}
