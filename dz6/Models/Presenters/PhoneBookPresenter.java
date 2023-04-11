package Models.Presenters;

import Files.Base.FileMeneger;
import Models.PhoneBook;
import Viev.Base.Viev;

public class PhoneBookPresenter {
	private Viev view;
	private PhoneBook phoneBook;
	private FileMeneger fileMeneger;

	public PhoneBookPresenter(Viev view, PhoneBook phoneBook, FileMeneger fileMeneger) {
		this.view = view;
		this.phoneBook = phoneBook;
		this.fileMeneger = fileMeneger;

	}

	public void buttonCLick() {
		view.showMenu();
	}
}
