package task.T24.Hw.Task;

public final class Roj {
    private int[] elements;
    private int age;

    public Roj(int age, int[] elements) {
        this.elements = elements;
        this.age = age;
    }

    public int[] getElements() {
        return elements.clone();
    }

    public int getAge() {
        return age;
    }
}
