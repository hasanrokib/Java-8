public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", emplyId=" + emplyId +
                ", empSalary=" + empSalary +
                ", noOfYrsExp=" + noOfYrsExp +
                '}';
    }

    private String firstName;
    private int emplyId;
    private int empSalary;
    private int noOfYrsExp;
    public Employee(String firstName, int emplyId, int empSalary, int noOfYrsExp) {
        this.firstName = firstName;
        this.emplyId = emplyId;
        this.empSalary = empSalary;
        this.noOfYrsExp = noOfYrsExp;
    }
    public Employee() {


    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEmplyId() {
        return emplyId;
    }

    public void setEmplyId(int emplyId) {
        this.emplyId = emplyId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getNoOfYrsExp() {
        return noOfYrsExp;
    }

    public void setNoOfYrsExp(int noOfYrsExp) {
        this.noOfYrsExp = noOfYrsExp;
    }



}
