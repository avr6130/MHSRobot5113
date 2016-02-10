package robotshootersubsystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShooterSubSystemTest {
	
	AimParameters aimParms;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUpdateMap() {
		ShooterSubSystem shooter = new ShooterSubSystem();
		AimParameters testAimParms = new AimParameters();
		
		testAimParms = shooter.updateArrayMap(16.5, 3.0, 4.0);
		
		testAimParms = shooter.getParameters(16.5);
		
		System.out.println("testUpdateMap: " + testAimParms);
		
		assertTrue(testAimParms.getDistanceFt().toString().equals("16.5"));
		assertTrue(testAimParms.getWheelRotationVelocity().toString().equals("3.0"));
		assertTrue(testAimParms.getCarriageTiltAngle().toString().equals("4.0"));
	}
	@Test
	public final void testGetParameters() {
		ShooterSubSystem shooter = new ShooterSubSystem();
		AimParameters testAimParms = shooter.getParameters(4.25);

		System.out.println("testAimParms.getDistanceFt() = " + testAimParms.getDistanceFt());
		System.out.println("testAimParms.getWheelRotationVelocity() = " + testAimParms.getWheelRotationVelocity());
		System.out.println("testAimParms.getCarriageTiltAngle() = " + testAimParms.getCarriageTiltAngle());
		
		
		assertTrue(testAimParms.getDistanceFt().toString().equals("4.25"));
		assertTrue(testAimParms.getWheelRotationVelocity().toString().equals("23.0"));
		assertTrue(testAimParms.getCarriageTiltAngle().toString().equals("70.0"));
		//		fail("Not yet implemented");
	}

}
