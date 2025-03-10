public class Person extends ObjectPlusPlus {
    private String nick;
    private String phoneNumber;
    private String email;
    private String city;

    public Person(String nick, String phoneNumber, String email, String city) {
        super();    // Required by the ObjectPlusPlus

        this.nick = nick;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
    }

    public Person(String nick, String phoneNumber, String email, String city, String types, String instruments,
                  String genres, String sex, int yearOfBirth, String note) {
        super();    // Required by the ObjectPlusPlus

        this.nick = nick;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;

        // "Changes" a person into a musician
        addMusician(types, instruments, genres, sex, yearOfBirth, note);
    }

    public Person(String nick, String phoneNumber, String email, String city,String companyName)  {
        super();    // Required by the ObjectPlusPlus

        this.nick = nick;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;

        // "Changes" a person into a booker
        addBooker(companyName);
    }

    public Person(String nick, String phoneNumber, String email, String city, String firstName, String lastName)  {
        super();    // Required by the ObjectPlusPlus

        this.nick = nick;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;

        // "Changes" a person into an owner
        addOwner(firstName, lastName);
    }

    private void addMusician(String types, String instruments, String genres, String sex, int yearOfBirth, String note) {
        // Creation of the musician part
        Musician musician = new Musician(types, instruments, genres, sex, yearOfBirth, note);

        // Adding a musician as a link
        // We use a method provided by the ObjectPlusPlus
        this.addLink(roleNameMusician, roleNameGeneralization, musician);
    }

    private void addBooker(String companyName)  {
        // Creation of the student part
        Booker booker = new Booker(companyName);

        // Adding a booker as a link
        // We use a method provided by the ObjectPlusPlus
        this.addLink(roleNameBooker, roleNameGeneralization, booker);
    }

    private void addOwner(String firstName, String lastName)  {
        // Creation of the student part
        Owner owner = new Owner(firstName, lastName);

        // Adding an owner as a link
        // We use a method provided by the ObjectPlusPlus
        this.addLink(roleNameOwner, roleNameGeneralization, owner);
    }

    public String getNick() { return nick; }
    public void setNick(String nick) { this.nick = nick; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private static String roleNameMusician = "specializationMusician";
    private static String roleNameBooker = "specializationBooker";
    private static String roleNameOwner = "specializationOwner";
    private static String roleNameGeneralization = "generalization";
}