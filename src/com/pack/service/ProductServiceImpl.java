package com.pack.service;

import java.util.List;

import com.pack.dao.ProductDaoImpl;
import com.pack.model.Product;
import com.pack.model.vendors;

public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		return new ProductDaoImpl().addProduct(p);
	}

	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return new ProductDaoImpl().listProduct();
	}
	public Product viewProduct(int pid)
	{
		return new ProductDaoImpl().viewProduct(pid);
	}

	@Override
	public int removeProduct(int id) {
		// TODO Auto-generated method stub
		return new ProductDaoImpl().removeProduct(id);
	}
	@Override
	public List<vendors> listVendors() {
		// TODO Auto-generated method stub
		return new ProductDaoImpl().listVendors();
	}

	@Override
	public int modifyQauntity(int quan,int id) {
		// TODO Auto-generated method stub
		return new ProductDaoImpl().modifyQauntity(quan,id);
	}


}
