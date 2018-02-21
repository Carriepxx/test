package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.PoisonHistory;
import org.fkit.mapper.PoisonHistoryMapper;
import org.fkit.service.PoisonHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("poisonHistoryService")
public class PoisonHistoryServiceImpl implements PoisonHistoryService {

	@Autowired
	private PoisonHistoryMapper poisonHistoryMapper;
	@Override
	public List<PoisonHistory> getAll() {
		return poisonHistoryMapper.getAll();
	}

}
