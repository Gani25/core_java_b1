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
		
		// 5. Top 3 expensive products
		System.out.println("---------------------------------------------------------");
		System.out.println();
		System.out.println("Top 3 Most Expensive Products ");
		products.stream().filter(p -> p.getQuantity()>0).sorted(Comparator.comparingInt(Product::getPrice).reversed()).limit(3).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		// 6. Display products and remove first 2 cheapest
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Products Sorted Skip cheapest 2: ");
		products.stream().sorted(Comparator.comparingInt(p -> p.getPrice())).skip(2).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		// 7. Display All Categories
		System.out.println("---------------------------------------------------------");
		System.out.println("Display All Categories ");
		products.stream().map(p -> p.getCategory()).distinct().forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		// 8. Find How Many Out Of Stocks -> count of qty == 0
		System.out.println("---------------------------------------------------------");
		System.out.println("Products counts where out of stock ");
		System.out.println(products.stream().filter(p -> p.getQuantity() == 0).count());
		System.out.println("---------------------------------------------------------");
		
		// 9. Find if any product is having price more than 180000
		System.out.println("---------------------------------------------------------");
		System.out.println("Products with value(price) more than 180000?");
		System.out.println(products.stream().anyMatch(p -> p.getPrice()> 180000));
		System.out.println("---------------------------------------------------------");
		// 9. Find if any product is having price more than 140000
		System.out.println("---------------------------------------------------------");
		System.out.println("Products with value(price) more than 140000?");
		System.out.println(products.stream().anyMatch(p -> p.getPrice()> 140000));
		System.out.println("---------------------------------------------------------");
		
		// 10. Are all my products values are above or equal to 1000?
		System.out.println("---------------------------------------------------------");
		System.out.println("Are all my products values are above or equal to 1000?");
		System.out.println(products.stream().allMatch(p -> p.getPrice() >= 1000));
		System.out.println("---------------------------------------------------------");
		// 11. Is there any product with negative quantity?
		System.out.println("---------------------------------------------------------");
		System.out.println("Is there any product with negative quantity?");
		System.out.println(products.stream().noneMatch(p -> p.getQuantity() < 0));
		System.out.println("---------------------------------------------------------");
		
		// 12. Find cheapest products
		System.out.println("---------------------------------------------------------");
		System.out.println("Cheapest Product");
		products.stream().min(Comparator.comparingInt(p -> p.getPrice())).ifPresent(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		// 13. Most Expensive Product
		
		
		
		
	}

}
