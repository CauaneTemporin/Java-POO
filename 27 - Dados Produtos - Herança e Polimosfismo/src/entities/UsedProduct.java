package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufacture;
	
	public UsedProduct() {
	super();	
	}

	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String priceTag() {
		return "Produto: " + name + "(used), preço total: $"+ String.format("%.2f", price) + "(Manufacture date : " +
      manufacture + ")");
	
	}
	
}
