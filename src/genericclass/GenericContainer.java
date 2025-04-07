package genericclass;

import generic.interfaces.Container;

public class GenericContainer<T> implements Container<T> {

    private T value;

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return this.value;
    }
}
