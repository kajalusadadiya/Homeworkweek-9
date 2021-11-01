import java.util.ArrayList;
import java.util.List;

public class Index6 {

    //  Write a Java program to retrieve an element (at a specified index) from a given
    // array list


    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String thirdBestCompany = topCompanies.get(2);
        String fourthBestCompany = topCompanies.get(3);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Third Best Company: " + thirdBestCompany);
        System.out.println("Fourth Best Company: " + fourthBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);


    }
}