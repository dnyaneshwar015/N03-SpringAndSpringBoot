package org.tnsif.springwebmvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


/*A controller contain the business logic of an application,
 * 
 */
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Code to demonstrate on simple"
				+" web application");
		return "home.jsp";
	}
	
}
