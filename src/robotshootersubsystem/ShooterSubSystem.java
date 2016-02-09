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
		ShooterSubSystem.aimParametersTable.put(20, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(19.75, 38.0, 35.0));
		initialParms.add(new AimParameters(19.5, 38.0, 35.0));
		initialParms.add(new AimParameters(19.25, 38.0, 35.0));
		initialParms.add(new AimParameters(19.0,38.0,35.0));

		ShooterSubSystem.aimParametersTable.put(19, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(18.75,38.0,35.0));
		initialParms.add(new AimParameters(18.5,38.0,35.0));
		initialParms.add(new AimParameters(18.25,38.0,35.0));
		initialParms.add(new AimParameters(18.0,38.0,35.0));

		ShooterSubSystem.aimParametersTable.put(18, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(17.75,36.0,37.0));
		initialParms.add(new AimParameters(17.5,36.0,37.0));
		initialParms.add(new AimParameters(17.25,36.0,37.0));
		initialParms.add(new AimParameters(17.0,36.0,37.0));

		ShooterSubSystem.aimParametersTable.put(17, initialParms);

		initialParms = new ArrayList<AimParameters>();
		initialParms.add(new AimParameters(16.75,36.0,37.0));
		initialParms.add(new AimParameters(16.5,36.0,37.0));
		initialParms.add(new AimParameters(16.25,36.0,37.0));
		initialParms.add(new AimParameters(16.0,33.0,41.0));

		ShooterSubSystem.aimParametersTable.put(16, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(15.75,33.0,41.0));
		initialParms.add(new AimParameters(15.5,33.0,41.0));
		initialParms.add(new AimParameters(15.25,33.0,41.0));
		initialParms.add(new AimParameters(15.0,33.0,41.0));

		ShooterSubSystem.aimParametersTable.put(15, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(14.75,33.0,41.0));
		initialParms.add(new AimParameters(14.5,33.0,41.0));
		initialParms.add(new AimParameters(14.25,33.0,41.0));
		initialParms.add(new AimParameters(14.0,33.0,41.0));

		ShooterSubSystem.aimParametersTable.put(14, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(13.75,31.0,44.0));
		initialParms.add(new AimParameters(13.5,31.0,44.0));
		initialParms.add(new AimParameters(13.25,31.0,44.0));
		initialParms.add(new AimParameters(13.0,31.0,44.0));

		ShooterSubSystem.aimParametersTable.put(13, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(12.75,31.0,44.0));
		initialParms.add(new AimParameters(12.5,31.0,44.0));
		initialParms.add(new AimParameters(12.25,31.0,44.0));
		initialParms.add(new AimParameters(12.0,31.0,44.0));

		ShooterSubSystem.aimParametersTable.put(12, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(11.75,29.0,48.0));
		initialParms.add(new AimParameters(11.5,29.0,48.0));
		initialParms.add(new AimParameters(11.25,29.0,48.0));
		initialParms.add(new AimParameters(11.0,29.0,48.0));

		ShooterSubSystem.aimParametersTable.put(11, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(10.75,27.0,52.0));
		initialParms.add(new AimParameters(10.5,27.0,52.0));
		initialParms.add(new AimParameters(10.25,27.0,52.0));
		initialParms.add(new AimParameters(10.0,27.0,52.0));

		ShooterSubSystem.aimParametersTable.put(10, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(9.75,26.0,55.0));
		initialParms.add(new AimParameters(9.5,26.0,55.0));
		initialParms.add(new AimParameters(9.25,26.0,55.0));
		initialParms.add(new AimParameters(9.0,26.0,55.0));

		ShooterSubSystem.aimParametersTable.put(9, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(8.75,26.0,55.0));
		initialParms.add(new AimParameters(8.5,26.0,55.0));
		initialParms.add(new AimParameters(8.25,26.0,55.0));
		initialParms.add(new AimParameters(8.0,26.0,55.0));

		ShooterSubSystem.aimParametersTable.put(8, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(7.75,24.0,64.0));
		initialParms.add(new AimParameters(7.5,24.0,64.0));
		initialParms.add(new AimParameters(7.25,24.0,64.0));
		initialParms.add(new AimParameters(7.0,24.0,64.0));

		ShooterSubSystem.aimParametersTable.put(7, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(6.75,24.0,64.0));
		initialParms.add(new AimParameters(6.5,24.0,64.0));
		initialParms.add(new AimParameters(6.25,24.0,64.0));
		initialParms.add(new AimParameters(6.0,24.0,64.0));

		ShooterSubSystem.aimParametersTable.put(6, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(5.75,23.0,70.0));
		initialParms.add(new AimParameters(5.5,23.0,70.0));
		initialParms.add(new AimParameters(5.25,23.0,70.0));
		initialParms.add(new AimParameters(5.0,23.0,70.0));

		ShooterSubSystem.aimParametersTable.put(5, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(4.75,23.0,70.0));
		initialParms.add(new AimParameters(4.5,23.0,70.0));
		initialParms.add(new AimParameters(4.25,23.0,70.0));
		initialParms.add(new AimParameters(4.0,22.0,75.0));

		ShooterSubSystem.aimParametersTable.put(4, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(3.75,22.0,75.0));
		initialParms.add(new AimParameters(3.5,22.0,75.0));
		initialParms.add(new AimParameters(3.25,22.0,75.0));
		initialParms.add(new AimParameters(3.0,22.0,75.0));

		ShooterSubSystem.aimParametersTable.put(3, initialParms);

		initialParms = new ArrayList<AimParameters>();

		initialParms.add(new AimParameters(2.75,24.0,75.0));
		initialParms.add(new AimParameters(2.5,24.0,75.0));
		initialParms.add(new AimParameters(2.25,30.0,75.0));
		initialParms.add(new AimParameters(2.0,30.0,75.0));

		ShooterSubSystem.aimParametersTable.put(2, initialParms);
	
		// This is the alternate implementation of the lookup table. It is stored in an ArrayList, which 
		// is simply an array. The index into the array is calculated and the values returned. 
		
		// Create the ArrayList of AimParameters
		aimParmsArray = new ArrayList<AimParameters>();
		
		// Store distance in feet, wheel velocity, and tilt angle into the initial parameters variable
	
		aimParmsArray.add(new AimParameters(2.0,30.0,75.0));
		aimParmsArray.add(new AimParameters(2.25,30.0,75.0));
		aimParmsArray.add(new AimParameters(2.5,24.0,75.0));
		aimParmsArray.add(new AimParameters(2.75,24.0,75.0));

		aimParmsArray.add(new AimParameters(3.0,22.0,75.0));
		aimParmsArray.add(new AimParameters(3.25,22.0,75.0));
		aimParmsArray.add(new AimParameters(3.5,22.0,75.0));
		aimParmsArray.add(new AimParameters(3.75,22.0,75.0));

		aimParmsArray.add(new AimParameters(4.0,22.0,75.0));
		aimParmsArray.add(new AimParameters(4.25,23.0,70.0));
		aimParmsArray.add(new AimParameters(4.5,23.0,70.0));
		aimParmsArray.add(new AimParameters(4.75,23.0,70.0));

		aimParmsArray.add(new AimParameters(5.0,23.0,70.0));
		aimParmsArray.add(new AimParameters(5.25,23.0,70.0));
		aimParmsArray.add(new AimParameters(5.5,23.0,70.0));
		aimParmsArray.add(new AimParameters(5.75,23.0,70.0));

		aimParmsArray.add(new AimParameters(6.0,24.0,64.0));
		aimParmsArray.add(new AimParameters(6.25,24.0,64.0));
		aimParmsArray.add(new AimParameters(6.5,24.0,64.0));
		aimParmsArray.add(new AimParameters(6.75,24.0,64.0));

		aimParmsArray.add(new AimParameters(7.0,24.0,64.0));
		aimParmsArray.add(new AimParameters(7.25,24.0,64.0));
		aimParmsArray.add(new AimParameters(7.5,24.0,64.0));
		aimParmsArray.add(new AimParameters(7.75,24.0,64.0));

		aimParmsArray.add(new AimParameters(8.0,26.0,55.0));
		aimParmsArray.add(new AimParameters(8.25,26.0,55.0));
		aimParmsArray.add(new AimParameters(8.5,26.0,55.0));
		aimParmsArray.add(new AimParameters(8.75,26.0,55.0));

		aimParmsArray.add(new AimParameters(9.0,26.0,55.0));
		aimParmsArray.add(new AimParameters(9.25,26.0,55.0));
		aimParmsArray.add(new AimParameters(9.5,26.0,55.0));
		aimParmsArray.add(new AimParameters(9.75,26.0,55.0));

		aimParmsArray.add(new AimParameters(10.0,27.0,52.0));
		aimParmsArray.add(new AimParameters(10.25,27.0,52.0));
		aimParmsArray.add(new AimParameters(10.5,27.0,52.0));
		aimParmsArray.add(new AimParameters(10.75,27.0,52.0));

		aimParmsArray.add(new AimParameters(11.0,29.0,48.0));
		aimParmsArray.add(new AimParameters(11.25,29.0,48.0));
		aimParmsArray.add(new AimParameters(11.5,29.0,48.0));
		aimParmsArray.add(new AimParameters(11.75,29.0,48.0));

		aimParmsArray.add(new AimParameters(12.0,31.0,44.0));
		aimParmsArray.add(new AimParameters(12.25,31.0,44.0));
		aimParmsArray.add(new AimParameters(12.5,31.0,44.0));
		aimParmsArray.add(new AimParameters(12.75,31.0,44.0));

		aimParmsArray.add(new AimParameters(13.0,31.0,44.0));
		aimParmsArray.add(new AimParameters(13.25,31.0,44.0));
		aimParmsArray.add(new AimParameters(13.5,31.0,44.0));
		aimParmsArray.add(new AimParameters(13.75,31.0,44.0));

		aimParmsArray.add(new AimParameters(14.0,33.0,41.0));
		aimParmsArray.add(new AimParameters(14.25,33.0,41.0));
		aimParmsArray.add(new AimParameters(14.5,33.0,41.0));
		aimParmsArray.add(new AimParameters(14.75,33.0,41.0));

		aimParmsArray.add(new AimParameters(15.0,33.0,41.0));
		aimParmsArray.add(new AimParameters(15.25,33.0,41.0));
		aimParmsArray.add(new AimParameters(15.5,33.0,41.0));
		aimParmsArray.add(new AimParameters(15.75,33.0,41.0));

		aimParmsArray.add(new AimParameters(16.0,33.0,41.0));
		aimParmsArray.add(new AimParameters(16.25,36.0,37.0));
		aimParmsArray.add(new AimParameters(16.5,36.0,37.0));
		aimParmsArray.add(new AimParameters(16.75,36.0,37.0));

		aimParmsArray.add(new AimParameters(17.0,36.0,37.0));
		aimParmsArray.add(new AimParameters(17.25,36.0,37.0));
		aimParmsArray.add(new AimParameters(17.5,36.0,37.0));
		aimParmsArray.add(new AimParameters(17.75,36.0,37.0));

		aimParmsArray.add(new AimParameters(18.0,38.0,35.0));
		aimParmsArray.add(new AimParameters(18.25,38.0,35.0));
		aimParmsArray.add(new AimParameters(18.5,38.0,35.0));
		aimParmsArray.add(new AimParameters(18.75,38.0,35.0));

		aimParmsArray.add(new AimParameters(19.0,38.0,35.0));
		aimParmsArray.add(new AimParameters(19.25, 38.0, 35.0));
		aimParmsArray.add(new AimParameters(19.5, 38.0, 35.0));
		aimParmsArray.add(new AimParameters(19.75, 38.0, 35.0));

		aimParmsArray.add(new AimParameters(20.0, 38.0, 35.0));

	}

	public void printAllValues() {

		for (Map.Entry<Integer, ArrayList<AimParameters>> entry : aimParametersTable.entrySet()) {
			Integer key = entry.getKey();
			List<AimParameters> values =  entry.getValue();
			System.out.println("Key = " + key);

			int index = 0;
			int size = ShooterSubSystem.aimParametersTable.get(key).size();

			while (index < size ) {
				System.out.println(values.get(index).toString());
				index++;
			}
		}
	}

	/** Method to calculate an index into the shooter lookup table.
	 * Note if the number of divisions per foot or the mininum distance changes, the constants 
	 * MIN_DIST and DIVS_PER_FOOT must change accordingly.
	 * @param Double requestedDistance - the linear distance to the target, not considering height
	 * @return AimParameter object containing the shooter wheel velocity and carriage tilt angle
	 */
	public AimParameters getAimParmFromArray(Double requestedDistance) {
		
		Double index = Math.floor( (requestedDistance - MIN_DIST) * DIVS_PER_FOOT);
		return aimParmsArray.get(index.intValue());   
	}
	
	/** Method to return the wheel velocity and carriage tilt angle from the lookup table.
	 * @param Double requestedDistance - the linear distance to the target, not considering height
	 * @return AimParameter object containing the shooter wheel velocity and carriage tilt angle
	 */
	public AimParameters getParameters(Double requestedDistance) {

		Integer intDistance = requestedDistance.intValue(); 
		int size = ShooterSubSystem.aimParametersTable.get(intDistance).size();
		AimParameters aP = new AimParameters();

		for (int index=0; index < size; index++) {
			aP = ShooterSubSystem.aimParametersTable.get(intDistance).get(index);
			double storedDist = aP.getDistanceFt();

			if ( requestedDistance >= storedDist) {
				break;
			}
		}

		return aP;

	} // end getParameters

		// Create the ArrayList of AimParameters for the lookup table
		private ArrayList<AimParameters> aimParmsArray;
		private static final int MIN_DIST            = 2;
		private static final int DIVS_PER_FOOT  = 4;
		
		// Alternative implementation for lookup table
		private static Map<Integer, ArrayList<AimParameters>> aimParametersTable = new HashMap<>();
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShooterSubSystem shooter = new ShooterSubSystem();

		shooter.printAllValues();

	}

}
