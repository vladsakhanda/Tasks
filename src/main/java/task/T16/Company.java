package task.T16;

import java.util.Arrays;

public class Company {
    static private String[] departments = {};


    public void addDepartment(String nameDepartament) {
        departments = Arrays.copyOf(departments, departments.length + 1);
        departments[departments.length - 1] = nameDepartament;
    }


    public void displayDepartments() {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Department: " + departments[i]);

        }
    }


    public static class Department {

        private String name;
        private String[] workstations = {};


        public Department(String name) throws Exception {
            this.name = name;

            for (int i = 0; i < departments.length; i++) {
                System.out.println(Arrays.toString(departments));
                if (name.equals(departments[i])) {
                    throw new Exception();
                }
            }
            departments = Arrays.copyOf(departments, departments.length + 1);
            departments[departments.length - 1] = name;
        }


        public void addWorkstation(String workstation) {
            workstations = Arrays.copyOf(workstations, workstations.length + 1);
            workstations[workstations.length - 1] = workstation;

        }

        public void delWorkstation(String workstation) throws Exception {
            // Зробити нормально
            for (int i = 0; i < workstations.length; i++) {
                if (workstation.equals(workstations[i])) {
                    for (int j = i + 1; j < workstations.length; j++) {
                        workstations[j - 1] = workstations[j];

                    }
                    workstations = Arrays.copyOf(workstations, workstations.length - 1);
                    break;

                } else if (i == workstations.length -1) {
                    throw new Exception("Такого елемента не існує");
                }
            }

        }


        public void displayWorkstations() {
            System.out.println("Workstations in " + name + ":");
            for (int i = 0; i < workstations.length; i++) {
                System.out.println(" - " + workstations[i]);
            }
        }
    }

}
