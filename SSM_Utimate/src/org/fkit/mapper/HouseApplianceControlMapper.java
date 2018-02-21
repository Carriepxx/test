package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.HouseApplianceControl;

public interface HouseApplianceControlMapper {
	@Select("select * from house_appliance_control")
	public List<HouseApplianceControl> getAll();
}
