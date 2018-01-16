package jsez31.DesignPatterns.State;

public interface State {

	public void Enroll(Student student);
	public void Study(Student student);
	public void Approve(Student student);
	public void Reprove(Student student);
	
}
