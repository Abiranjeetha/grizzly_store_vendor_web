package com.pack.model;

public class Product {
	private int pid;
	private String pcategory;
	private String pname;
	private String pdescription;
	private float pprice;
	private String pbrand;
	private int rating;
	private int discount;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Product(int pid, String pcategory, String pname, String pdescription, float pprice, String pbrand,
			int rating, int discount) {
		super();
		this.pid = pid;
		this.pcategory = pcategory;
		this.pname = pname;
		this.pdescription = pdescription;
		this.pprice = pprice;
		this.pbrand = pbrand;
		this.rating = rating;
		this.discount = discount;
	}

	public Product(String pcategory, int pid, String pname, String pdescription, float pprice) {
		super();
		this.pcategory = pcategory;
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.pprice = pprice;
	}
	
}
