package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.PoisonCurrent;
import org.fkit.mapper.PoisonCurrentMapper;
import org.fkit.service.PoisonCurrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("poisonCurrentService")
public class PoisonCurrentServiceImpl implements PoisonCurrentService {

	@Autowired
	private PoisonCurrentMapper poisonCurrentMapper;
	@Override
	public List<PoisonCurrent> getAll() {
		return poisonCurrentMapper.getAll();
	}

}
