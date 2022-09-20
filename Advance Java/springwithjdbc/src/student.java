
public class student {
    private int id;  
    private String name;  
    private float salary; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

//no-arg and parameterized constructors
//getters and setters
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public student(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public student() {
    }
}
