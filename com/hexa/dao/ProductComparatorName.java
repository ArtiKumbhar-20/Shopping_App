package com.hexa.dao;

import java.util.Comparator;

import com.hexa.dto.Product;

public class ProductComparatorName implements Comparator<Product>{

	@Override

	public int compare(Product o1, Product o2) {

		// TODO Auto-generated method stub

		return o1.getProductName().compareToIgnoreCase(o2.getProductName());

	}

}