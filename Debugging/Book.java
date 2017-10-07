import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by danny on 7/10/2017.
 */
public abstract class Book {
    String title =  new String();
    double price;
    public Book(String t)
    {
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setprice();
}
