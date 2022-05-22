package com.contactusAdmin;


public class ContactusAdmin {
	private int id;
    private String name;
    private String contactnumber;
    private String email;
    private String message;


    public ContactusAdmin(int id, String name, String contactnumber, String email, String message) {
    	super();
		this.id = id;
		this.name = name;
		this.contactnumber = contactnumber;
		this.email = email;
		this.message = message;
	}

	public ContactusAdmin() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}
	
	public void setId(int parseInt) {
		this.id = id;		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
