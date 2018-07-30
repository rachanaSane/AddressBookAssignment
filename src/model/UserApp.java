package model;

import java.util.List;

/**
 * Represents Address Book User application holding multiple address books
 * @author Rachana
 *
 */
public class UserApp {
	
	private String username;
	private List<AddressBook> addressBookList;
	
	public UserApp() {
		
	}
	
	public UserApp(String username, List<AddressBook> addressBookList) {
		super();
		this.username = username;
		this.addressBookList = addressBookList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<AddressBook> getAddressBookList() {
		return addressBookList;
	}
	public void setAddressBookList(List<AddressBook> addressBookList) {
		this.addressBookList = addressBookList;
	}
	
	
	

}
