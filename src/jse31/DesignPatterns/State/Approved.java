package jse31.DesignPatterns.State;

public class Approved implements State {

	public Approved() {
		System.out.println("The Student was approved.");
	}

	@Override
	public void Enroll(Student student) {
		System.out.println("The Student is already enrolled.");
	}

	@Override
	public void Study(Student student) {
		System.out.println("The Student is already approved.");
	}

	@Override
	public void Approve(Student student) {
		System.out.println("The Student is already approved.");
	}

	@Override
	public void Reprove(Student student) {
		student.state = new Studying();
	}

}
