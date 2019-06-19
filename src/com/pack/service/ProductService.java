package com.pack.service;

import java.util.List;

import com.pack.model.Product;
import com.pack.model.vendors;

public interface ProductService {
	public int addProduct(Product p);
	public List<Product> listProduct();
	public Product viewProduct(int id);
	public int removeProduct(int id);
	public List<vendors> listVendors();
	public int modifyQauntity(int quan,int id);
}
