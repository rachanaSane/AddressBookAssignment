package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import exception.AddressBookException;
import model.AddressBook;
import model.Contact;
import model.UserApp;

public class UserAppServiceImpl implements UserAppService {

	@Override
	public void addAddressBook(AddressBook addressBook, UserApp userApp) throws AddressBookException {
		if(addressBook == null || userApp == null)
			throw new AddressBookException("addressBook or userApp is null");
		
		List<AddressBook> addressBooks = userApp.getAddressBookList();
		
		if(addressBooks ==null) {
			addressBooks = new ArrayList<AddressBook>();
		}
		
		addressBooks.add(addressBook);
	}

	@Override
	public void printUniqueContactsFromUserApp(UserApp userApp) throws AddressBookException {
		if(userApp == null || userApp.getAddressBookList() ==null )
			throw new AddressBookException("addressBookList or userApp is null");

		if(userApp.getAddressBookList().isEmpty()) {
			System.out.println("There are no address books in UserApp.");
		}
		
		List<AddressBook> addressBooks =userApp.getAddressBookList();
		Set<Contact> contacts = new HashSet<Contact>();
		addressBooks.forEach(addressBook ->{
			if(addressBook.getContactList() !=null || !addressBook.getContactList().isEmpty()) {
				contacts.addAll(addressBook.getContactList());
			}
		});
		
		contacts.forEach(contact-> System.out.println(contact));
		
	}

}
