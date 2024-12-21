package myeverydaypartner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities/service_provider")
public class ServiceProviderController {
	   //chennai  controller
	
			@GetMapping("/barberChennai")
		    public String barberChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/barber";
		    }
			
			@GetMapping("/cleanerChennai")
		    public String cleanerChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/cleaner";
		    }
			
			@GetMapping("/electricianChennai")
		    public String electricianChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/electrician";
		    }
			
			@GetMapping("/painterChennai")
		    public String painterChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/painter";
		    }
			
			@GetMapping("/plumberChennai")
		    public String plumberChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/plumber";
		    }
			
			@GetMapping("/chefChennai")
		    public String chefChennai() 
		    {
		    	return "cities/service_provider/Chennai_Services/sheff";
		    }
			
			
			//Hyderabad  controller
			
			@GetMapping("/barberHyderabad")
		    public String barberHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/barber";
		    }
			
			@GetMapping("/cleanerHyderabad")
		    public String cleanerHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/cleaner";
		    }
			
			@GetMapping("/electricianHyderabad")
		    public String electricianHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/electrician";
		    }
			
			@GetMapping("/painterHyderabad")
		    public String painterHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/painter";
		    }
			
			@GetMapping("/plumberHyderabad")
		    public String plumberHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/plumber";
		    }
			
			@GetMapping("/chefHyderabad")
		    public String chefHyderabad() 
		    {
		    	return "cities/service_provider/Hyderabad_Services/sheff";
		    }
			
			
           //Mumbai  controller
			
			@GetMapping("/barberMumbai")
		    public String barberMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/barber";
		    }
			
			@GetMapping("/cleanerMumbai")
		    public String cleanerMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/cleaner";
		    }
			
			@GetMapping("/electricianMumbai")
		    public String electricianMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/electrician";
		    }
			
			@GetMapping("/painterMumbai")
		    public String painterMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/painter";
		    }
			
			@GetMapping("/plumberMumbai")
		    public String plumberMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/plumber";
		    }
			
			@GetMapping("/chefMumbai")
		    public String chefMumbai() 
		    {
		    	return "cities/service_provider/Mumbai_Services/sheff";
		    }
			
			
              //Kolkata  controller
			
			@GetMapping("/barberKolkata")
		    public String barberKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/barber";
		    }
			
			@GetMapping("/cleanerKolkata")
		    public String cleanerKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/cleaner";
		    }
			
			@GetMapping("/electricianKolkata")
		    public String electricianKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/electrician";
		    }
			
			@GetMapping("/painterKolkata")
		    public String painterKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/painter";
		    }
			
			@GetMapping("/plumberKolkata")
		    public String plumberKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/plumber";
		    }
			
			@GetMapping("/chefKolkata")
		    public String chefKolkata() 
		    {
		    	return "cities/service_provider/Kolkata_Services/sheff";
		    }
			
			
         //Patna  controller
			
			@GetMapping("/barberPatna")
		    public String barberPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/barber";
		    }
			
			@GetMapping("/cleanerPatna")
		    public String cleanerPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/cleaner";
		    }
			
			@GetMapping("/electricianPatna")
		    public String electricianPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/electrician";
		    }
			
			@GetMapping("/painterPatna")
		    public String painterPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/painter";
		    }
			
			@GetMapping("/plumberPatna")
		    public String plumberPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/plumber";
		    }
			
			@GetMapping("/chefPatna")
		    public String chefPatna() 
		    {
		    	return "cities/service_provider/Patna_Services/sheff";
		    }
			
			
 //Lucknow  controller
			
			@GetMapping("/barberLucknow")
		    public String barberLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/barber";
		    }
			
			@GetMapping("/cleanerLucknow")
		    public String cleanerLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/cleaner";
		    }
			
			@GetMapping("/electricianLucknow")
		    public String electricianLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/electrician";
		    }
			
			@GetMapping("/painterLucknow")
		    public String painterLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/painter";
		    }
			
			@GetMapping("/plumberLucknow")
		    public String plumberLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/plumber";
		    }
			
			@GetMapping("/chefLucknow")
		    public String chefLucknow() 
		    {
		    	return "cities/service_provider/Lucknow_Services/sheff";
		    }
			
			
//Dehradun  controller
			
			@GetMapping("/barberDehradun")
		    public String barberDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/barber";
		    }
			
			@GetMapping("/cleanerDehradun")
		    public String cleanerDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/cleaner";
		    }
			
			@GetMapping("/electricianDehradun")
		    public String electricianDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/electrician";
		    }
			
			@GetMapping("/painterDehradun")
		    public String painterDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/painter";
		    }
			
			@GetMapping("/plumberDehradun")
		    public String plumberDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/plumber";
		    }
			
			@GetMapping("/chefDehradun")
		    public String chefDehradun() 
		    {
		    	return "cities/service_provider/Dehradun_Services/chef";
		    }
			
//Chandigarh  controller
			
			@GetMapping("/barberChandigarh")
		    public String barberChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/barber";
		    }
			
			@GetMapping("/cleanerChandigarh")
		    public String cleanerChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/cleaner";
		    }
			
			@GetMapping("/electricianChandigarh")
		    public String electricianChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/electrician";
		    }
			
			@GetMapping("/painterChandigarh")
		    public String painterChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/painter";
		    }
			
			@GetMapping("/plumberChandigarh")
		    public String plumberChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/plumber";
		    }
			
			@GetMapping("/chefChandigarh")
		    public String chefChandigarh() 
		    {
		    	return "cities/service_provider/Chandigarh_Services/chef";
		    }
			
//Delhi  controller
			
			@GetMapping("/barberDelhi")
		    public String barberDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/barber";
		    }
			
			@GetMapping("/cleanerDelhi")
		    public String cleanerDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/cleaner";
		    }
			
			@GetMapping("/electricianDelhi")
		    public String electricianDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/electrician";
		    }
			
			@GetMapping("/painterDelhi")
		    public String painterDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/painter";
		    }
			
			@GetMapping("/plumberDelhi")
		    public String plumberDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/plumber";
		    }
			
			@GetMapping("/chefDelhi")
		    public String chefDelhi() 
		    {
		    	return "cities/service_provider/Delhi_Services/sheff";
		    }
//Bengaluru  controller
			
			@GetMapping("/barberBengaluru")
		    public String barberBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/barber";
		    }
			
			@GetMapping("/cleanerBengaluru")
		    public String cleanerBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/cleaner";
		    }
			
			@GetMapping("/electricianBengaluru")
		    public String electricianBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/electrician";
		    }
			
			@GetMapping("/painterBengaluru")
		    public String painterBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/painter";
		    }
			
			@GetMapping("/plumberBengaluru")
		    public String plumberBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/plumber";
		    }
			
			@GetMapping("/chefBengaluru")
		    public String chefBengaluru() 
		    {
		    	return "cities/service_provider/Bengaluru_Services/chef";
		    }
}
