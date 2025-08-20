public class EmpListing {
    private int id;
    private String name;
    private String department;

    // Constructor
    public EmpListing(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // public int getId() {
    // return id;
    // }

    public String getName() {
        return name;
    }

    // public String getDepartment() {
    // return department;
    // }

    // toString for easy printing
    @Override
    public String toString() {
        return id + " " + name + " " + department;
    }

}
