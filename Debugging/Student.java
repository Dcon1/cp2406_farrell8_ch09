/**
 * Created by danny on 7/10/2017.
 * used solutions alot
 */
public abstract class Student
{
    private String id;
    private String lastName;
    double tuition;
    Student(String id, String name)
    {
        setId(id);
        setLastName(name);
    }
    private void setId(String idNum)
    {
        id = idNum;
    }
    private void setLastName(String name)
    {
        lastName = name;
    }
    public String getId()
    {
        return id;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getTuition()
    {
        return tuition;
    }
    public abstract void setTuition();
}