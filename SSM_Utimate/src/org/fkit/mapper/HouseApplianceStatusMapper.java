package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.HouseApplianceStatus;

public interface HouseApplianceStatusMapper {
	@Select("select * from house_appliance_status")
	public List<HouseApplianceStatus> getAll();
}
