import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Морозова", "123-456-789");
        addContact(phoneBook, "Иванов", "987-654-321");
        addContact(phoneBook, "Климов", "555-555-555");
        addContact(phoneBook, "Морозова", "111-222-333");
        addContact(phoneBook, "Петров", "444-444-444");
        printPhoneBook(phoneBook);
    }
}
