package Models;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	private List<Contact> contacts;

	public PhoneBook(List<Contact> contacts) {
		this.contacts = new ArrayList<>();
		for (Contact contact : contacts) {
			this.contacts.add(contact);
		}
	}

	public PhoneBook(){
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public boolean removeContact(Integer idContact) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getIdContact().equals(idContact)) {
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updateContact(Integer idContact, String newFirstName, String newLastName, String newPhone) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getIdContact().equals(idContact)) {
				Contact contact = contacts.get(i);
				contact.setFirstName(newFirstName);
				contact.setLastName(newLastName);
				contact.setPhone(newPhone);
				return true;
			}
		}
		return false;
	}

	public List<Contact> searchByName(String name) {
		List<Contact> result = new ArrayList<>();
		for (Contact contact : contacts) {
			if (contact.getFirstName().equals(name)) {
				result.add(contact);
			}
		}
		return result;
	}

	public List<Contact> searchByPhone(String phone) {
		List<Contact> result = new ArrayList<>();
		for (Contact contact : contacts) {
			if (contact.getPhone().equals(phone)) {
				result.add(contact);
			}
		}
		return result;
	}

	public Integer size() {
		return contacts.size();
	}

	public List<Contact> getContact() {
		return contacts;
	};

}