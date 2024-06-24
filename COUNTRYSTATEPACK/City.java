package tnsif.region.countrystatepack;

public class City {

    private String name;

    // Default constructor
    public City() {
        this.name = ""; // Initializing name to an empty string
    }

    // Parameterized constructor
    public City(String name) {
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

    // Override toString method to provide a string representation of the City object
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    // Main method to demonstrate the usage of the City class
    public static void main(String[] args) {
        City city = new City("AHMEDABAD");
        System.out.println(city); // Printing the City object
    }
}
