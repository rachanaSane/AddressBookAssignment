package service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exception.AddressBookException;
import model.AddressBook;
import model.Contact;
import model.UserApp;

class UserAppServiceImplTest {
	
	private UserAppService userAppService;
	private UserApp userApp;
	private AddressBook  addressBook;
	private List<Contact> contactList;
	private List<AddressBook> addressBookList;

	@BeforeEach
	void setUp() throws Exception {
		userAppService = new UserAppServiceImpl();
		
		contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("John", "78982409");
		Contact contact2 = new Contact("Amy", "6378359857");
		
		contactList.add(contact1);
		contactList.add(contact2);
		
		addressBook= new AddressBook("addressBook1",contactList);
		
		addressBookList = new ArrayList<AddressBook>();		
		addressBookList.add(addressBook);
		
		userApp = new UserApp("app1", addressBookList);
	}

	@Test
	void testAddAddressBook() throws AddressBookException {
		userAppService.addAddressBook(new AddressBook("addressBook2",new ArrayList<Contact>()), userApp);
		assertEquals(2,userApp.getAddressBookList().size());
	}

	@Test
	void testPrintUniqueContactsFromUserApp() throws AddressBookException {
		
		List<Contact> contactListNew = new ArrayList<Contact>();
		
		Contact contact3 = new Contact("John", "78982409");
		Contact contact4 = new Contact("Peter", "6378359857");
		
		
		contactListNew.add(contact3);
		contactListNew.add(contact4);
		
		AddressBook addressBookNew= new AddressBook("addressBook2",contactListNew);
		userAppService.addAddressBook(addressBookNew, userApp);
		
		userAppService.printUniqueContactsFromUserApp(userApp);
	
		
	}
	
	@Test
	void testNullAddressListForUserApp() throws AddressBookException {		
		assertThrows(AddressBookException.class, 
				() -> userAppService.printUniqueContactsFromUserApp(new UserApp("app1", null)));		
		
	}

}
