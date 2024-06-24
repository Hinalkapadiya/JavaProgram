package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class Person {

    private String name;
    private City city;
    private Country country;

    // Default constructor
    public Person() {
        this.name = "";
        this.city = new City();
        this.country = new Country();
    }

    // Parameterized constructor
    public Person(String name, City city, Country country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", country=" + country +
                '}';
    }
}
