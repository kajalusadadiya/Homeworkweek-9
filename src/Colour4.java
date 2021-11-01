import java.util.ArrayList;
import java.util.List;

public class Colour4 {
    /*
     * Write a Java program to create a new array list, add some colours (string) and
     * printout the collection using for each loop.
     * @param args
     */


    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {

        String arr[] = {"Blue", "Red", "Orange", "Green", "Yellow"};
        List a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(arr[i]);
            System.out.println(a + " Colour of this array " + a.size());
        }
    }



}
