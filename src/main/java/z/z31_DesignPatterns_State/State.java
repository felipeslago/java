package z.z31_DesignPatterns_State;

public interface State {

    public void Enroll(Student student);

    public void Study(Student student);

    public void Approve(Student student);

    public void Reprove(Student student);

}
