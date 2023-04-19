package Lesson07_OOP_DU;

/*Implement a Human class. Information to be stored in the class fields: full name, date of birth, phone number, city,
country, home address. Implement the class methods for data input and output, implement the access to individual fields
through class methods. */

import java.util.Scanner;

public class Human {

    private String fullName, birthDate, city, country, phoneNumber, homeAddress;

    public Human (String fullName, String city, String country, String phoneNumber, String homeAddress, String birthDate){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.birthDate = birthDate;
    }

    public static Human createHumanFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter date of birth: ");
        String birthDate = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        System.out.print("Enter home address: ");
        String homeAddress = scanner.nextLine();

        return new Human(fullName, birthDate, phoneNumber, city, country, homeAddress);
    }

    public void displayHuman() {
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + birthDate);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Home address: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String birthDate() {
        return birthDate;
    }

    public void setBirthDate() {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static void main(String[] args) {
        Human human = Human.createHumanFromInput();
        System.out.println();
        human.displayHuman();
    }
}
