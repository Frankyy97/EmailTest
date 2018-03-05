package abc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abc.test.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/")
	public String tester(){
		
		return "Jeff du Huso";
	}
	
	@RequestMapping("/sendEmail")
	public String send() {
		
		testService.sendTest();
		return "gl hf";
	}
	
	
}
