public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        printPhoneBook(phoneBook);
    }

    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public static void printPhoneBook(HashMap<String, List<String>> phoneBook) 
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
