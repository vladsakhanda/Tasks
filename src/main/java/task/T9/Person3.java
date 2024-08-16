package task.T9;

public class Person3 {
  String name;
  int age;

  {
   name = "Max";
   age = 19;
  }

  Person3 (String name, int age) {
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
