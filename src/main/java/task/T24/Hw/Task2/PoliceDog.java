package task.T24.Hw.Task2;

public interface PoliceDog<T, U> extends SpecialDog<T, U> {
    T bite();
    T sniff();
}
