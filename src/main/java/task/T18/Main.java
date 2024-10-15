package task.T18;

public class Main {
    public static void main(String[] args) throws Exception {
        Zoo zoo1 = new Zoo("Zoo");

        Aviary aviary1 = new Aviary("aviary1");
        Aviary aviary2 = new Aviary("aviary2");


        Animal Tiger1 = new Tiger("Anton", 13, "Tiger");
        Animal Tiger2 = new Tiger("Antoj", 15, "Tiger");


        Animal Zebra1 = new Zebra("Kolija", 1, "Zebra");
        Animal Zebra2 = new Zebra("Kos", 6, "Zebra");

        Animal Elifant1 = new Elephant("One", 7, "Elifant");
        Animal Elifant2 = new Elephant("Two", 8, "Elifant");



        zoo1.addAviary(aviary1);
        zoo1.addAviary(aviary2);

        aviary1.addAnimal(Tiger1);
        aviary1.addAnimal(Zebra1);
        aviary1.addAnimal(Elifant1);

        aviary2.addAnimal(Tiger2);
        aviary2.addAnimal(Zebra2);
        aviary2.addAnimal(Elifant2);

         Employee employee = new Employee("DDD", "AAA");
         employee.newPosition("BBB");
         employee.addAviary(aviary1);
         employee.addAviary(aviary2);
         employee.delAviary(aviary2);
         employee.display();

         zoo1.foundTypes("Tiger");

        zoo1.displayAviary();







    }
}
