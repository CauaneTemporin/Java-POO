package entities;

public class Product {

	protected String name;
	protected Double price = 0.0;
	
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return "Produto: " +name + ", preço total: $"+ String.format("%.2f", price);
	}
	
}
