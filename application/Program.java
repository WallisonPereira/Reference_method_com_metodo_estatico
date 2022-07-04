package application;


import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd casa", 80.00));
		
		
		list.forEach(Product::staticPriceUpdate);
		
		list.forEach(System.out::println);
		
	}
}