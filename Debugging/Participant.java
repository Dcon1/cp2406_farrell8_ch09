/**
 * Created by danny on 7/10/2017.
 * Used the solutions alot for this one.  Still getting confused on classes
 */
public class Participant
{
    private String name;
    private int age;
    private String address;
    public Participant(String n, int a, String add)
    {
        name = name;
        age = age;
        address = address;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }
    public String toString()
    {
        return name + " " + age + " years old " + address;
    }
    public boolean equals(Participant p)
    {
        boolean areEqual = false;
        if(name.equals(p.getName()))
            if(age == p.getAge())
                if(address.equals((p.getAddress())))
                    areEqual = true;
        return areEqual;
    }
}
