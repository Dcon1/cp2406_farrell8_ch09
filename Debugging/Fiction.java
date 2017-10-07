/**
 * Created by danny on 7/10/2017.
 */
public abstract class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }
}