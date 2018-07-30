package service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exception.AddressBookException;
import model.AddressBook;
import model.Contact;

class AddressBookServiceImplTest {
	
	private AddressBookService addressBookService;
	private AddressBook  addressBook;
	private List<Contact> contactList;
	

	@BeforeEach
	void setUp() throws Exception {
		addressBookService = new AddressBookServiceImpl();	
		
		contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("John", "78982409");
		Contact contact2 = new Contact("Amy", "6378359857");
		
		contactList.add(contact1);
		contactList.add(contact2);
		
		addressBook= new AddressBook("addressBook1",contactList);
		
	}

	@Test
	void testAddContactToAddressBook() throws AddressBookException {
		Contact contact = new Contact("Peter", "23243566");			
		
		addressBookService.addContactToAddressBook(contact, addressBook);
		assertEquals(3,addressBook.getContactList().size());
	}
	
	

	@Test
	void testRemoveContactFromAddressBook() throws AddressBookException {
	
		Contact contact = new Contact("John", "78982409");
		addressBookService.removeContactFromAddressBook(contact, addressBook);
		
		assertEquals(1,addressBook.getContactList().size());
	}

	@Test
	void testPrintAllContactsFromAddressBook() throws AddressBookException {
		addressBookService.printAllContactsFromAddressBook(addressBook);
	}
	
	@Test
	void testAddNullContactToAddressBook() throws AddressBookException {		
		assertThrows(AddressBookException.class, 
				() -> addressBookService.addContactToAddressBook(null, addressBook));		
		
	}
	
	@Test
	void testAddDuplicateContactToAddressBook() throws AddressBookException {	
		Contact contact1 = new Contact("John", "78982409");
		assertThrows(AddressBookException.class, 
				() -> addressBookService.addContactToAddressBook(contact1, addressBook));		
		
	}
	
	@Test
	void testremoveContactFromNullContactList() throws AddressBookException {	
		Contact contact = new Contact("John", "78982409");
		assertThrows(AddressBookException.class, 
				() -> addressBookService.removeContactFromAddressBook(contact, new AddressBook("addressBook1",null)));	
		
	}

}
