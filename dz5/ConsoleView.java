import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

	private PhoneBook phoneBook;
	private Scanner scanner;
	private List<Integer> id;

	public ConsoleView(PhoneBook phoneBook) {
		this.phoneBook = phoneBook;
		this.scanner = new Scanner(System.in);
		this.id = idArray();
	}

	public void start() {
		while (true) {

			printMenu();

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					phoneBook.displayContacts();
					break;
				case 2:
					addContact();
					break;
				case 3:
					deleteContact();
					break;
				case 4:
					updateContact();
					break;
				case 5:
					String text = "Введите телефон для поиска:";
					phoneBook.searchByPhone(scanString(text));
					break;
				case 6:
					text = "Введите имя для поиска:";
					phoneBook.searchByName(scanString(text));
					break;
				case 7:
					text = "(Импорт данных) введите имя файла:";
					phoneBook.importFromCSV(scanString(text));
					break;
				case 8:
					text = "(Экспорт данных) введите имя файла:";
					phoneBook.exportToCSV(scanString(text));
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Неверный ввод");

			}
		}
	}

	void printMenu() {
		System.out.println("Выберите действие: ");
		System.out.println("1. Посмотреть контакты");
		System.out.println("2. Добавить контакт");
		System.out.println("3. Удалить контакт");
		System.out.println("4. Обновить контакт");
		System.out.println("5. Поиск по телефону");
		System.out.println("6. Поиск по имени");
		System.out.println("7. Импорт из CSV");
		System.out.println("8. Экспорт в CSV");
		System.out.println("0. Выход");
	}

	List<Integer> idArray() {
		Integer arr[] = new Integer[phoneBook.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = phoneBook.getContact().get(i).getIdContact();
		}
		return Arrays.asList(arr);
	}

	void addContact() {
		System.out.println("Введите имя: ");
		String firstName = scanner.nextLine();
		System.out.println("Введите фамилию: ");
		String lastName = scanner.nextLine();
		System.out.println("Введите телефон: ");
		String phone = scanner.nextLine();
		Integer idContact = null;
		Boolean flag = false;
		do {
			if (flag) {
				System.out.println("Введён id который уже есть, введите новый");
				flag = false;
			}
			System.out.println("Введите id (любое число): ");
			idContact = scanner.nextInt();
			flag = true;
		} while (id.contains(idContact));
		Contact contact = new Contact(idContact, firstName, lastName, phone);
		phoneBook.addContact(contact);
		this.id = idArray();
	}

	void deleteContact() {
		System.out.println("Введите id удаляемого контакта: ");
		Integer idContactDelete = scanner.nextInt();
		phoneBook.removeContact(idContactDelete);
		this.id = idArray();
	}

	void updateContact() {
		System.out.println("Введите id обновляемого контакта: ");
		Integer idContactUpdate = scanner.nextInt();
		System.out.println("Введите новое имя: ");
		String newFirstName = scanner.nextLine();
		System.out.println("Введите новую фамилию: ");
		String newLastName = scanner.nextLine();
		System.out.println("Введите новый телефон: ");
		String newPhone = scanner.nextLine();
		phoneBook.updateContact(idContactUpdate, newFirstName, newLastName, newPhone);
	}

	String scanString(String text){
		System.out.println(text);
		return scanner.nextLine();
	}

}
