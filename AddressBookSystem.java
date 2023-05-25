package addressBook.system;

import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem implements AddContact, EditPerson,DeletePerson {
    private List<Contact> contacts;

    public AddressBookSystem() {

        contacts = new ArrayList<>();
    }
    @Override
    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    @Override
    public void editContact(String name, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                contacts.set(i, newContact);
                break;
            }
        }

    }
    @Override
    public void deleteContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                contacts.remove(i);
                break;
            }
        }

    }
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("City " +contact.getCity());
            System.out.println();
        }
    }
}
