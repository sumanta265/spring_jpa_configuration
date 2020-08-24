package i0.project.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("main")

public class TestController {
     
	@Autowired
	private infoService service;
	@RequestMapping("/hello")
	public String demo() {
		
		return "home";
		
	}
	
	
	@RequestMapping(path="/save",method=RequestMethod.POST)
	public String saveDetails(@ModelAttribute("info") Info info)
	{
	
	 System.out.println(info);
	  service.save(info);
	  return "home";
	
    }
	
}
