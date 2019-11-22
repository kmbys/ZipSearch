package com.nsbt.zip;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ZipRepository {

	@Select("select ID, NAME from PREFECTURES")
	List<Prefecture> findAll();
}
