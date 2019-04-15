package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.Fortune;

public interface FortuneRepository extends JpaRepository<Fortune, Integer>
{

}
