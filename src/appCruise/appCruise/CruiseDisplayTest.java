
package appCruise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CruiseDisplayTest {

    private CruiseDisplay display;

    @BeforeEach
    void setUp() {
        display = new CruiseDisplay();
    }

    @Test
    void testInitialRecordedSpeedIsZero() {
        // Use reflection to access private field for testing
        assertDoesNotThrow(() -> {
            java.lang.reflect.Field field = CruiseDisplay.class.getDeclaredField("recorded");
            field.setAccessible(true);
            int value = (int) field.get(display);
            assertEquals(0, value, "Initial recorded speed should be 0");
        });
    }

    @Test
    void testRecordUpdatesSpeed() {
        display.record(50);
        assertDoesNotThrow(() -> {
            java.lang.reflect.Field field = CruiseDisplay.class.getDeclaredField("recorded");
            field.setAccessible(true);
            int value = (int) field.get(display);
            assertEquals(50, value, "Recorded speed should be updated to 50");
        });
    }

    @Test
    void testEnableChangesState() {
        display.enabled();
        assertDoesNotThrow(() -> {
            java.lang.reflect.Field field = CruiseDisplay.class.getDeclaredField("cruiseOn");
            field.setAccessible(true);
            boolean state = (boolean) field.get(display);
            assertTrue(state, "Cruise control should be enabled");
        });
    }

    @Test
    void testDisableChangesState() {
        display.disabled();
        assertDoesNotThrow(() -> {
            java.lang.reflect.Field field = CruiseDisplay.class.getDeclaredField("cruiseOn");
            field.setAccessible(true);
            boolean state = (boolean) field.get(display);
            assertFalse(state, "Cruise control should be disabled");
        });
    }

    @Test
    void testDrawRecordedDoesNotThrow() {
        Graphics g = display.getGraphics();
        assertDoesNotThrow(() -> display.drawRecorded(g, 10, 10, 55));
    }
}
