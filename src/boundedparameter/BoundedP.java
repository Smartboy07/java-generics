package boundedparameter;
/*
Here we added a condition to our generic saying the sub class of Number class can be the type for this
Ex: Integer Long we try to use STRING we will get error Type String is not with in it's Bound
 */

public class BoundedP <T extends Number>{
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    T value;
}
