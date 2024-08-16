package task.T9;

public class Person2 {
  String name;
  int age;

  {
   name = "Vadik";
   age = 16;
  }

  Person2 (String name, int age) {
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
