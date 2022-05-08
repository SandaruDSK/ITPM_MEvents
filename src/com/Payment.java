package com;

public class Payment {
	
	
	private int id;
    private String fname;
    private String lname;
    private String ctype;
    private int cnumber;
    private int  exmonth;
    private int  exyear;
    private int  cvn;
    private double  tot;
    
    
    
    public int getId() {
		return id;
	}
    

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

	public int getExmonth() {
		return exmonth;
	}

	public void setExmonth(int exmonth) {
		this.exmonth = exmonth;
	}

	public int getExyear() {
		return exyear;
	}

	public void setExyear(int exyear) {
		this.exyear = exyear;
	}

	public int getCvn() {
		return cvn;
	}

	public void setCvn(int cvn) {
		this.cvn = cvn;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	
    
    
    
    public Payment(int id, String fname, String lname, String ctype, int cnumber, int  exmonth, int  exyear, int  cvn, double  tot ) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.ctype = ctype;
		this.cnumber = cnumber;
		this.exmonth = exmonth;
		this.exyear = exyear;
		this.cvn = cvn;
		this.tot = tot;
	}

    public Payment() {
		super();
		
	}

}
