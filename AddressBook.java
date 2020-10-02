import javax.swing.*;
import java.util.TreeMap;

public class AddressBook {

    private TreeMap<String, String> addressBook = new TreeMap <String, String>();

    public void addEntry() {
        String nameProvided = JOptionPane.showInputDialog("Please enter a name would like to add to the address book: ");
        String addressProvided = JOptionPane.showInputDialog("Please enter "+nameProvided+"'s address: ");

        addressBook.put(nameProvided, addressProvided);
        JOptionPane.showMessageDialog(null, nameProvided+"'s details were was added to the address book.");
    }

    public void addEntry(String personName, String personAddress) {
        addressBook.put(personName, personAddress);
    }

    public void deleteEntry() {
        String nameToRemove = JOptionPane.showInputDialog("Please enter the name of the person you would like to remove from the address book: ");
        if (addressBook.containsKey(nameToRemove)) {
            addressBook.remove(nameToRemove);
        }
        else {
            String errorMessage = "Sorry, this name was not found in the address book. Please enter a name in the address book to remove it.";
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            deleteEntry();
        }
    }

    public void deleteEntry(String personName) {
        addressBook.remove(personName);
    }
}
