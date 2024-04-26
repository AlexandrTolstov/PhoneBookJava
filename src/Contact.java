import java.util.HashSet;
import java.util.Set;

public class Contact implements Comparable<Contact> {
    private String name;
    Set<Integer> phones;

    public Contact(String name){
        this.name=name;
        this.phones = new HashSet<>();
    }

    public String getName() { return name; }
    public Set<Integer> getPhones() { return phones; }

    @Override
    public int compareTo(Contact o) {
        return o.phones.size() - this.phones.size();
    }
}
