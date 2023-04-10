import java.io.FileNotFoundException;
import java.util.ArrayList;

import Files.Managers.CsvContactsFileMenager;
import Models.PhoneBook;
import Models.Presenters.PhoneBookPresenter;
import Viev.ConsoleView;

public class Main {

	public static void main(String[] args) {
		PhoneBook phoneBook = null;
		ConsoleView consoleView = new ConsoleView(phoneBook);
		CsvContactsFileMenager manager = new CsvContactsFileMenager("contacts");
		try {
			if (manager.hasFile())
				phoneBook = new PhoneBook(new ArrayList<>(manager.readContacts()));
			else
				phoneBook = new PhoneBook();
			PhoneBookPresenter presenter = new PhoneBookPresenter(consoleView, phoneBook, manager);
			presenter.buttonCLick();
		} catch (FileNotFoundException e) {
			consoleView.printErrorMassage(e.getMessage());
		}

	}

}
