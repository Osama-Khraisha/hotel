package expedia.pojo;

public class HotelUrgencyInfo {
	private Long airAttachRemainingTime;
	private Long numberOfPeopleViewing;
	private Long numberOfPeopleBooked;
	private Long numberOfRoomsLeft;
	private Long lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private Boolean airAttachEnabled;

	public Long getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(Long airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public Long getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(Long numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public Long getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(Long numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public Long getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(Long numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public Long getLastBookedTime() {
		return lastBookedTime;
	}

	public void setLastBookedTime(Long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachEnabled(Boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

}
