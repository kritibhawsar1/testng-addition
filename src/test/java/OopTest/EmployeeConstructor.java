package OopTest;

class Employee{
    private int psid = 0;
    private String name = "";
    private String dept = "";

    public Employee(){
        System.out.println("Default OopTest.Employee Constructor");
//        System.out.println("OopTest.Employee details:- ");
//        System.out.println("PS ID: "+this.psid);
//        System.out.println("Name: "+this.name);
//        System.out.println("Dept.: "+this.dept);
//        System.out.println();
    }

    public Employee(int psid){
        this.psid = psid;
//        System.out.println("OopTest.Employee details:- ");
//        System.out.println("PS ID: "+this.psid);
//        System.out.println("Name: "+this.name);
//        System.out.println("Dept.: "+this.dept);
//        System.out.println();
    }

    public Employee(String name, String dept){
        this.name = name;
        this.dept = dept;
//        System.out.println("OopTest.Employee details:- ");
//        System.out.println("PS ID: "+this.psid);
//        System.out.println("Name: "+this.name);
//        System.out.println("Dept.: "+this.dept);
//        System.out.println();
    }

    public Employee(int psid, String name, String dept){
        this.psid = psid;
        this.name = name;
        this.dept = dept;
//        System.out.println("OopTest.Employee details:- ");
//        System.out.println("PS ID: "+this.psid);
//        System.out.println("Name: "+this.name);
//        System.out.println("Dept.: "+this.dept);
//        System.out.println();
    }

    public void printEmployeeDetails(){
        System.out.println("OopTest.Employee details: ");
        System.out.println("PS ID: "+this.psid);
        System.out.println("Name: "+this.name);
        System.out.println("Dept.: "+this.dept);
        System.out.println();
    }
}

public class EmployeeConstructor {
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee(45341374);
        e2 = new Employee("Kriti Bhawsar", "Enterprise Technology");
        Employee e3 = new Employee(45341374, "Kriti Bhawsar", "Enterprise Technology");
        System.out.println("PRINTING EMPLOYEE DETAILS THROUGH METHOD CALLING");
        e1.printEmployeeDetails();
        e2.printEmployeeDetails();
        e3.printEmployeeDetails();
    }
}
