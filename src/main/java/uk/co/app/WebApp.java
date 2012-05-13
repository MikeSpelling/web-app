package uk.co.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 * 
 * Add logging
 *
 */
@Controller
public class WebApp {
	
	@RequestMapping("/")
	public ModelAndView base(ModelAndView mav) throws Exception {
        mav = new ModelAndView("welcome");
        mav.addObject("heading", "Hello stranger");
        mav.addObject("paragraph", "Oi oi someone");
        return mav;
    }
	
	@RequestMapping(value="{paragraph}", method=RequestMethod.GET)
    public ModelAndView named(@PathVariable("paragraph") String name, ModelAndView mav) throws Exception {
        mav = new ModelAndView("welcome");
	String paragraph = "Oi oi " + name;
        mav.addObject("heading", "Hello " + name);
        mav.addObject("paragraph", paragraph);
        return mav;
    }

	@RequestMapping("/mike")
    public ModelAndView named(@RequestParam(required=false) String greeting, ModelAndView mav) throws Exception {
        mav = new ModelAndView("welcome");
	String paragraph = "Oi oi Mikey boy";
	if (greeting != null) {
		String paragraph = greeting + "Mikey boy";
	}
        mav.addObject("heading", "Gday good sir");
        mav.addObject("paragraph", paragraph);
        return mav;
    }
	
}
