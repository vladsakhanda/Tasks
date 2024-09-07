package task.T16;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();


        Company.Department itDepartment = new Company.Department("IT");
        Company.Department hrDepartment = new Company.Department("HR");


        itDepartment.addWorkstation("Workstation 1");
        itDepartment.addWorkstation("Workstation 2");

        hrDepartment.addWorkstation("Workstation 1");
        hrDepartment.addWorkstation("Workstation 2");


        company.addDepartment("it");
        company.addDepartment("hr");


        company.displayDepartments();

        itDepartment.delWorkstation("Workstation 1");

        itDepartment.displayWorkstations();
        hrDepartment.displayWorkstations();
    }
}
