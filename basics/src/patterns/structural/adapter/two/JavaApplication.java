package patterns.structural.adapter.two;

public class JavaApplication {
 public void savePeople(People people) { //insert
	 System.out.println("People saved");
 }
 public void loadPeople (People people) {
	 System.out.println("People loaded");
 }
 
 public void updatePeople (People people) {
	 System.out.println("People updated");
	 
 }
 
 public void deletePeople (People people) {
	 System.out.println("People deleted");
 }
 
}
