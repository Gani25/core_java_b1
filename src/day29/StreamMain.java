package day29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import day29.entity.Product;

public class StreamMain {
	
	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
	            new Product(1, "Laptop", "Electronics", 55000, 5),
	            new Product(2, "Smartphone", "Electronics", 20000, 10),
	            new Product(3, "Tablet", "Electronics", 15000, 0),
	            new Product(4, "Shirt", "Clothing", 1500, 50),
	            new Product(5, "Jeans", "Clothing", 2000, 30),
	            new Product(6, "Blender", "Home Appliance", 3000, 15),
	            new Product(7, "Washing Machine", "Home Appliance", 25000, 3),
	            new Product(8, "Press", "Home Appliance", 5000, 5),
	            new Product(9, "MacBook", "Electronics", 145000, 0)
	        );
		System.out.println("---------------------------------------------------------");
		System.out.println("All Products are: ");
		products.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		// 1. Get only electronics products list
		List<Product> electronicProducts = 
				products.stream().filter(p -> p.getCategory().equalsIgnoreCase("electronics")).toList();
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Electronics Products are: ");
		electronicProducts.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------");
		// 2. Get All Product Names Only
		List<String> productNames = products.stream().map(p -> p.getName()).toList();
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("All Products Names are: ");
		
		productNames = productNames.stream().sorted().toList();
		
		for(int i = 0; i<productNames.size();i++)
		{
			if(i == productNames.size()-1) {
				System.out.println(productNames.get(i));
			}else {
				System.out.print(productNames.get(i)+", ");
				
			}
		}
		System.out.println("---------------------------------------------------------");
		
		System.out.println();
		// 3. Sort Products By Price
		System.out.println("---------------------------------------------------------");
		System.out.println("All Products Sorted By Price: ");
		products.stream().sorted(Comparator.comparingInt(p -> p.getPrice())).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		System.out.println();
		// 4. Sort by quantity DESC
		System.out.println("---------------------------------------------------------");
		System.out.println("All Products Sorted By Quantity In DESCENDING ORDER: ");
		products.stream().sorted(Comparator.comparingInt(Product::getQuantity).reversed()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
	}

}
