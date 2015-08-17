package controle;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/inicio")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("data", new Date());
		return "home";
	}

}
