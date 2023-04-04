public class Programm {

    public static void main(String[] args) {

        // создаём класс PhoneBook и передаём его в конструктор ConsoleView.
        // Затем вызваваем метод start() объекта ConsoleView, чтобы запустить интерфейс
        // командной строки для работы с телефонной книгой.
        PhoneBook phoneBook = new PhoneBook();
        ConsoleView consoleView = new ConsoleView(phoneBook);
        consoleView.start();

    }

}
