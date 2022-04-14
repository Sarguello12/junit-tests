import org.junit.*;
import static org.junit.Assert.*;

public class KitchenTest {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("Yellow Corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("Blue Corn");
        kitchenWithMany.add("Yellow Corn");
        kitchenWithMany.add("White Corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());

        emptyKitchen.add("Any Tortilla");
        assertFalse(emptyKitchen.isEmpty());

        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testRemove(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyKitchen.contains("Blue Corn"));
        assertTrue(kitchenWithOne.contains("Yellow Corn"));
        assertTrue(kitchenWithMany.contains("White Corn"));
    }
}
