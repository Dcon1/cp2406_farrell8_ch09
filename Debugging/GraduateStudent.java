/**
 * Created by danny on 7/10/2017.
 */
public class GraduateStudent extends Student
{
    public static final double GRAD_TUITION = 6000;
    GraduateStudent(String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = GRAD_TUITION;
    }
}