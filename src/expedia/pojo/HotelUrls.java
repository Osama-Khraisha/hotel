package expedia.pojo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;

	public String getHotelInfositeUrl() {
		String urlDecoded = null;
		try {
			urlDecoded = URLDecoder.decode(hotelInfositeUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return urlDecoded;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	public String getHotelSearchResultUrl() {
		String urlDecoded = null;
		try {
			urlDecoded = URLDecoder.decode(hotelSearchResultUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return urlDecoded;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
}
