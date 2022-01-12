class Employee {

    private int baseHours = 40;
    private double baseSalary = 40000.0;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";

    public int getHours() {
        return baseHours;
    }

    public double getSalary() {
        return baseSalary;
    }

    public int getVacationDays() {
        return baseVacationDays;
    }

    public String getVacationForm() {
        return baseVacationForm;
    }

    public final void setBaseHours(int hours) {
        baseHours = hours;
    }

    public final void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public final void setBaseVacationDays(int days) {
        baseVacationDays = days;
    }

    public final void setBaseVacationForm(String form) {
        baseVacationForm = form;
    }
}

public class Janitor extends Employee {
    public int getHours() {
        return super.getHours();
    }

    public double getSalary() {
        return super.getSalary();
    }

    public int getVacationDays() {
        return super.getVacationDays();
    }

    public String getVacationForm() {
        return super.getVacationForm();
    }

    public void clean() {
        System.out.println("Workin' for the man.");

    }

    public static void main(String[] args) {

        Janitor jtr = new Janitor();
        jtr.getHours();

        jtr.getSalary();

        jtr.getVacationDays();

        jtr.getVacationForm();

        jtr.clean();

        System.out.println(jtr);

    }
}