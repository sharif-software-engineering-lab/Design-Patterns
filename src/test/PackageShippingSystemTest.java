import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ShippingSystemTest {

    private Package aPackage;
    private ShippingStrategy standardShipping;
    private ShippingStrategy expressShipping;

    @Before
    public void setUp() {
        standardShipping = new StandardShippingStrategy();
        expressShipping = new ExpressShippingStrategy();
        aPackage = new Package(5); // Assuming constructor takes weight
        aPackage.setShippingStrategy(standardShipping); // Set initial shipping strategy
    }

    @Test
    public void shouldCalculateStandardShippingCost() {
        aPackage.setShippingStrategy(standardShipping);
        double cost = aPackage.calculateShippingCost();
        assertEquals(12.5, cost, 0.01); // Assuming a rate of 2.5 per weight unit
    }

    @Test
    public void shouldCalculateExpressShippingCost() {
        aPackage.setShippingStrategy(expressShipping);
        double cost = aPackage.calculateShippingCost();
        assertEquals(17.5, cost, 0.01); // Assuming a rate of 3.5 per weight unit
    }

    @Test
    public void shouldSwitchShippingStrategy() {
        aPackage.setShippingStrategy(standardShipping);
        double standardCost = aPackage.calculateShippingCost();
        aPackage.setShippingStrategy(expressShipping);
        double expressCost = aPackage.calculateShippingCost();
        assertNotEquals(standardCost, expressCost);
    }

}
