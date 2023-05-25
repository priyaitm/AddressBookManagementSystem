package addressBook.system;
import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem implements AddContact {
    private List<Contact> contacts;

    public AddressBookSystem() {
        contacts = new ArrayList<>();
    }
    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
