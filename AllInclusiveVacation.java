//Frank Bui
//Lab 4
//Section 8
//Instructor: Shwetha Adoni Prasad
import java.util.Scanner;
public class AllInclusiveVacation extends Vacation {
	protected double rating, price; protected String brand;
	AllInclusiveVacation(){
		budget = 5000;
		destination = "Las Vegas";
		rating = 0.5;
		price = 1000;
		brand = "F & F";
	}
	AllInclusiveVacation(int budget, String destination, double rating, double price, String brand){
		this.rating = rating;
		this.price = price;
		this.brand = brand;
		this.budget = budget;
		this.destination = destination;
	}
	public String budget() {
		budget = budget - price;
		if (budget >= 0) {
		return "This vacation was " + budget + " over budget";
		}
		else if(budget < 0) {
		budget = budget * -1;
		return "This vacation was " + budget + " under budget";
		}
		else {
			return "Error";
		}
	}
	public String toString() {
		return (super.toString() + "\nRating: " + rating + " stars\nBrand: " + brand + "\nPrice: " + price);
	}
	static Scanner scan = new Scanner(System.in);
	public double setBudget() {
		System.out.println("Please enter your budget.");
		budget = scan.nextDouble();
		return budget;
	}
	public String setDestination() {
		System.out.println("Please enter your destination");
		destination = scan.nextLine();
		destination = scan.nextLine();
		return destination;
	}
	public double setRating() {
		System.out.println("Please enter the rating");
		rating = scan.nextDouble();
		return rating;
	}
	public double setPrice() {
		System.out.println("Please enter the price");
		price = scan.nextDouble();
		return price;
	}
	public String setBrand() {
		System.out.println("Please enter your brand");
		brand = scan.nextLine();
		brand = scan.nextLine();
		return brand;
	}
}
