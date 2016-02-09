package robot5113;

import robotshootersubsystem.AimParameters;
import robotshootersubsystem.ShooterSubSystem;

public class Robot5113Main {

	public static void main(String[] args) {

		ShooterSubSystem shooter = new ShooterSubSystem();

		Double requestedDistance = 5.76;
		AimParameters testAimParms = shooter.getParameters(requestedDistance);

		System.out.println("testAimParms.getDistanceFt() = " + testAimParms.getDistanceFt());
		System.out.println("testAimParms.getWheelRotationVelocity() = " + testAimParms.getWheelRotationVelocity());
		System.out.println("testAimParms.getCarriageTiltAngle() = " + testAimParms.getCarriageTiltAngle());
		
		System.out.println(shooter.getAimParmFromArray(requestedDistance));
		
	}

}
