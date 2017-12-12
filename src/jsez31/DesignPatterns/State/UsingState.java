package jsez31.DesignPatterns.State;

public class UsingState {

	// The State Pattern is used to suppress many IFs in the code to change States
	// In other words, the responsibility of knowing if a State is valid or when apply the State is from the State class
	
	// The solution is create one class for each state, and each state knows what the condition for being this state
	// In this case the constructor creates the Enrolled state by default and this states knows what state can be defined
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Carl", 0.0);
		
		s1.enroll();
		s1.setGrade(6.5);
		s1.approve();
		s1.study();
		
		if(s1.evaluate()) {
			s1.approve();
		} else {
			s1.reprove();
		}
		
		
	}
	
}
