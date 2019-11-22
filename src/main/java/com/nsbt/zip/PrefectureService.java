package com.nsbt.zip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrefectureService {

	@Autowired
	private ZipRepository repository;

	public List<Prefecture> findAll () {
		return repository.findAll();
	}
}
