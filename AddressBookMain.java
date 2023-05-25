package addressBook.system;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookSystem addressBook = new AddressBookSystem();

        // Adding contacts
        addressBook.addContact(new Contact("Priya Chauhan ","priyachauhan47365@gmail.com",7487376687L,"Lucknow"));
        addressBook.addContact(new Contact("Anuradha Mall ","anuradha7667@gmail.com",8724226348L,"Delhi"));

    }
}
