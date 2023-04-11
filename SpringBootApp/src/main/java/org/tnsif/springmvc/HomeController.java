package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*A controller contain the business logic of an application,
 * 
 */
@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		System.out.println("Code to demonstrate on simple"
				+" web application");
		return "home.jsp";
	}
	
}
