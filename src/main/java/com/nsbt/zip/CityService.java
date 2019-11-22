package com.nsbt.zip;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CityService {
	List<City> find(int prefectureId) {
		return Arrays.asList(
				new City(0, "札幌市"),
				new City(1, "小樽市"),
				new City(2, "旭川市"));
	}
}
