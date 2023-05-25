package addressBook.system;

public class Contact {
    private String name, email;
    private long phoneNumber;
    private String city;

    public String getName() {

        return name;
    }

    public long getPhoneNumber() {

        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public String getCity() {

        return city;
    }

    public void setFirstName(String Name) {

        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setCity(String address) {

        this.city = address;
    }

    public Contact(String name,  String email, long phoneNumber, String city) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    @Override
    public String toString() {

        return "\nPerson Details:\nFirst Name - " + name + "\nPhone Number - "
                + phoneNumber + "\nEmail - " + email + "\nCity - " + city;
    }
}
