import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Product> orderList = new ArrayList<Product>();

	public Order() {
		super();
	}
	public Order(List<Product> orderList) {
		super();
		this.orderList = orderList;
	}

	public List<Product> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Product> orderList) {
		this.orderList = orderList;
	}

	public void addProduct(Product product) {
		this.orderList.add(product);
	}
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		this.orderList.remove(product);
	}
	public void deleteAllProduct() {
		// TODO Auto-generated method stub
		this.orderList.removeAll(this.orderList);
	}

}
