import javax.swing.*;

public class Person {

    private String personName;
    private String personAddress;

    // Constructor
    public Person(String personName, String personAddress) {
        this.personName = personName;
        this.personAddress = personAddress;
    }

    // Method to display contact details of a person in the address book
    public void displayDetails() {
        String detailsMessage = this.getPersonName()+" lives at: "+this.getPersonAddress();
        JOptionPane.showMessageDialog(null, detailsMessage, "Contact details", JOptionPane.INFORMATION_MESSAGE);
    }

    // Getters and Setters

    // personName
    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    // personAddress
    public String getPersonAddress() {
        return this.personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
}
