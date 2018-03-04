package expedia.utils;

import java.util.Map;

public class Utils {

	public static String addParameter(String URL, Map<String, String[]> params) {
		for (String key : params.keySet()) {
			if (params.get(key)[0] != null && !params.get(key)[0].isEmpty()) {
				URL = URL.concat("&").concat(key).concat("=").concat(params.get(key)[0]);
			}
		}
		return URL;
	}

}
