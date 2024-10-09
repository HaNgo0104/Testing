package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.InvalidInputException;
import src.TaxiFareCalculator;

public class test {

    @Test
    public void t1() {
        var test1 = new TaxiFareCalculator();
        assertThrows(InvalidInputException.class, () -> test1.calculateFare(8, 10));
    }
    @Test
    public void t2() {
        var test1 = new TaxiFareCalculator();
        assertEquals(32000, test1.calculateFare(1, 4));   
    }

    @Test
    public void t3() {
        var test1 = new TaxiFareCalculator();
        assertEquals(49000, test1.calculateFare(1, 8));
    }

    @Test
    public void t4() {
        var test1 = new TaxiFareCalculator();
        assertEquals(80000, test1.calculateFare(1, 15));
    }

    @Test
    public void t5() {
        var test1 = new TaxiFareCalculator();
        assertEquals(60000, test1.calculateFare(2, 5));
    }

    @Test
    public void t6() {
        var test1 = new TaxiFareCalculator();
        assertEquals(165000, test1.calculateFare(2, 15));
    }

    @Test
    public void t7() {
        var test1 = new TaxiFareCalculator();
        assertEquals(150000, test1.calculateFare(5, 10));
    }

    @Test
    public void t8() {
        var test1 = new TaxiFareCalculator();
        assertEquals(350000, test1.calculateFare(5, 25));
    }
}
