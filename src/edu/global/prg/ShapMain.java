package edu.global.prg;

import edu.global.prg.shape.Circle;
import edu.global.prg.shape.Rectangle;
import edu.global.prg.shape.Shape;

class Price{
	private double Price = 0;
	public Price(double price){
		this.Price = price;
	}
	public double getPrice() {
		return Price;
	}
}
class Computer extends Price{
	public Computer(double price) {
		super(price);
	}
}
class Speaker extends Price{
	public Speaker(double price) {
		super(price);
	}
}
public class ShapMain {
	public static void checkPrice(Price price) {
		System.out.println(price.getPrice());
	}
	public static void main(String[] args) {
		Shape[] shape = {new Circle(10), new Rectangle(10, 20)};
		double area = 0;
		for(Shape s : shape) {
			area = area + s.getArea();
		}
		System.out.println(area);
		
		Computer computer = new Computer(100);
		Speaker speaker = new Speaker(50);
		checkPrice(computer);
		checkPrice(speaker);
	}	
}