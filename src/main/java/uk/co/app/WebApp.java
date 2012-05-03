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

	@RequestMapping("game")
    public ModelAndView swear(ModelAndView mav) throws Exception {
        mav = new ModelAndView("hello");
        String app = "<br/>" +
        		"<applet archive=\"Game.jar\" code=\"game/Game.class\" " +
        		"width=\"1000\" height=\"800\">" +
					"<param name=\"NumBalls\" value=\"2\" />" +
					"<param name=\"Radius\" value=\"25\" />" +
					"<param name=\"HeightMetres\" value=\"10\" />" +
					"<param name=\"InitialVelocityX\" value=\"0\" />" +
					"<param name=\"InitialVelocityY\" value=\"0\" />" +
					"<param name=\"AccelerationX\" value=\"0\" />" +
					"<param name=\"AccelerationY\" value=\"9.80665\" />" +
					"<param name=\"EnergyLossLeft\" value=\"0.8\" />" +
					"<param name=\"EnergyLossRight\" value=\"0.8\" />" +
					"<param name=\"EnergyLossTop\" value=\"0.8\" />" +
					"<param name=\"EnergyLossBottom\" value=\"0.8\" />" +
					"<param name=\"EnergyLossCollision\" value=\"1\" />" +
					"<param name=\"Circular\" value=\"true\" />" +
					"You need to get Java!" +
				"</applet>";
        mav.addObject("name", app);
        return mav;
    }
	
}
