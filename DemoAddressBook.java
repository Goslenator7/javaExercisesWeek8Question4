import javax.swing.*;
import java.util.TreeMap;

public class DemoAddressBook {
    public static void main(String[] args) {


        Person p1 = new Person("Tony", "1 Stark Tower, Manhattan, NY");
        Person p2 = new Person("Thor", "Odin's Palace, Asgard");
        Person p3 = new Person("Steve", "13 189th Street, Brooklyn");
        Person p4 = new Person("Bruce", "Unknown, Unknown");

        TreeMap <String, String> addressBook = new TreeMap<String, String>();

        addressBook.put(p1.getPersonName(), p1.getPersonAddress());
        addressBook.put(p2.getPersonName(), p2.getPersonAddress());
        addressBook.put(p3.getPersonName(), p3.getPersonAddress());
        addressBook.put(p4.getPersonName(), p4.getPersonAddress());

        TreeMap<String, Person> avengers = new TreeMap<>();

        avengers.put(p1.getPersonName(), p1);
        avengers.put(p2.getPersonName(), p2);
        avengers.put(p3.getPersonName(), p3);
        avengers.put(p4.getPersonName(), p4);

        for (String tempPersonName : avengers.keySet()) {
            avengers.get(tempPersonName).displayDetails();
        }

    }
}
