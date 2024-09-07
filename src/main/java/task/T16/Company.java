package task.T16;

import java.util.Arrays;

public class Company {
    static private String[] departments = {};


    public void addDepartment(String nameDepartament) {
        departments = Arrays.copyOf(departments, departments.length +1);
        departments[departments.length -1] = nameDepartament;
    }


    public void displayDepartments() {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Department: " + departments[i]);

        }
    }


    public static class Department {
        private String name;
        private String[] workstations = {};


        public Department(String name) {
            this.name = name;
        }





        public void addWorkstation(String workstation) {
            workstations = Arrays.copyOf(workstations, workstations.length +1);
            workstations[workstations.length -1] = workstation;

        }

        public void delWorkstation(String workstation) {
            int index = 1;
            for (int i = 0; i < workstations.length; i++) {
                if (workstation.equals(workstations[i])) {
                    index = i;

                }
            }

            for (int j = index+1; j < workstations.length; j++) {
                workstations[j-1] = workstations[j];

            }

            workstations = Arrays.copyOf(workstations, workstations.length -1);

        }




        public void displayWorkstations() {
            System.out.println("Workstations in " + name + ":");
            for (int i = 0; i < workstations.length; i++) {
                System.out.println(" - " + workstations[i]);
            }
        }
    }

}
