package tinot.bookstore.Bookstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class BookController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String ageCheck(
			@RequestParam(name="name") String name,
			@RequestParam(name="age") String age){
		return "index";
	}
}
