package task.T22;

public interface Accountable<T, U> {
    T getId();
    U getError();

}



class Account1 implements Accountable<String, IllegalAccessError> {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public IllegalAccessError getError() {
        return null;
    }
}

class Account2 implements Accountable<Integer, ArrayIndexOutOfBoundsException> {

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public ArrayIndexOutOfBoundsException getError() {
        return null;
    }
}

