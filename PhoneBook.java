package homeTask4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> book = new HashMap<>();

    public void addContact(String lastName, String phone) {
        book.put(phone,lastName);
    }

    public List<String> getPhones(String lastname) {
        ArrayList<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (entry.getValue().equals(lastname)) {
                phones.add(entry.getKey());
            }
        }
        return phones;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иванов", "022123423");
        phoneBook.addContact("Сидоров", "234");
        phoneBook.addContact("Иванов", "23456888999765");
        phoneBook.addContact("Петров", "985349");
        phoneBook.addContact("Егоров", "246099964");

        System.out.println(phoneBook.getPhones("Иванов"));
        System.out.println(phoneBook.getPhones("Егоров"));
    }
}