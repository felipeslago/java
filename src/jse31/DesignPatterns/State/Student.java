package jse31.DesignPatterns.State;

public class Student {

	private String name;
	private double grade;
	protected State state;
	
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
		this.state = new Enrolled();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void enroll() {
		this.state.Enroll(this);
	}
	
	public void study() {
		this.state.Study(this);
	}
	
	public void approve() {
		this.state.Approve(this);
	}
	
	public void reprove() {
		this.state.Reprove(this);
	}
	
	public boolean evaluate() {
		if(this.grade >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
}
