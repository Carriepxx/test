package org.fkit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 澶勭悊鍥句功璇锋眰鎺у埗鍣�
 * */
@Controller
public class MainController {
	@RequestMapping(value= "/main")
	 public String main(Model model){
		// 璺宠浆鍒癿main椤甸潰
		return "main";
	}
	

	@RequestMapping(value="/")
	public String main()
	{
		return "loginForm";
	}
}
