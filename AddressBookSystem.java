package addressBook.system;

import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem implements AddContact, EditPerson {
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
}
