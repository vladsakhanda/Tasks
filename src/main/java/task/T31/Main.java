package task.T31;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        hashMap.put("Раринаа", 0);
//        hashMap.put("Рарина", 0);
//        hashMap.put("М", 0);
//        hashMap.put("Карина", 0);

//        SortedSet<String> sortedSet = new TreeSet<>(new StringComparator());
//
//        sortedSet.add("sdfsd");
//        sortedSet.add("sdasdasdsa");
//        sortedSet.add("htyjuyjkjhk");
//        sortedSet.add("gfhgfh");
//        sortedSet.add("tGH");
//        sortedSet.add("tGH");
//        sortedSet.add("Jwe");
//
//        System.out.println(sortedSet);
//
        SortedSet<Person> sortedSet = new TreeSet<>();

        sortedSet.add(new Person("Oleksandr", 5));
        sortedSet.add(new Person("Oleksandr",44));

        System.out.println(sortedSet);

//        HashSet<Person> hashSet = new HashSet<>();
//
//        hashSet.add(new Person("aaaaa"));
//        hashSet.add(new Person("aaaa"));
//        hashSet.add(new Person("aa"));
//        hashSet.add(new Person("aa"));
//        hashSet.add(new Person("bb"));
//
//        System.out.println(hashSet);
    }
}

class StringComparator implements Comparator<String> {

    /* Якщо отримуємо мінусове число, то елемент зліва буде розташований справа від елемента з яким порівнюють
       Якщо отримуємо позитивне число - навпаки
       Якщо 0, то це означає що елементи рівні
     */
    @Override
    public int compare(String o1, String o2) {
        // First case
//        int result = o2.length() - o1.length();
//
//        if (result != 0) {
//            return result;
//        }
//
//        return 1;

        // Second case
        return o1.compareTo(o2);
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+age;
    }

    /* Якщо отримуємо мінусове число, то елемент зліва буде розташований справа від елемента з яким порівнюють (елемент, що є параметром)
       Якщо отримуємо позитивне число - навпаки
       Якщо 0, то це означає що елементи рівні
     */
    @Override
    public int compareTo(Person o) {
        int result = name.compareTo(o.name);

        if (result == 0) {
            return age - o.age;
        }

        return result;
    }
}
