package org.fkit.controller;

import java.util.List;

import org.fkit.domain.PoisonCurrent;
import org.fkit.service.PoisonCurrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PoisonCurrentController {
	@Autowired
	@Qualifier("poisonCurrentService")
	private PoisonCurrentService poisonCurrentService;

	/**
	 * 澶勭悊/main璇锋眰
	 * */
	@RequestMapping(value="/poison-current")
	 public String getAllPoisonCurrent(Model model){
		List<PoisonCurrent> poisonCurrents = poisonCurrentService.getAll();
		
		model.addAttribute("poisonCurrents", poisonCurrents);
		return "poison-current";
	}
}