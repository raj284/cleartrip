package com.tests.cleartrip.common;

public class SearchDetailsBuilder {
	
   private String source;
   private String destination;
   private String departureDate;
   private String returnDate;
   private int nummberOfTravellers;
   private String travelClass;

   public SearchDetailsBuilder sourceDetails(String source)
   {
	   this.source = source;
	   return this;
   }
   
   public SearchDetailsBuilder destinationDetails(String destination)
   {
	   this.destination = destination;
	   return this;
   }
   
   
   public SearchDetailsBuilder departureDetails(String departureDate)
   {
	   this.departureDate = departureDate;
	   return this;
   }
   
   
   public SearchDetailsBuilder returnDetails(String returnDate)
   {
	   this.returnDate = returnDate;
	   return this;
   }

   public SearchDetailsBuilder nummberOfTravellersDetails(int nummberOfTravellers)
   {
	   this.nummberOfTravellers = nummberOfTravellers;
	   return this;
   }
   
   public SearchDetailsBuilder travelClassDetails(String travelClass)
   {
	   this.travelClass = travelClass;
	   return this;
   }
   
   
   public SearchDetails build()
   {
	   return new SearchDetails (source,destination,departureDate,returnDate,nummberOfTravellers,travelClass);
	   
   }
   
   
   
   
   
   
}
