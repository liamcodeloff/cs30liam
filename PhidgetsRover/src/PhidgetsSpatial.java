import com.phidget22.*;
public class PhidgetsSpatial {

	public static void main(String[] args)throws Exception {
		Net.addServer("", "192.168.100.1", 5661, "", 0);

	
		//Create
        Spatial spatial = new Spatial();
        
        //Spatial Event
        spatial.addSpatialDataListener(new SpatialSpatialDataListener() {
            public void onSpatialData(SpatialSpatialDataEvent e) {                    
                double[] acceleration = e.getAcceleration();
                double[] angularRate = e.getAngularRate();
                double[] magneticField = e.getMagneticField();
                double timestamp = e.getTimestamp();

                System.out.println("Acceleration: " + acceleration[0] + "," + acceleration[1] + "," + acceleration[2]);
                System.out.println("Angular Rate: " + angularRate[0] + "," + angularRate[1] + "," + angularRate[2]);
                System.out.println("Magnetic Field: " + magneticField[0] + "," + magneticField[1] + "," + magneticField[2]);
                System.out.println("Timestamp: " + timestamp + "\n");       
            }
        });
        
        //Open
        spatial.open(1000);
        
        //Use your Phidgets
        while (true) {            
            Thread.sleep(250);
        }
    }
} 
  
