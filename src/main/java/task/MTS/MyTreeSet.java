package task.MTS;

import java.util.Arrays;
import java.util.HashSet;

public class MyTreeSet<T> {
    private Object[] elements = {};

    public MyTreeSet(T[] elements) {
        this.elements = elements;
    }

    public MyTreeSet() {
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < elements.length; i++) {
            result = result + elements[i] + ", ";
        }
        return result;
    }

    public void addLast(T element) {
        HashSet<T> set = new HashSet<>(elements);
            elements = Arrays.copyOf(elements, elements.length +1);
            elements[elements.length-1] = element;
    }

    public void removeLast()  {
        elements = Arrays.copyOf(elements, elements.length -1);
    }


}