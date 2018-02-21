package org.fkit.controller;

import java.util.List;

import org.fkit.domain.HouseApplianceControl;
import org.fkit.service.HouseApplianceControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HouseApplianceControlController {

	@Autowired
	@Qualifier("houseApplianceControlService")
	private HouseApplianceControlService houseApplianceControlService;
	
	@RequestMapping(value="houseAppliance-cotrol")
	public String getAllhouseApplianceControl(Model model)
	{
		List<HouseApplianceControl> houseApplianceControls = houseApplianceControlService.getAll();
		model.addAttribute("houseApplianceControls",houseApplianceControls);
		return "houseAppliance-cotrol";
	}
}
