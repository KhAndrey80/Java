// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Set<String> phoneNumbers = phoneBook.getOrDefault(name, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public void printPhoneBook() {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Set<String>>>() {
            @Override
            public int compare(Map.Entry<String, Set<String>> entry1, Map.Entry<String, Set<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });

        for (Map.Entry<String, Set<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Сергей", "1234567890");
        phoneBook.addContact("Андрей", "5678901234");
        phoneBook.addContact("Марина", "9876543210");
        phoneBook.addContact("Андрей", "2468135790");

        phoneBook.printPhoneBook();
    }
}
