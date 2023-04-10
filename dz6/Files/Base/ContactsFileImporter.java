package Files.Base;

import java.io.FileNotFoundException;
import java.util.Collection;

import Models.Contact;

public interface ContactsFileImporter {
	Collection<Contact> importContacts(String fileName) throws FileNotFoundException;

}
