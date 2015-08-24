package com.star;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/regist2")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/")
	public String show(ModelMap model) {
        logger.debug("call show");
        model.addAttribute("message", "Hello Wrold, Success!");
        logger.info("show finished");
        return "regist";
    }

}