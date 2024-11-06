package task.T24.Hw.Task1;

public final class Roj<T> {
    private T[] elements;

    public Roj(T... elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements.clone();
    }

    public <U> U leastObject(U... objs) {
        U a = objs[0];
        for (int i = 0; i < objs.length; i++) {
            if (a.toString().length() > objs[i].toString().length()) {
                a = objs[i];
            }
        }
        return a;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] elements = {1,1,8,0,777777777};
        Roj<Integer> roj = new Roj<>(elements);
        System.out.println(roj.leastObject(elements));

    }
}
