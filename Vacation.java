//Frank Bui
//Lab 4
//Section 8
//Instructor: Shwetha Adoni Prasad
public abstract class Vacation {
	protected double budget = 0;
	protected String destination = "hi";
	public String toString() {
		return (this.getClass().getName() + "\nBudget: " + budget + "\nDestination: " + destination);
	}
	public abstract String budget();
}
	