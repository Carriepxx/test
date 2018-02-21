package org.fkit.controller;

import java.util.List;

import org.fkit.domain.HouseApplianceStatus;
import org.fkit.service.HouseApplianceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HouseApplianceStatusController {
	
	@Autowired
	@Qualifier("houseApplianceStatusService")
	HouseApplianceStatusService houseApplianceStatusService;
	
	@RequestMapping(value="houseAppliance-status")
	public String getAllHouseApplianceStatus(Model model)
	{
		List<HouseApplianceStatus> houseApplianceStatuss = houseApplianceStatusService.getAll();
		model.addAttribute("houseApplianceStatuss",houseApplianceStatuss);
		
		return "houseAppliance-status";
	}
}
