package com.star;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
        logger.debug("call index");
		model.addAttribute("message", "Hello Wrold, Success!");
        logger.info("index finished");
		return "home";
	}

    @RequestMapping(value = "/demoPrint", method = RequestMethod.GET)
    public void demoPrint(ModelMap model) {
        model.addAttribute("message", "test!!!");
        System.out.println("just a test demo!");
    }

}