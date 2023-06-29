import java.util.Optional;

class Student {
    private String name;
    private Optional<Address> address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = Optional.ofNullable(address);
    }

    public Student(String name) {
        this(name, null);
    }
    public Optional<Address> getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }

}