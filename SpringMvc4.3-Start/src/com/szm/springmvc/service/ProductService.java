package com.szm.springmvc.service;

import com.szm.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);

}
