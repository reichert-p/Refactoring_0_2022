import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieTest {

    @Test
    public void everything(){
        Movie m = new Movie("BttF", 3);
        Assert.assertEquals(m.getPriceCode(),3);
        Assert.assertEquals(m.getTitle(), "BttF");
        m.setPriceCode(77);
        Assert.assertEquals(m.getPriceCode(),77);
    }







}
