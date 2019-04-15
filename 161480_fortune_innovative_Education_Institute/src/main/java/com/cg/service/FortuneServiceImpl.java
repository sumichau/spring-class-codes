package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Fortune;
import com.cg.dao.FortuneRepository;
@Service
public class FortuneServiceImpl implements FortuneService {
    
	@Autowired
	FortuneRepository fortuneRepository;
	@Override
	public Fortune searchByFortuneById(Integer id) {
		Optional<Fortune> findById = fortuneRepository.findById(id);
		return findById.get();
	}

}
