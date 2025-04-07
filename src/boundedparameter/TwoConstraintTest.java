package boundedparameter;

import generic.interfaces.Container;

/*
Here we added a constrain that TwoConstaraintClass will only deals with the classes which extends Number class and implements Container
Always we need to add the class first while Bounding the generic as Java Not support Multiple inheritence
 */

public class TwoConstraintTest {
    public static void main(String[] args) {
        DoubleConstrain doubleConstrain =new DoubleConstrain(9);
        TwoConstraint<DoubleConstrain> twoConstraint = new TwoConstraint<>(doubleConstrain);

    }
}


class TwoConstraint<T extends Number & Container> {
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    private T item;

    public TwoConstraint(T item){
        this.item = item;
        this.item.getValue();
    }




}

  class DoubleConstrain  extends Number implements Container<String>{

    private final int value;

    public DoubleConstrain(int value){
        this.value = value;
    }

    @Override
    public void setValue(String value) {

    }

    @Override
    public String getValue() {
        System.out.println("Our Value is "+this.value);
        return "Hi";
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
