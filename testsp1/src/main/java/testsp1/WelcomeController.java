package testsp1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class WelcomeController {

	//WelcomeService ob = new WelcomeService();
	
	@Autowired
	WelcomeService ob ;
	
	@RequestMapping("welcome")
	public String welcome()
	{
		return ob.WelcomeMethod();
	}
}

@Component 
class WelcomeService
{
	
	public String WelcomeMethod()
	{
		return "Welcome to new world of Spring framwrok";
	}
	
}