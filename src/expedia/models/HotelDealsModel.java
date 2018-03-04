package expedia.models;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import expedia.pojo.HotelsDeals;
import expedia.utils.Utils;

public class HotelDealsModel {

	private String hotelDealsAPI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	public HotelsDeals getHotelDeals(HttpServletRequest request) {
		HotelsDeals hoteDeals = null;
		try {
			// Do API Request
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(Utils.addParameter(hotelDealsAPI, request.getParameterMap()));
			HttpResponse httpResponse = client.execute(httpGet);
			HttpEntity responseEntity = httpResponse.getEntity();
			String rsponse = responseEntity != null ? EntityUtils.toString(responseEntity) : null;
			// Parse Json Into POJOs
			Gson gson = new GsonBuilder().create();
			hoteDeals = gson.fromJson(rsponse, HotelsDeals.class);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return hoteDeals;

	}

}
