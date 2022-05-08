package model;

public class Events_model {
	private int id;
	private String event_name;
	private String type;
	private String type2;
	private String city;
	private String pay_plan;
	private double amount;
	private String description;
	private String cont_name;
	private String cont_phone;
	private String feature_1;
	private String feature_2;
	private String feature_3;
	private String feature_4;
	private String link;
	private String featured;
	private String listed;
	private int f_id;
	
	
	public void setEvent_name(String event_name) {
		this.event_name = event_name; 
	}
	
	public String getEvent_name() {
		return event_name; 
	}

	public void setType(String type) {
		this.type = type; 
	}
	
	public String getType() {
		return type; 
	}
	public void setType2(String type2) {
		this.type2 = type2; 
	}
	
	public String getType2() {
		return type2; 
	}
	public void setCity(String city) {
		this.city = city; 
	}
	
	public String getCity(){
		return city; 
	}
	public void setPay_plan(String pay_plan) {
		this.pay_plan = pay_plan; 
	}
	
	public String getPay_plan() {
		return pay_plan; 
	}
	public void setAmount(double amount) {
		this.amount = amount; 
	}
	
	public double getPrice() {
		return amount;   
	}
	public void setDescription(String description) {
		this.description = description; 
	}
	
	public String getDescription() {
		return description; 
	}
	public void setCont_name(String cont_name) {
		this.cont_name = cont_name; 
	}
	
	public String getCont_name() {
		return cont_name; 
	}
	public void setCont_phone(String cont_phone) {
		this.cont_phone = cont_phone; 
	}
	public String getCont_phone() {
		return cont_phone; 
	}
	
	public void setFeature_1(String feature_1) {
		this.feature_1 = feature_1; 
	}
	
	public String getFeature_1() {
		return feature_1; 
	}
	
	public void setFeature_2(String feature_2) {
		this.feature_2 = feature_2; 
	}
	
	public String getFeature_2() {
		return feature_2; 
	}
	public void setFeature_3(String feature_3) {
		this.feature_3 = feature_3; 
	}
	
	public String getFeature_3() {
		return feature_3; 
	}
	public void setFeature_4(String feature_4) {
		this.feature_4 = feature_4; 
	}
	
	public String getFeature_4() {
		return feature_4; 
	}
	public void setLink(String link) {
		this.link = link; 
	}
	
	public String getLink() {
		return link; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeatured() {
		return featured;
	}

	public void setFeatured(String featured) {
		this.featured = featured;
	}

	public String getListed() {
		return listed;
	}

	public void setListed(String listed) {
		this.listed = listed;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	

}
