package com.szm.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.accessibility.AccessibleAttributeSequence;

import org.springframework.stereotype.Service;

import com.szm.springmvc.domain.Product;
import com.szm.springmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
  private Map<Long, Product> products=new HashMap<Long, Product>();
  private AtomicLong generator =new AtomicLong();
  
  public ProductServiceImpl(){
	 Product product=new Product();
	 product.setName("Mibook");
	 product.setDescription("Mibook iwrite code is");
	 product.setPrice(4999.0d);
  }
  @Override
  public Product add(Product product){
	  long newid=generator.incrementAndGet();
	  product.setId(newid);
	  products.put(newid, product);
	  return product;
  }
  @Override
  public Product get(long id){
	  return products.get(id);
  }

}
