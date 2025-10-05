package poppyplaytime.model.dto;

import java.util.Map;
import java.util.Objects;

public class Toy {

	private String name;
	private int age;
	private int price;
	private String color;
	private String year;
	private Map material;
	
	public Toy() {}
	public Toy(String name, int age, int price, String color, String year, Map material) {
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.year = year;
		this.material = material;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge () {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Map getMaterial() {
		return material;
	}
	public void setMaterial(Map material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", year=" + year
				+ ", material=" + material + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, color, material, name, price, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && price == other.price && Objects.equals(year, other.year);
	}
	
	
	
	
}
