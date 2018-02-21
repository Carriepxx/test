package org.fkit.controller;

import java.util.List;

import org.fkit.domain.PoisonHistory;
import org.fkit.service.PoisonHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PoisonHistoryController {

	@Autowired
	@Qualifier("poisonHistoryService")
	PoisonHistoryService poisonHistoryService;
	
	@RequestMapping(value="/poison-history")
	public String getAllPoisonHistory(Model model)
	{
		List<PoisonHistory> poisonHistories = poisonHistoryService.getAll();
		model.addAttribute("poisonHistories",poisonHistories);
		return "poison-history";
	}
}
