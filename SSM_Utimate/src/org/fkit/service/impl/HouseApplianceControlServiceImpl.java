package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.HouseApplianceControl;
import org.fkit.mapper.HouseApplianceControlMapper;
import org.fkit.service.HouseApplianceControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("houseApplianceControlService")
public class HouseApplianceControlServiceImpl implements HouseApplianceControlService {

	@Autowired
	private HouseApplianceControlMapper houseApplianceControlMapper;
	@Override
	public List<HouseApplianceControl> getAll() {
		return houseApplianceControlMapper.getAll();
	}

}
