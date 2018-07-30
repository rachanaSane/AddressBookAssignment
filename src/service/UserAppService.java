package service;

import exception.AddressBookException;
import model.AddressBook;
import model.UserApp;

/**
 * Provides services for UserApplication 
 * @author Rachana
 *
 */
public interface UserAppService {
	
	/**
	 * Adds new address book into User application
	 * 
	 * @param addressBook address book to be added
	 * @param userApp Address book will be added in this userApp
	 * @throws AddressBookException Exception will be thrown for invalid input
	 */
	public void addAddressBook(AddressBook addressBook,UserApp userApp) throws AddressBookException;
	
	/**
	 * Prints unique set of all contacts across address books
	 * 
	 * @param userApp All address books from this userApp will be considered.
	 * @throws AddressBookException
	 */
	public void printUniqueContactsFromUserApp(UserApp userApp) throws AddressBookException;

}
