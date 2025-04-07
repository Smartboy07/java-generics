package constructorgenerics;
/*
If Class is not type of generic But if we want the constructor of that class to be generic then we need to
use the <> before constructor name this defines that we are going to send parameter value with generic
 */
public class ConsGen {
    public <T> ConsGen(T value){

    }

    public static void main(String[] args) {

    }
}
