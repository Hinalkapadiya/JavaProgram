package tnsif.region.countrystatepack;

public class Country {

    private String name;

    // Default constructor
    public Country() {
        this.name = ""; // Initializing name to an empty string
    }

    // Parameterized constructor
    public Country(String name) {
        this.name = name; // Initializing name to the provided value
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Override toString method to provide a string representation of the Country object
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    // Main method to demonstrate the usage of the Country class
    public static void main(String[] args) {
        Country country = new Country("India");
        System.out.println(country); // Printing the Country object
    }
}
