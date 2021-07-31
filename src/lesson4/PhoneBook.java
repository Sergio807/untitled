package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesLastName);
    }
    public ArrayList<String> get (String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alekseev", "1234567888");
        phoneBook.add("Sergeev", "12345678885");
        phoneBook.add("Aleksandrov", "1234567870");
        phoneBook.add("Maksimov", "16734567888");
        phoneBook.add("Andreev", "1239084");
        phoneBook.add("Aleksandrov", "3434567870");
        phoneBook.add("Aleksandrov", "4567870");
        System.out.println(phoneBook.get("Aleksandrov"));

    }

}
