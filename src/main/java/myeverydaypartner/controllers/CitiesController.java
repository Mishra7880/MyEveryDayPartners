package myeverydaypartner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CitiesController {
      
	    //cities  controller
	
		@GetMapping("/barberCity")
	    public String barber_cities() 
	    {
	    	return "cities/barber_cities";
	    }
		
		@GetMapping("/cleanerCity")
	    public String cleaner_cities() 
	    {
	    	return "cities/cleaner_cities";
	    }
		
		@GetMapping("/electricianCity")
	    public String electrician_cities() 
	    {
	    	return "cities/electrician_cities";
	    }
		
		@GetMapping("/painterCity")
	    public String painter_cities() 
	    {
	    	return "cities/painter_cities";
	    }
		
		@GetMapping("/plumberCity")
	    public String plumber_cities() 
	    {
	    	return "cities/plumber_cities";
	    }
		
		@GetMapping("/chefCity")
	    public String sheff_cities() 
	    {
	    	return "cities/sheff_cities";
	    }
}
