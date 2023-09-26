//Accepts persons name , mobile number , address , mail-id and display the information of person asking input from the user (Search) using Hashmap. Accept at least 10 input from user 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class PersonInfoSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans=1,i=0;
        Map<String, Person> personMap = new HashMap<>();
        // Accept at least 10 inputs
        for ( i = 0; i < 10; i++) {
            System.out.println("Enter person " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Mobile Number: ");
            String mobileNumber = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Email ID: ");
            String email = scanner.nextLine();

            // Create a Person object and store it in the HashMap
            Person person = new Person(name, mobileNumber, address, email);
            personMap.put(name, person);
        }
        
            while(ans!=0){
                 System.out.print("Do you want to enter more?(1/0)");
                 ans =scanner.nextInt();
                 if(ans==0)
                 break;
                 System.out.println("Enter person " + (i + 1) + " details:");
                 System.out.print("Name: ");
                 String name = scanner.next();
                 System.out.print("Mobile Number: ");
                 String mobileNumber = scanner.next();
                 System.out.print("Address: ");
                 String address = scanner.next();
                 System.out.print("Email ID: ");
                 String email = scanner.next();

            // Create a Person object and store it in the HashMap
            Person person = new Person(name, mobileNumber, address, email);
            personMap.put(name, person);
            }
        
        // Search for a person's information
        while (true) {
            System.out.print("Enter a name to search (or 'exit' to quit): ");
            String searchName = scanner.nextLine();
            if (searchName.equalsIgnoreCase("exit")) {
                break;
            }

            Person foundPerson = personMap.get(searchName);
            if (foundPerson != null) {
                System.out.println("Person Found:");
                System.out.println("Name: " + foundPerson.getName());
                System.out.println("Mobile Number: " + foundPerson.getMobileNumber());
                System.out.println("Address: " + foundPerson.getAddress());
                System.out.println("Email ID: " + foundPerson.getEmail());
            } else {
                System.out.println("Person not found.");
            }
        }
    }
}
class Person {
    private String name;
    private String mobileNumber;
    private String address;
    private String email;

    public Person(String name, String mobileNumber, String address, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
