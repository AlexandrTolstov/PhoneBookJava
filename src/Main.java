import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Александр", 32423432);
        phoneBook.add("Александр", 34616);
        phoneBook.add("Александр", 5484158);
        phoneBook.add("Людмила", 57515);
        phoneBook.add("Василий", 34616);
        phoneBook.add("Василий", 5484158);
        phoneBook.add("Павел", 541566);
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Выберете действие:");
            System.out.println("1 - Показать записи в телефонной книге");
            System.out.println("2 - Добавить запись в телефонную книгу");
            System.out.println("3 - Удалить запись из телевонной книге");
            System.out.print("Ваш выбор: ");
            int choice = in.nextInt();
            String name = "";
            int phone;

            switch (choice){
                case (1):
                    System.out.println(phoneBook);
                    break;
                case (2):
                    System.out.print("Введите имя: ");
                    name = in.next();
                    System.out.print("\nведите номер телефона: ");
                    phone = in.nextInt();
                    phoneBook.add(name, phone);
                    break;
                case (3):
                    System.out.print("Введите имя: ");
                    name = in.next();
                    phoneBook.del(name);
            }

        }

        //System.out.println(phoneBook);
    }
}