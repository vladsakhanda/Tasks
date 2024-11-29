package task.IterableAndIterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//
//        TreeSet<Integer> arrayList = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        arrayList.add(1);
//        arrayList.add(5);
//        arrayList.add(-9);
//        arrayList.add(-12);
//        arrayList.add(-2);

//        System.out.println(arrayList);

//        int[] numbers = new int[]{};
//        System.out.println(numbers[0]);

//        ArrayList<String> arrayOfStrings = new ArrayList<>();

//        arrayOfStrings.add("Ukraine");
//        arrayOfStrings.add("Poland");
//        arrayOfStrings.add("USA");
//        arrayOfStrings.add("Italy");
//        arrayOfStrings.add("Germany");
//
//        System.out.println(arrayOfStrings);
//
//        Iterator<String> iterator = arrayOfStrings.iterator();
////        System.out.println(iterator.hasNext());
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
////        System.out.println(iterator.hasNext());
//        for (String string : arrayOfStrings) {
//            System.out.println(string);
//        }

//        HashMap<String, Integer> people = new HashMap<>();
//
//        people.put("Vlad", 23);
//        people.put("Oksana", 24);
//        people.put("Peter", 28);
//
//        System.out.println(people);
//        System.out.println(people.entrySet());
//
//        for (String keys : people.keySet()) {
//            System.out.println(keys);
//        }


        //
        ArraySuperList<Integer> superList = new ArraySuperList<>(
                List.of(2, 5)

        );

        System.out.println(superList);

        for (Integer myMiniSuperClass : superList) {
            System.out.println(myMiniSuperClass);
        }
    }
}

/*
Щоб створити власну колекцію, яка буде ітерованою - треба:
1. Реалізувати Iterable<E>
2. Реалізувати метод iterator
3. Створити власну внутрішню колекцію private List<E> elements;
4. Всередині методу Iterator повернути ітератор нашої внутрішньої колекції return elements.iterator();
 */
class ArraySuperList<E> implements Iterable<E> {
    private List<E> elements;

    public ArraySuperList(List<E> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }
}

class MySuperClass {
    private String name;

    public MySuperClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


