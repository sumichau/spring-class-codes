package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.bean.Fortune;
import com.cg.service.FortuneService;
@Controller
public class FortuneController {
	
	@Autowired
	FortuneService fortuneService;
	
	@RequestMapping("/search/{id}")
	public String getFortuneUser(@PathVariable("id") Integer id,Model model)
	{
		Fortune fortune = fortuneService.searchByFortuneById(id);
		model.addAttribute("fortune",fortune);
		return "diplay";
	}
	
	

}
