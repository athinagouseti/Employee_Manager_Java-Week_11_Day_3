package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private int salary;

    public Employee(String name, int NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(double i){
        return i += this.salary;
    }

    public int payBonus(){
        int bonusAmount = (this.salary / 100) * 1;
                return bonusAmount;
    }

}
