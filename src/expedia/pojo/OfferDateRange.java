package expedia.pojo;

import java.util.List;

public class OfferDateRange {
	private List<Integer> travelStartDate;
	private List<Integer> travelEndDate;
	private Long lengthOfStay;

	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Long getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Long lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}
