package task.T17.employee;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String position;



    Employee (String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

   public void premium() {
          if (position.equals("Senior")) {
              System.out.println("1000 dollars");
          } else if (position.equals("Midl")) {
              System.out.println("500 dollars");
          } else if (position.equals("Junior")) {
              System.out.println("250 dollars");
       }

   }

}
