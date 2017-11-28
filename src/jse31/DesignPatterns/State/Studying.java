package jse31.DesignPatterns.State;

public class Studying implements State {

	public Studying() {
		System.out.println("The Student is studying.");
	}

	@Override
	public void Enroll(Student student) {
		System.out.println("The Student is already enrolled.");
	}

	@Override
	public void Study(Student student) {
		System.out.println("The Student is already studying.");
	}

	@Override
	public void Approve(Student student) {
		student.state = new Approved();
	}

	@Override
	public void Reprove(Student student) {
		student.state = new Reproved();
	}

}
