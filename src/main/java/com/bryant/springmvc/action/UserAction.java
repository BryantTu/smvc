package com.bryant.springmvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserAction {

	@RequestMapping("/getUser")
	public String getUser(String id) {
		System.out.println(id);
		return "bryant";
	}
}
