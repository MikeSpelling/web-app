package uk.co.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 *
 */
@Controller
public class WebApp {
	
	@RequestMapping("/")
	public ModelAndView base(ModelAndView mav) throws Exception {
        mav = new ModelAndView("hello");
        mav.addObject("name", "Someone");
        return mav;
    }
	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
    public ModelAndView named(@PathVariable("name") String name, ModelAndView mav) throws Exception {
        mav = new ModelAndView("hello");
        mav.addObject("name", name);
        return mav;
    }
	
}
