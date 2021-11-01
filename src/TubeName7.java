import java.util.ArrayList;

public class TubeName7 {
   // Write a Java program to test an array list is empty or not. Define array list with
   //underground tube names
     // @param args



    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        // before checking ArrayList using isEmpty() method
        System.out.println("Is ArrayList empty: " + al.isEmpty());
        al.add("Waterloo Line");
        al.add("Bekerloo Line");
        al.add("Metropolitan Line");
        al.add("Elizabeth Line");
        // after checking ArrayList using isEmpty() method
        System.out.println("Is ArrayList empty: " + al.isEmpty());
        for(String tube : al)
        {
            System.out.println(tube);
        }
    }
}
