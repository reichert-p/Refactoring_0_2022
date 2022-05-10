import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTest {
    @Test
    public void amountFor(){
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);

        String statement = "Rental Record for joe" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "\t" + "movie1" + "\t" + "\t" + "10" + "\t" + "30.0" + "\n";
        statement += "\t" + "movie2" + "\t" + "\t" + "5" + "\t" + "4.5" + "\n";
        statement += "Amount owed is " + "34.5" + "\n";
        statement += "You earned " + "3" + " frequent renter points";

        Assert.assertEquals( c1.statement(),statement);
    }

}
