package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.PoisonHistory;

public interface PoisonHistoryMapper {
	@Select("select * from poison_history")
	public List<PoisonHistory> getAll(); 
}
