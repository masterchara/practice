//Frank Bui
//Lab 4
//Section 8
//Instructor: Shwetha Adoni Prasad
/
public class TestVacation{
	public static void main(String [] args) {
//DRIVER FILE		
		
		AllInclusiveVacation v1 = new AllInclusiveVacation();
		v1.setBudget();
		v1.setDestination();
		v1.setRating();
		v1.setPrice();
		v1.setBrand();
		PiecemealVacation v2 = new PiecemealVacation();
		v2.setBudget();
		v2.setDestination();
		v2.setItems();
		v2.setItemCosts();
		System.out.println(v1);
		System.out.println(v1.budget());
		System.out.println(v2);
		System.out.println(v2.budget());
	}
}
