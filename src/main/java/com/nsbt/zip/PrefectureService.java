package com.nsbt.zip;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PrefectureService {
	public List<Prefecture> findAll () {
		return Arrays.asList(
				new Prefecture (1, "北海道"),
				new Prefecture(2, "東京都"),
				new Prefecture(3, "沖縄県"));
	}
}
