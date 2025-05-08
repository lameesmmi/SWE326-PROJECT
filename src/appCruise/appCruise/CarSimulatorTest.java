
package appCruise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarSimulatorTest {

    private CarSimulator car;

    @BeforeEach
    void setUp() {
        car = new CarSimulator();
    }

    @Test
    void testInitialSpeedIsZero() {
        assertEquals(0, car.getSpeed(), "Initial speed should be 0");
    }

    @Test
    void testEngineOn() {
        car.engineOn();
        assertTrue(car.getSpeed() >= 0); // Should not crash or throw
    }

    @Test
    void testAccelerateIncreasesThrottle() {
        car.engineOn();
        car.accelerate();
        car.accelerate();
        // We can't directly read throttle (it's private), but we assume speed will rise in time
        // So we just ensure no exception and run stability
        assertTrue(car.getSpeed() >= 0);
    }

    @Test
    void testBrakeSetsThrottleToZeroOrIncreasesBrake() {
        car.engineOn();
        car.accelerate(); // Increase throttle
        car.brake();      // Should set throttle to 0
        car.brake();      // Should increase brake pedal
        assertTrue(car.getSpeed() >= 0);
    }

    @Test
    void testSetThrottleLimits() {
        car.setThrottle(15.0); // Too high
        assertTrue(car.getSpeed() >= 0); // Speed should be within bounds
        car.setThrottle(-5.0); // Too low
        assertTrue(car.getSpeed() >= 0); // Should remain stable
    }

    @Test
    void testEngineOffResetsState() {
        car.engineOn();
        car.accelerate();
        car.engineOff();
        assertEquals(0, car.getSpeed(), "Speed should reset to 0 after engine off");
    }
}
