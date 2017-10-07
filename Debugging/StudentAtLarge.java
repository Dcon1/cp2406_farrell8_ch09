/**
 * Created by danny on 7/10/2017.
 */
public class StudentAtLarge extends Student
{
    private static final double SAL_TUITION = 2000;
    public StudentAtLarge (String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = SAL_TUITION;
    }
}