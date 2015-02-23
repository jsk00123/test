package net.hwanee.www;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String home(@RequestParam Map<String, String> paramMap,
			Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		paramMap.put("pageNo", "1");
		paramMap.put("pageRow", "10");
		paramMap.put("StartPage", String.valueOf((Integer.parseInt(paramMap.get("pageNo"))-1)*Integer.parseInt(paramMap.get("pageRow"))));
		
		//model.addAttribute("testdb", testServices.getList(paramMap));
		
		return "home";
	}
	
	@RequestMapping(value="/tns")
	public String tns(Locale locale, Model model, Principal principal) throws Throwable{
		/*
		String name = null;
		if((name = principal.getName()) != null){
			model.addAttribute("username",name);
		}
		*/
		return "tns";
	}
	
	@RequestMapping(value="/login")
	public void login(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping(value="/loginFail")
	public void loginFail(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping(value="/logout")
	public void logout(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
}
