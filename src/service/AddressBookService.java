package service;

import exception.AddressBookException;
import model.AddressBook;
import model.Contact;

/**
 * Provides all services for AddressBook
 * @author Rachana
 *
 */
public interface AddressBookService {
	
	/**
	 *  Adds new contact to Address book passed to the method.
	 *  
	 * @param contact contact to be added
	 * @param addressBook  Address book into which contact will be added
	 * @throws AddressBookException Exception will be thrown for invalid input
	 */
	public void addContactToAddressBook(Contact contact, AddressBook addressBook) throws AddressBookException;
	
	/**
	 * Removes existing contact from address book
	 * 
	 * @param contact contact to be removed
	 * @param addressBook  Address book from which contact will be removed
	 * @throws AddressBookException Exception will be thrown for invalid input
	 */
	public void removeContactFromAddressBook(Contact contact, AddressBook addressBook) throws AddressBookException;
	
	/**
	 * Prints all contacts from address book passed
	 * 
	 * @param addressBook  Address book from which contacts will be printed 
	 * @throws AddressBookException Exception will be thrown for invalid input
	 */
	public void printAllContactsFromAddressBook(AddressBook addressBook) throws AddressBookException;

}
