package collection3;

public class Ac {
	
	private String brand;
	private String color;
	private float capacity;
	private boolean isSmart;
	private int price;
	
	public Ac(String brand, String color, float capacity, boolean isSmart, int price) {
		this.brand = brand;
		this.color = color;
		this.capacity = capacity;
		this.isSmart = isSmart;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public float getCapacity() {
		return capacity;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ac [brand=" + brand + ", color=" + color + ", capacity=" + capacity + ", isSmart=" + isSmart
				+ ", price=" + price + "]";
	}
	
}
