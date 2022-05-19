import com.phidget22.*;
public class PhidgetsWater {

	public static void main(String[] args) throws Exception{
		//Create
        VoltageRatioInput soil = new VoltageRatioInput();
        DigitalOutput pump = new DigitalOutput();
        LightSensor light = new LightSensor();
        
        //Address
        pump.setHubPort(1);
        pump.setIsHubPortDevice(true);
        
        //Open
        soil.open(1000);
        pump.open(1000);
        light.open(1000);
        
        //Use your Phidgets
        while(true){
            System.out.println("Illuminance: " + light.getIlluminance() + " lx");
            System.out.println("Soil Moisture Level: " + soil.getVoltageRatio() + "\n");
            Thread.sleep(500);
        }
    }    
}