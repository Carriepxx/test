package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.HouseApplianceStatus;
import org.fkit.mapper.HouseApplianceStatusMapper;
import org.fkit.service.HouseApplianceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("houseApplianceStatusService")
public class HouseApplianceStatusServiceImpl implements HouseApplianceStatusService {

	@Autowired
	private HouseApplianceStatusMapper houseApplianceStatusMapper;
	
	@Override
	public List<HouseApplianceStatus> getAll() {
		return houseApplianceStatusMapper.getAll();
	}

}
