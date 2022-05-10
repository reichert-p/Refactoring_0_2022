import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieTest {

    @Test
    public void everything(){
        Movie m = new Movie("BttF", PriceCode.CHILDRENS);
        Assert.assertEquals(m.getPriceCode(),PriceCode.CHILDRENS);
        Assert.assertEquals(m.getTitle(), "BttF");
    }







}
