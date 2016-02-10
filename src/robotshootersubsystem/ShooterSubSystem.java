/**
 * 
 */
package robotshootersubsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aricco
 *
 */
public class ShooterSubSystem {

	public ShooterSubSystem() {


		/* 
		This is a lookup table for shooter subsystem. It contains 
		Distance From Tower (meters)	Distance From Tower (Feet)	Velocity (m/s)	Angle (degrees)
		6.096074128				20				38		35

		The values have been previously calculated using a spreadsheet found at
		http://www.chiefdelphi.com/media/papers/3188

		Specifically, the rotational velocity of the shooter wheels and angle of the shooting 
		platform (carriage) were calculated in 0.25ft increments from 2 through 20 feet.

		Each section below is broken up into the same 0.25ft increments.

		The data structure that houses this lookup table is similar to a multidimensional array.
		In Java, this was accomplished with a Map of Lists.

		All that is needed is to provide a distance and the specific velocity and angle for that
		distance will be returned. 

		To insert data used as aiming parameters, specify the following:
		initialParms.add(new AimParameters(19.75, 38.0, 35.0)); where 

		19.75 is the distance to the tower/target in feet
		38.0  is the calculated velocity of the shooter wheels in meters/second
		35.0  is the calculated tilt angle of the shooter carriage

		The functionality works by using the integer portion as the value to be looked up in the table,
		even though a decimal number (Double) is required input.
		There will be at most 4 possible values for each integer position. For example, for 19 ft there
		may be
		19.75, 38.0, 35.0
		19.5,  38.0, 35.0
		19.25, 37.0, 34.0
		19.0,  36.0, 33.0

		It makes no difference whether the data inserted is unique or identical to previous values at 19.XX ft. 
		If the user requests the data at 19.3 feet, the values at 19.25 will be returned.

		*/

		// Create the ArrayList of AimParameters
		ArrayList<AimParameters> initialParms = new ArrayList<AimParameters>();

		// Store distance in feet, wheel velocity, and tilt angle into the initial parameters variable
		initialParms.add(new AimParameters(20.0, 38.0, 35.0));

		// Insert the initial parameters into Map position 20 
		ShooterSubSystem.aimParmsTable.put(20, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(19.75, 38.0, 35.0));
		initialParms.add(new AimParameters(19.5, 38.0, 35.0));
		initialParms.add(new AimParameters(19.25, 38.0, 35.0));
		initialParms.add(new AimParameters(19.0,38.0,35.0));

		ShooterSubSystem.aimParmsTable.put(19, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(18.75,38.0,35.0));
		initialParms.add(new AimParameters(18.5,38.0,35.0));
		initialParms.add(new AimParameters(18.25,38.0,35.0));
		initialParms.add(new AimParameters(18.0,38.0,35.0));

		ShooterSubSystem.aimParmsTable.put(18, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(17.75,36.0,37.0));
		initialParms.add(new AimParameters(17.5,36.0,37.0));
		initialParms.add(new AimParameters(17.25,36.0,37.0));
		initialParms.add(new AimParameters(17.0,36.0,37.0));

		ShooterSubSystem.aimParmsTable.put(17, initialParms);

		initialParms = new ArrayList<AimParameters>();
		initialParms.add(new AimParameters(16.75,36.0,37.0));
		initialParms.add(new AimParameters(16.5,36.0,37.0));
		initialParms.add(new AimParameters(16.25,36.0,37.0));
		initialParms.add(new AimParameters(16.0,33.0,41.0));

		ShooterSubSystem.aimParmsTable.put(16, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(15.75,33.0,41.0));
		initialParms.add(new AimParameters(15.5,33.0,41.0));
		initialParms.add(new AimParameters(15.25,33.0,41.0));
		initialParms.add(new AimParameters(15.0,33.0,41.0));

		ShooterSubSystem.aimParmsTable.put(15, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(14.75,33.0,41.0));
		initialParms.add(new AimParameters(14.5,33.0,41.0));
		initialParms.add(new AimParameters(14.25,33.0,41.0));
		initialParms.add(new AimParameters(14.0,33.0,41.0));

		ShooterSubSystem.aimParmsTable.put(14, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(13.75,31.0,44.0));
		initialParms.add(new AimParameters(13.5,31.0,44.0));
		initialParms.add(new AimParameters(13.25,31.0,44.0));
		initialParms.add(new AimParameters(13.0,31.0,44.0));

		ShooterSubSystem.aimParmsTable.put(13, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(12.75,31.0,44.0));
		initialParms.add(new AimParameters(12.5,31.0,44.0));
		initialParms.add(new AimParameters(12.25,31.0,44.0));
		initialParms.add(new AimParameters(12.0,31.0,44.0));

		ShooterSubSystem.aimParmsTable.put(12, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(11.75,29.0,48.0));
		initialParms.add(new AimParameters(11.5,29.0,48.0));
		initialParms.add(new AimParameters(11.25,29.0,48.0));
		initialParms.add(new AimParameters(11.0,29.0,48.0));

		ShooterSubSystem.aimParmsTable.put(11, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(10.75,27.0,52.0));
		initialParms.add(new AimParameters(10.5,27.0,52.0));
		initialParms.add(new AimParameters(10.25,27.0,52.0));
		initialParms.add(new AimParameters(10.0,27.0,52.0));

		ShooterSubSystem.aimParmsTable.put(10, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(9.75,26.0,55.0));
		initialParms.add(new AimParameters(9.5,26.0,55.0));
		initialParms.add(new AimParameters(9.25,26.0,55.0));
		initialParms.add(new AimParameters(9.0,26.0,55.0));

		ShooterSubSystem.aimParmsTable.put(9, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(8.75,26.0,55.0));
		initialParms.add(new AimParameters(8.5,26.0,55.0));
		initialParms.add(new AimParameters(8.25,26.0,55.0));
		initialParms.add(new AimParameters(8.0,26.0,55.0));

		ShooterSubSystem.aimParmsTable.put(8, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(7.75,24.0,64.0));
		initialParms.add(new AimParameters(7.5,24.0,64.0));
		initialParms.add(new AimParameters(7.25,24.0,64.0));
		initialParms.add(new AimParameters(7.0,24.0,64.0));

		ShooterSubSystem.aimParmsTable.put(7, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(6.75,24.0,64.0));
		initialParms.add(new AimParameters(6.5,24.0,64.0));
		initialParms.add(new AimParameters(6.25,24.0,64.0));
		initialParms.add(new AimParameters(6.0,24.0,64.0));

		ShooterSubSystem.aimParmsTable.put(6, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(5.75,23.0,70.0));
		initialParms.add(new AimParameters(5.5,23.0,70.0));
		initialParms.add(new AimParameters(5.25,23.0,70.0));
		initialParms.add(new AimParameters(5.0,23.0,70.0));

		ShooterSubSystem.aimParmsTable.put(5, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(4.75,23.0,70.0));
		initialParms.add(new AimParameters(4.5,23.0,70.0));
		initialParms.add(new AimParameters(4.25,23.0,70.0));
		initialParms.add(new AimParameters(4.0,22.0,75.0));

		ShooterSubSystem.aimParmsTable.put(4, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(3.75,22.0,75.0));
		initialParms.add(new AimParameters(3.5,22.0,75.0));
		initialParms.add(new AimParameters(3.25,22.0,75.0));
		initialParms.add(new AimParameters(3.0,22.0,75.0));

		ShooterSubSystem.aimParmsTable.put(3, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(2.75,24.0,75.0));
		initialParms.add(new AimParameters(2.5,24.0,75.0));
		initialParms.add(new AimParameters(2.25,30.0,75.0));
		initialParms.add(new AimParameters(2.0,30.0,75.0));

		ShooterSubSystem.aimParmsTable.put(2, initialParms);
	
		// This is the alternate implementation of the lookup table. It is stored in an ArrayList, which 
		// is simply an array. The index into the array is calculated and the values returned. 
		
		// Create the ArrayList of AimParameters
		aimParmsArrayMap = new ArrayList<AimParameters>();
		
		// Store distance in feet, wheel velocity, and tilt angle into the initial parameters variable
	
		aimParmsArrayMap.add(new AimParameters(2.0,30.0,75.0));
		aimParmsArrayMap.add(new AimParameters(2.25,30.0,75.0));
		aimParmsArrayMap.add(new AimParameters(2.5,24.0,75.0));
		aimParmsArrayMap.add(new AimParameters(2.75,24.0,75.0));

		aimParmsArrayMap.add(new AimParameters(3.0,22.0,75.0));
		aimParmsArrayMap.add(new AimParameters(3.25,22.0,75.0));
		aimParmsArrayMap.add(new AimParameters(3.5,22.0,75.0));
		aimParmsArrayMap.add(new AimParameters(3.75,22.0,75.0));

		aimParmsArrayMap.add(new AimParameters(4.0,22.0,75.0));
		aimParmsArrayMap.add(new AimParameters(4.25,23.0,70.0));
		aimParmsArrayMap.add(new AimParameters(4.5,23.0,70.0));
		aimParmsArrayMap.add(new AimParameters(4.75,23.0,70.0));

		aimParmsArrayMap.add(new AimParameters(5.0,23.0,70.0));
		aimParmsArrayMap.add(new AimParameters(5.25,23.0,70.0));
		aimParmsArrayMap.add(new AimParameters(5.5,23.0,70.0));
		aimParmsArrayMap.add(new AimParameters(5.75,23.0,70.0));

		aimParmsArrayMap.add(new AimParameters(6.0,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(6.25,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(6.5,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(6.75,24.0,64.0));

		aimParmsArrayMap.add(new AimParameters(7.0,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(7.25,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(7.5,24.0,64.0));
		aimParmsArrayMap.add(new AimParameters(7.75,24.0,64.0));

		aimParmsArrayMap.add(new AimParameters(8.0,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(8.25,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(8.5,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(8.75,26.0,55.0));

		aimParmsArrayMap.add(new AimParameters(9.0,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(9.25,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(9.5,26.0,55.0));
		aimParmsArrayMap.add(new AimParameters(9.75,26.0,55.0));

		aimParmsArrayMap.add(new AimParameters(10.0,27.0,52.0));
		aimParmsArrayMap.add(new AimParameters(10.25,27.0,52.0));
		aimParmsArrayMap.add(new AimParameters(10.5,27.0,52.0));
		aimParmsArrayMap.add(new AimParameters(10.75,27.0,52.0));

		aimParmsArrayMap.add(new AimParameters(11.0,29.0,48.0));
		aimParmsArrayMap.add(new AimParameters(11.25,29.0,48.0));
		aimParmsArrayMap.add(new AimParameters(11.5,29.0,48.0));
		aimParmsArrayMap.add(new AimParameters(11.75,29.0,48.0));

		aimParmsArrayMap.add(new AimParameters(12.0,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(12.25,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(12.5,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(12.75,31.0,44.0));

		aimParmsArrayMap.add(new AimParameters(13.0,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(13.25,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(13.5,31.0,44.0));
		aimParmsArrayMap.add(new AimParameters(13.75,31.0,44.0));

		aimParmsArrayMap.add(new AimParameters(14.0,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(14.25,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(14.5,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(14.75,33.0,41.0));

		aimParmsArrayMap.add(new AimParameters(15.0,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(15.25,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(15.5,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(15.75,33.0,41.0));

		aimParmsArrayMap.add(new AimParameters(16.0,33.0,41.0));
		aimParmsArrayMap.add(new AimParameters(16.25,36.0,37.0));
		aimParmsArrayMap.add(new AimParameters(16.5,36.0,37.0));
		aimParmsArrayMap.add(new AimParameters(16.75,36.0,37.0));

		aimParmsArrayMap.add(new AimParameters(17.0,36.0,37.0));
		aimParmsArrayMap.add(new AimParameters(17.25,36.0,37.0));
		aimParmsArrayMap.add(new AimParameters(17.5,36.0,37.0));
		aimParmsArrayMap.add(new AimParameters(17.75,36.0,37.0));

		aimParmsArrayMap.add(new AimParameters(18.0,38.0,35.0));
		aimParmsArrayMap.add(new AimParameters(18.25,38.0,35.0));
		aimParmsArrayMap.add(new AimParameters(18.5,38.0,35.0));
		aimParmsArrayMap.add(new AimParameters(18.75,38.0,35.0));

		aimParmsArrayMap.add(new AimParameters(19.0,38.0,35.0));
		aimParmsArrayMap.add(new AimParameters(19.25, 38.0, 35.0));
		aimParmsArrayMap.add(new AimParameters(19.5, 38.0, 35.0));
		aimParmsArrayMap.add(new AimParameters(19.75, 38.0, 35.0));

		aimParmsArrayMap.add(new AimParameters(20.0, 38.0, 35.0));

	}

	/** Print all the values of the parameters table
	 * 
	 */
	public void printAimParmsTable() {

		for (Map.Entry<Integer, ArrayList<AimParameters>> entry : aimParmsTable.entrySet()) {
			Integer key = entry.getKey();
			ArrayList<AimParameters> values =  entry.getValue();
			System.out.println("Key = " + key);

			int index = 0;
			int size = ShooterSubSystem.aimParmsTable.get(key).size();

			while (index < size ) {
				System.out.println(values.get(index).toString());
				index++;
			}
		}
	}

	/** Print the Aim Parameters Array
	 * 
	 */
	public void printAimParamsArray() {
		
		for (AimParameters aP : aimParmsArrayMap) {
			System.out.println(aP);
		}
	}
	
	/** Calculate an index into the shooter lookup table.
	 * Note if the number of divisions per foot or the minimum distance changes, the constants 
	 * MIN_DIST and DIVS_PER_FOOT must change accordingly.
	 * @param Double requestedDistance - the linear distance to the target, not considering height
	 * @return AimParameter object containing the shooter wheel velocity and carriage tilt angle
	 */
	public AimParameters getAimParmFromArray(Double requestedDistance) {
		
		Double index = Math.floor( (requestedDistance - MIN_DIST) * DIVS_PER_FOOT);
		return aimParmsArrayMap.get(index.intValue());   
	}

	/** Update the shooter parameters map at a specific distance. This will allow the shooter to be
	 * updated without stopping and reloading the robot.
	 * @param distance - the distance in the map to be updated
	 * @param velocity - velocity to be updated
	 * @param angle - angle to be updated
	 * @return aP - the AimParameter at the index that was updated
	 */
	public AimParameters updateArrayMap(Double distance, Double velocity, Double angle) {
				
		AimParameters aP = new AimParameters(distance, velocity, angle);
		Double index = Math.floor( (distance - MIN_DIST) * DIVS_PER_FOOT);

		aimParmsArrayMap.set(index.intValue(), aP); 
		
		aP = aimParmsArrayMap.get(index.intValue());
		
		return aP;
	}
	
	public AimParameters updateMap(Double distance, Double velocity, Double angle) {
	
		Integer intDistance = distance.intValue(); 
		AimParameters replacement = new AimParameters(distance, velocity, angle);
		AimParameters tempAP = new AimParameters();
		int index = 0;
		int size = ShooterSubSystem.aimParmsTable.get(intDistance).size();
		
		for (index=0; index < size; index++) {
			tempAP = ShooterSubSystem.aimParmsTable.get(intDistance).get(index);

			if ( distance >= tempAP.getDistanceFt()) {
				break;
			}
		}

		// Replace the element 
		//tempAP.setDistanceFt(distance);
		tempAP.setWheelRotationVelocity(velocity);
		tempAP.setCarriageTiltAngle(angle);
		
		replacement = ShooterSubSystem.aimParmsTable.get(intDistance).set(index, tempAP);
		// return ShooterSubSystem.aimParmsTable.get(intDistance).get(index);
		return replacement;
	}
	
	/** Return the wheel velocity and carriage tilt angle from the lookup table.
	 * @param Double requestedDistance - the linear distance to the target, not considering height
	 * @return AimParameter object containing the shooter wheel velocity and carriage tilt angle
	 */
	public AimParameters getParameters(Double requestedDistance) {

		Integer intDistance = requestedDistance.intValue(); 
		int size = ShooterSubSystem.aimParmsTable.get(intDistance).size();
		AimParameters aP = new AimParameters();

		for (int index=0; index < size; index++) {
			aP = ShooterSubSystem.aimParmsTable.get(intDistance).get(index);

			if ( requestedDistance >= aP.getDistanceFt()) {
				break;
			}
		}

		return aP;

	} // end getParameters

		// Create the ArrayList of AimParameters for the lookup table
		private ArrayList<AimParameters> aimParmsArrayMap;
		private static final int MIN_DIST            = 2;
		private static final int DIVS_PER_FOOT  = 4;
		
		// Alternative implementation for lookup table
		private static Map<Integer, ArrayList<AimParameters>> aimParmsTable = new HashMap<>();
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShooterSubSystem shooter = new ShooterSubSystem();

//		shooter.updateArrayMap(16.5, 3.0, 4.0);
//		shooter.printAimParamsArray();		

		shooter.updateMap(16.12345,  4.0,  5.0);
		shooter.updateMap(13.52345,  4.0,  5.0);
		shooter.updateMap(2.49999,  4.0,  5.0);
		shooter.printAimParmsTable();


	}

}
