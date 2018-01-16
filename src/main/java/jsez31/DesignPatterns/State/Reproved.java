package jsez31.DesignPatterns.State;

public class Reproved implements State {

	public Reproved() {
		System.out.println("The Student was reproved.");
	}
	
	@Override
	public void Enroll(Student student) {
		System.out.println("The Student is already enrolled.");
	}

	@Override
	public void Study(Student student) {
		student.state = new Studying();
	}

	@Override
	public void Approve(Student student) {
		System.out.println("The Student needs to study first.");
	}

	@Override
	public void Reprove(Student student) {
		System.out.println("The Student is already reproved.");
	}

}
