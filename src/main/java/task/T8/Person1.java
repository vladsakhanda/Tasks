package task.T8;

 class Person1 {
     String name;
     int age;

     {
         name = "Roma";
         age = 14;
     }

     Person1 (String name, int age) {
         this.name = name;
         this.age = age;
     }


     void info () {
         System.out.printf("Name - %s, Age - %d\n", name, age);
     }
     void id () {
         System.out.println(name+age);
     }

}
