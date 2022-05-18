import com.phidget22.*;
public class PhidgetsRoverTurn {

	public static void main(String[] args) throws Exception {
		//Connect to wireless rover
		Net.addServer("", "192.168.100.1", 5661, "", 0);
		
		
        

		//Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        VoltageRatioInput vAxis = new VoltageRatioInput(); 
        VoltageRatioInput hAxis = new VoltageRatioInput();
        DistanceSensor sonar = new DistanceSensor();
        DigitalInput button = new DigitalInput();
        Spatial spatial = new Spatial();
        
        
        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);
        vAxis.setChannel(0);
        hAxis.setChannel(1);
        button.setHubPort(0);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        vAxis.open(5000);
        hAxis.open(5000);
        sonar.open(5000);
        button.open(5000);

        //Increase acceleration
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
        
      //Spatial Event
        spatial.addSpatialDataListener(new SpatialSpatialDataListener() {
            public void onSpatialData(SpatialSpatialDataEvent e) {                    
             //   double[] acceleration = e.getAcceleration();
               // double[] angularRate = e.getAngularRate();
                double[] magneticField = e.getMagneticField();
                double timestamp = e.getTimestamp();

              //  System.out.println("Acceleration: " + acceleration[0] + "," + acceleration[1] + "," + acceleration[2]);
              //  System.out.println("Angular Rate: " + angularRate[0] + "," + angularRate[1] + "," + angularRate[2]);
                System.out.println("Magnetic Field: " + Math.round(magneticField[0] * 10) + "," + Math.round(magneticField[1] * 10) + "," + Math.round(magneticField[2] * 10));
                System.out.println("Timestamp: " + timestamp + "\n");       
            }
        });

		        
        while(true)
        {
        	
        	//Get data from vertical axis (value between -1 and 1)
        	double verticalAxis = vAxis.getVoltageRatio();
		          
        	double horizontalAxis = hAxis.getVoltageRatio();
		            
        	//Use thumbstick data to figure how each side of rover should move
	        double leftMotorsSpeed = verticalAxis - horizontalAxis;
	        double rightMotorsSpeed = verticalAxis + horizontalAxis;

	        //Limit values to between -1 and 1
	        if(leftMotorsSpeed > 1) leftMotorsSpeed = 1;
	        if(leftMotorsSpeed < -1) leftMotorsSpeed = -1;
	        if(rightMotorsSpeed > 1) rightMotorsSpeed = 1;
	        if(rightMotorsSpeed < -1) rightMotorsSpeed = -1;

	        //Apply values 
	        leftMotors.setTargetVelocity(leftMotorsSpeed);
	        rightMotors.setTargetVelocity(rightMotorsSpeed);
	        
	        //Open
	        spatial.open(1000);
	        
	       
		            
	        //Wait 100 milliseconds
	        Thread.sleep(100);
			
	        /*            
	        if (sonar.getDistance() < 300)
	        {
	        	//Object detected! Stop motors
	        	leftMotors.setTargetVelocity(0);
	        	rightMotors.setTargetVelocity(0);
			              
	        	Thread.sleep(500);
			                
	        	leftMotors.setTargetVelocity(1);
	        	rightMotors.setTargetVelocity(1);
			                
	        	Thread.sleep(500);
	        } 
	        */
	        
	        if (button.getState())
	        {
	        	leftMotors.setTargetVelocity(-1);
	        	rightMotors.setTargetVelocity(1);
	        	
	        	Thread.sleep(1000);
	        }
	        
	       
			          
        }
	}

}
