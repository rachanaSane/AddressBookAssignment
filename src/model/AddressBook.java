package model;

import java.util.List;

/**
 * Represents address book containing contact entries
 * @author Rachana
 *
 */
public class AddressBook {
	
	private String name;
	private List<Contact> contactList;
	
	public AddressBook() {
		
	}
	
	public AddressBook(String name, List<Contact> contactList) {
		super();
		this.name = name;
		this.contactList = contactList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	
	
	

}
