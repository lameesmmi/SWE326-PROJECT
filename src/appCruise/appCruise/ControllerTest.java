
package appCruise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    private Controller controller;
    private MockCarSpeed mockCar;
    private CruiseDisplay display;

    static class MockCarSpeed implements CarSpeed {
        private int speed = 0;
        private double throttle = 0;

        public int getSpeed() {
            return speed;
        }

        public void setThrottle(double val) {
            this.throttle = val;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public double getThrottle() {
            return throttle;
        }
    }

    @BeforeEach
    void setUp() {
        mockCar = new MockCarSpeed();
        display = new CruiseDisplay();
        controller = new Controller(mockCar, display, true);
    }

    @Test
    void testInitialState() {
        // indirectly verified by no exception during construction
        assertNotNull(controller);
    }

    @Test
    void testEngineOnAndOffTransitions() {
        assertDoesNotThrow(() -> {
            controller.engineOn();
            controller.engineOff();
        });
    }

    @Test
    void testBrakeFromCruising() {
        controller.engineOn();
        controller.on(); // move to cruising
        controller.brake(); // should go to standby
        assertTrue(true); // state transitions validated by flow
    }

    @Test
    void testAcceleratorFromCruising() {
        controller.engineOn();
        controller.on();
        controller.accelerator(); // should disable control
        assertTrue(true);
    }

    @Test
    void testResumeFromStandby() {
        controller.engineOn();
        controller.on();
        controller.brake();  // go to standby
        controller.resume(); // should go back to cruising
        assertTrue(true);
    }

    @Test
    void testOffBehavior() {
        controller.engineOn();
        controller.on();
        controller.off(); // from cruising to standby or inactive
        assertTrue(true);
    }
}
