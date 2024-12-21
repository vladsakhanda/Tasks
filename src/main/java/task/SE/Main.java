package task.SE;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] arrStr = {"TTT", "AAA", "BBB"};
        String[] arrStr2 = {"TTT", "AAA", "CCC"};
        SetEntry<String, String> arr = new SetEntry<>();
        arr.addLast("1",arrStr);
        arr.addLast("2",arrStr);
        arr.addLast("3",arrStr);
        arr.addLast("4",arrStr);
        arr.addLast("5",arrStr);
        arr.addLast("6",arrStr);
        arr.addLast("7",arrStr);
        arr.addLast("8",arrStr);
        arr.removeLast();
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.sizeOfValues("7"));
        System.out.println(arr.indexOfKey(5));
        arr.reversed();
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.addFirst("7",arrStr);
        System.out.println(arr);
        arr.reversed();
        arr.remove("4");
        System.out.println(arr);
        arr.setValue("5", arrStr2);
        System.out.println(arr);
        arr.add(5, "10", arrStr2);
        System.out.println(arr);
        SetEntry<String, String> arr2 = new SetEntry<>(arr);
        System.out.println(arr2);
        arr2.remove(0);
        System.out.println(arr);
        System.out.println(arr2);
        arr2.clear();
        System.out.println(arr2);

    }


}
