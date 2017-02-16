package com.tests.cleartrip.common;

public class SearchDetails {
	private String source;
	   private String destination;
	   private String departureDate;
	   private String returnDate;
	   private int nummberOfTravellers;
	   private String travelClass;
	
	
	SearchDetails(String source,String destination,String departureDate,String returnDate,int nummberOfTravellers,String travelClass)
	{
		this.destination=destination;
		this.source=source;
		this.departureDate=departureDate;
		this.returnDate=returnDate;
		this.nummberOfTravellers=nummberOfTravellers;
		this.travelClass=travelClass;
		
		
	}
	
	public String getSource()
	{
		return source;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public String getDepartureDate()
	{
		return departureDate;
	}

	public String getReturnDate()
	{
		return returnDate;
	}
	
	
	public int getNummberOfTravellers()
	{
		return nummberOfTravellers;
		
	}
	
	public String getTravelClass()
	{
		return travelClass;
	}
	
	
}
