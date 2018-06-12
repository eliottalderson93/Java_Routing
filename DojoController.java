package com.erik.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	@RequestMapping("/{this_dojo}")
    public String showLesson(@PathVariable("this_dojo") String this_dojo){
		//String output = "";
		System.out.println(this_dojo);
		if(this_dojo.equals("burbank-dojo")) {
			return "Burbank dojo is located in SoCal";
		}
		else if (this_dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		else {
			return "the dojo is awesome";
		}
    }
}
