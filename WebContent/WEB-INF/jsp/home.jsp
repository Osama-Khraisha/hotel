<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="expedia.pojo.Hotel"
	import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<form action>
					<td></br>
					<input type="submit" value="Filter" class="btn-primary" /></td>
					<td>Name</td>
					<td>Location <input type="text" class="form-control"
						name="destinationName"></td>
					<td>Rating <input type="number" class="form-control"
						name="minStarRating" placeholder="Min Star Rating"></td>
					<td>Average Pricing</td>
					<td>Info Site</td>
				</form>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${hotelDeals}" var="hotel">
			
				<tr>
					<td><img src="${hotel.hotelInfo.hotelImageUrl}" /></td>
					<td>${hotel.hotelInfo.hotelName}</td>
					<td><a target="_blank"
						href="https://www.google.jo/maps?q=${hotel.hotelInfo.hotelLatitude},
	  					${hotel.hotelInfo.hotelLongitude}">${hotel.destination.shortName}
					</a></td>
					<td>${hotel.hotelInfo.hotelStarRating}</td>
					<td>${hotel.hotelPricingInfo.averagePriceValue}<b>
							${hotel.hotelPricingInfo.currency}</b>
					</td>
					<td><a target="_blank"
						href="${hotel.hotelUrls.hotelInfositeUrl}"> Website </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${hotelDeals == null || hotelDeals == ''}">
	<center> No Data Found </center> 
		</c:if>
</body>
</html>