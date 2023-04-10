import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCSV {
	/**
	 * Запись файла csv
	 * @param contacts список контактов
	 * @param fileName имя файла для записи
	 */
    public static void writeToCSV(List<Contact> contacts, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File("./" + fileName + ".csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("id,Имя,Фамилия,Телефон\n");

            for (Contact contact : contacts) {
                sb.append(contact.getIdContact()).append(",");
                sb.append(contact.getFirstName()).append(",");
                sb.append(contact.getLastName()).append(",");
                sb.append(contact.getPhone()).append("\n");
            }

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
    }

	/**
	 * Чтение файла
	 * @param fileName имя файла
	 * @return список контактов из прочтённого файла
	 */
    public static List<Contact> readFromCSV(String fileName) {
        List<Contact> contacts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName + ".csv"))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
				Integer id = Integer.parseInt(fields[0]);
                Contact contact = new Contact(id, fields[1], fields[2], fields[3]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }

        return contacts;
    }

}
