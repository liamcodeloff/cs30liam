import com.phidget22.*;
public class ButtonPresses {

	public static void main(String[] args) throws Exception
	{
		//Create 
		   DigitalInput redButton = new DigitalInput();
	      

	       //Address 
	       
	       redButton.setHubPort(4);
	       
	       redButton.setIsHubPortDevice(true);

	       //Open 
	       
	       redButton.open(1000);

		   
		   
		   //Use your Phidgets
		      Boolean buttonState = false; // track button state changes
	      
		      while(true)
		      {
		          
		    	  if(redButton.getState() && !buttonState)
		    	  {

		    		  System.out.println("Button State: true " );
	                     
		    	  }
		    	  else if (!redButton.getState() && buttonState)
	              {

	                   System.out.println("Button State: false " );
	                     
	              }	
		          buttonState = redButton.getState(); // record button state changes
	          
		          Thread.sleep(150);
		          
		      }
	}
}



	
