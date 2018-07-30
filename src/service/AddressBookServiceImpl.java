package service;

import java.util.ArrayList;
import java.util.List;

import exception.AddressBookException;
import model.AddressBook;
import model.Contact;

public class AddressBookServiceImpl implements AddressBookService {

	@Override
	public void addContactToAddressBook(Contact contact, AddressBook addressBook) throws AddressBookException {
		if(contact == null || addressBook == null)
			throw new AddressBookException("addressBook or contact is null");
		
		List<Contact> contacts=addressBook.getContactList();
		if(contacts ==null) {
			contacts = new ArrayList<Contact>();
		}
		
		if(contacts.contains(contact)) {
			throw new AddressBookException("Contact already present. Duplicate contact :"+ contact);
		}
		contacts.add(contact);
	}

	@Override
	public void removeContactFromAddressBook(Contact contact, AddressBook addressBook) throws AddressBookException {
		if(contact == null || addressBook == null)
			throw new AddressBookException("addressBook or contact is null");
		
		List<Contact> contacts=addressBook.getContactList();
		if(contacts ==null) {
			throw new AddressBookException("Can not remove contact:"+contact+". Contact list is already empty.");
			
		}
		
		contacts.remove(contact);

	}

	@Override
	public void printAllContactsFromAddressBook(AddressBook addressBook) throws AddressBookException {
		if( addressBook == null)
			throw new AddressBookException("addressBook  is null");
		
		List<Contact> contacts=addressBook.getContactList();
		
		if(contacts == null || contacts.isEmpty()) {
			System.out.println("No contacts present in address book.");
			return;
		}
		
		contacts.forEach(contact -> System.out.println(contact));
		

	}

}
