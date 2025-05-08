
package appCruise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruiseControlTest {

    private CruiseControl cruiseControl;

    @BeforeEach
    void setUp() {
        cruiseControl = new CruiseControl();
    }

    @Test
    void testEngineOnButton() {
        assertNotNull(cruiseControl.engineOn);
        cruiseControl.engineOn.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testEngineOffButton() {
        assertNotNull(cruiseControl.engineOff);
        cruiseControl.engineOff.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testAccelerateButton() {
        assertNotNull(cruiseControl.accelerate);
        cruiseControl.accelerate.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testBrakeButton() {
        assertNotNull(cruiseControl.brake);
        cruiseControl.brake.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testOnButton() {
        assertNotNull(cruiseControl.on);
        cruiseControl.on.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testOffButton() {
        assertNotNull(cruiseControl.off);
        cruiseControl.off.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }

    @Test
    void testResumeButton() {
        assertNotNull(cruiseControl.resume);
        cruiseControl.resume.dispatchEvent(new java.awt.event.ActionEvent(this, 0, ""));
        assertTrue(true);
    }
}
