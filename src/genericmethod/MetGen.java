package genericmethod;

public class MetGen {
    public static  <T> void getAny(T[] value){
        for(T item : value){
            System.out.print(item +" ");
        }
    }
    public static void main(String[] args) {
        String[] ss = {"Shashank","Abhishek"};
    MetGen.getAny(ss);
    }
}
