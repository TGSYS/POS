import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DiscountTest {

	/*@Test
	public void testAllDifferentItem() {
		
		//GIVEN
		DiscountUtil d = new DiscountUtil();
		List<SKUItems> input = new ArrayList<SKUItems>();
		input.add(new SKUItems("ABCS01", 1));
		input.add(new SKUItems("DEFS01", 2));
		input.add(new SKUItems("XYZS01", 3));
		int expected = 0;
		
		//WHEN
		int result = d.computeDiscount(input);
		//THEN
		assertEquals(expected, result);
	}*/
	
	@Test
	public void AddProductTest(){		
		int expected = 3;
		Order order = new Order();
		order.addProduct(new Product("Item 1",1.0));
		order.addProduct(new Product("Item 2",2.72));
		order.addProduct(new Product("Item 3",1.6));
		
		assertEquals(expected, order.getOrderList().size());
	}
	

	@Test
	public void DeleteProductTest(){		
		int expected = 1;
		//given
		Order order = new Order();
		List<Product> productList = new ArrayList<Product>();
		Product prod1 = new Product("Item 1",1.0);
		Product prod2 = new Product("Item 2",2.72);
		Product prod3 = new Product("Item 3",1.6);
		productList.add(prod1);
		productList.add(prod2);
		productList.add(prod3);
		order.setOrderList(productList);
		
		//when
		order.deleteProduct(prod2);
		order.deleteProduct(prod3);
		
		//then
		assertEquals(expected, order.getOrderList().size());
	}
	
	@Test
	public void DeleteAllProductTest(){		
		int expected = 0;
		//given
		Order order = new Order();
		List<Product> productList = new ArrayList<Product>();
		Product prod1 = new Product("Item 1",1.0);
		Product prod2 = new Product("Item 2",2.72);
		Product prod3 = new Product("Item 3",1.6);
		productList.add(prod1);
		productList.add(prod2);
		productList.add(prod3);
		order.setOrderList(productList);
		
		//when
		order.deleteAllProduct();
		
		//then
		assertEquals(expected, order.getOrderList().size());
	}
}
