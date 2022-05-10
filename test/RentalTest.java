import org.testng.Assert;
import org.testng.annotations.Test;

public class RentalTest {
    @Test
    public void everything(){
        Rental r = new Rental(new Movie("moviename",4),30);
        Assert.assertEquals(r.getMovie().getTitle(),"moviename");
        Assert.assertEquals(r.getDaysRented(), 30);
    }
}
