
import java.text.SimpleDateFormat;
import java.util.Date;

import com.phidget22.*;

public class PhidgetsWater {

	 public static void main(String[] args) throws Exception 
	  {
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
	        
	        
	        SimpleDateFormat ti = new SimpleDateFormat("HH:mm");  //"yyyy/MM/dd HH:mm:ss"
	    	
	       
 
	        while(true)
	        {
	     
			 Date date = new Date(); 
	        	double L =light.getIlluminance();
	        	double S = soil.getVoltageRatio();
	 	        String ll="Light Status: Low", lh= "Light Status: High",lg= "Light Status: Good",
	 	        		sd="Plant Status: Needs Watering\n",sw="Plant Status: Good\n",
	 	        		t = ti.format(date), wt ="10:55";
	 	        
	        	// light level ---------------
	        	if (L < 2) 
	        	{
	        		System.out.println(ll);
	        	}
	        	else if (L>1000) 
	        	{
	        		System.out.println(lh);	
	        	}
	        	else 
	        	{
	        		System.out.println(lg);	
	        	}
	        	
	        	//---------------------------
	        	
	        	
	        	// time -------------------------
	        	
	        	if ((t).equals(wt)) 
	        	{
	        		System.out.println(t);	
	        		
	        		
	        		  //pump.setState(true);
	      	          //Thread.sleep(2000);
	      	          //pump.setState(false);
	      	        if (S<0.355) 
		        	{
		        		System.out.println(sd);	
		        		
		        		
		        		  pump.setState(true);
		      	          Thread.sleep(2000);
		      	          pump.setState(false);
		      	          
		        	}
	      	      else 
		        	{
		        		System.out.println(sw);	
		        	} 
	        	}
	        	
	        	//-----------------------------------
	        	
	        	
	        	// soil ------------------------------
	        /*	if (S<148) 
	        	{
	        		System.out.println(sd);	
	        		
	        		
	        		  pump.setState(true);
	      	          Thread.sleep(2000);
	      	          pump.setState(false);
	      	          
	        	}
	        	else 
	        	{
	        		System.out.println(sw);	
	        	}
	       */ 	//-------------------------------
	        	
	        	
	        	
	           
	            Thread.sleep(500);
	        }
	    }    
	}