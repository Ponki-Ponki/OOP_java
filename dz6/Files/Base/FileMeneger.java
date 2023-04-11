package Files.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;

import Models.Contact;

public abstract class FileMeneger {
	private ContactsFileExporter exporter;
	private ContactsFileImporter importer;
	private String fileName;
	private File file;
	public FileMeneger(ContactsFileExporter exporter, ContactsFileImporter importer, String fileName) {
		this.exporter = exporter;
		this.importer = importer;
		this.fileName = fileName;
		file = new File(fileName);
	}

	public boolean hasFile(){
		return file.exists();
	}

	public void saveContats(List<Contact> contacts) throws FileNotFoundException{
		exporter.exportContacts(contacts, fileName);
	}

	public Collection<Contact> readContacts() throws FileNotFoundException{
		return importer.importContacts(fileName);
	}

}
