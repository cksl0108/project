package com.spring.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.ws.RequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "main/home";
	}
	
	
	@RequestMapping(value="/main/{var}")
	public String main(@PathVariable String var) {
		String returnURL = "main/"+var;
		return returnURL;
	}
	
	@RequestMapping(value="/gallery/{var}")
	public String gallery(@PathVariable String var) {
		String returnURL = "gallery/"+var;
		return returnURL;
	}
	
	@RequestMapping(value="/board/{var}")
	public String board(@PathVariable String var) {
		String returnURL = "board/"+var;
		return returnURL;
	}
	
}
