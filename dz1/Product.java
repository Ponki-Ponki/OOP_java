package dz1;

/**
 * Product
 */
public class Product {
	String name;
	Double price;
	Integer quantity;
	String unit;

	/**
	 * @param name Название товара
	 * @param price Цена
	 * @param quantity Количество
	 * @param unit еденица измерения товара
	 */
	public Product(String name, Double price, Integer quantity, String unit) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.unit = unit;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit;
	}
}