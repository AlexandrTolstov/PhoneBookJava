import java.util.*;

public class PhoneBook {
    private static ArrayList<Contact> phoneBook;

    public PhoneBook(){
        phoneBook = new ArrayList<>();
    }

    //Добавление контакта
    public void add(String name, Integer phoneNum) {
        Contact contact = find(name);
        if(contact == null){
            contact = new Contact(name);
            contact.phones.add(phoneNum);
            phoneBook.add(contact);
        }
        contact.phones.add(phoneNum);
    }

    public void del(String name){
        Contact contact = find(name);
        phoneBook.remove(contact);
    }

    //Нахождение контакта по имени
    public Contact find(String name) {
        Contact contact = null;

        if(!phoneBook.isEmpty()){
            for(Contact item: phoneBook){
                if(Objects.equals(item.getName(), name)){
                    contact = item;
                    break;
                }
            }
        }
        else{
            contact = null;
        }
        return contact;
    }

    @Override
    public String toString() {
        Collections.sort(phoneBook);
        String stringPhoneBook = "[";

        int i = 0;
        for(Contact item: phoneBook){
            stringPhoneBook += item.getName() + " = " + item.phones.toString();
            if(i != phoneBook.size() - 1){
                stringPhoneBook += "; ";
            }
            i++;
        }
        stringPhoneBook += "]";

        return stringPhoneBook;
    }
}
