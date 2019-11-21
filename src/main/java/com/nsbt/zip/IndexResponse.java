package com.nsbt.zip;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexResponse {

	public Map<String, String> getPrefectures() {
		Map<String, String> prefectures = new LinkedHashMap<>();
		prefectures.put("hokkaido", "北海道");
		prefectures.put("aomoriken", "青森県");
		return prefectures;
	}
}
