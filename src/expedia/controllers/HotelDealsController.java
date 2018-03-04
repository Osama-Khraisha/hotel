package expedia.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import expedia.models.HotelDealsModel;

@Controller
public class HotelDealsController {
	@Autowired
	private HotelDealsModel hotelDealsModel;

	@RequestMapping(value = "/")
	public ModelAndView getHotelDeals(HttpServletRequest request) {

		return new ModelAndView("home", "hotelDeals", hotelDealsModel.getHotelDeals(request).getOffers().getHotel());
	}
}
