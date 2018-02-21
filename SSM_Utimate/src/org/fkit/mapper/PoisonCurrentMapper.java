package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.PoisonCurrent;

public interface PoisonCurrentMapper {

	@Select("select * from poison_current")
	public List<PoisonCurrent> getAll();
}
