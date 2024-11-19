import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private Map<String, String> contactsNameToNumber = new HashMap<>();
    private Map<String, String> contactsNumberToName = new HashMap<>();
    private Set<String> names = new TreeSet<>();

    public int add(String name, String number) {
        if (!contactsNameToNumber.containsKey(name)) {
            contactsNameToNumber.put(name, number);
            contactsNumberToName.put(number, name);
            names.add(name);
        }
        return contactsNameToNumber.size();
    }

    public String findByNumber(String number) {
        return contactsNumberToName.get(number); // Быстрый поиск по номеру
    }

    public String findByName(String name) {
        return contactsNameToNumber.get(name); // Быстрый поиск по номеру
    }

    public String printAllNames() {
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name).append("\n");
        }
        return sb.toString();
    }
}
