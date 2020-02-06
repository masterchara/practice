//Frank Bui
//Lab 4
//Section 8
//Instructor: Shwetha Adoni Prasad
import java.util.Scanner; import java.util.ArrayList;
public class PiecemealVacation extends Vacation {
	ArrayList<String> Inventory = new ArrayList<String>();
	ArrayList<Integer> ItemCosts = new ArrayList<Integer>();
	PiecemealVacation(){
		budget = 600;
		destination = "bedroom";
		Inventory.add("");
		ItemCosts.add(0);
		ItemCosts.add(0);
		ItemCosts.add(0);
	}
	PiecemealVacation(ArrayList<Integer> ItemCosts, ArrayList<String> Inventory, double budget, String destination){
		this.budget = budget;
		this.destination = destination;
		this.ItemCosts = ItemCosts;
		this.Inventory = Inventory;
	}
	public String toString() {
		String life = "";
		for (int I = 0; I < Inventory.size(); I++){
		life = life + "\nItem:" + Inventory.get(I) + " that costs " + ItemCosts.get(I);
		}
		return (super.toString() + life);
	}
	public String budget() {
		int price = 0;
		for (int j = 0; j < ItemCosts.size(); j++) {
			price = price + ItemCosts.get(j);
		}
			budget = budget - price;
			if (budget >= 0)
			return "This vacation was " + budget + " over budget";
			else if(budget < 0) {
			budget = budget * -1;
			return "This vacation was " + budget + " under budget";
			}
			else {
				return "Failed";
			}
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
	public ArrayList<String> setItems() {
		char yn = 'n'; int i = 0;
		while (yn == 'n' || yn == 'N') {
		System.out.println("Please enter the next item");
		Inventory.set(i, scan.next());
		
		System.out.println("Are you done entering items? Y/N");
		yn = scan.next().charAt(0);
		i++;
		if(yn == 'n' || yn == 'N') {
		Inventory.add("");
		}
		}
		return Inventory;
	}
	public ArrayList<Integer> setItemCosts() {
		for(int i = 0; i < Inventory.size(); i++) {
			System.out.println("Please enter the cost for " + Inventory.get(i));
			ItemCosts.add(scan.nextInt());
		}
		return ItemCosts;
	}
}
