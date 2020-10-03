package com.nguyenducquangvinh.multicontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
@Controller
public class MVCController {
	@RequestMapping("/mvc")
	public ModelAndView showMVC() {
		ModelAndView mv = new ModelAndView("view_mvc");
		return mv;
	}
	@RequestMapping("/boot")
	public ModelAndView showMVC2() {
		ModelAndView mv = new ModelAndView("view_boot");
		return mv;
	}
}