package com.bridgelab.hotelreservation;

import java.util.ArrayList;
import org.junit.*;

public class HotelReservationTest {

	HotelReservation hrTest = new HotelReservation();

//	@Test
//	public void givenHotelNameShouldReturnItsHotelName() {
//		boolean result = hrTest.addHotel();
//		Assert.assertTrue(result);
//	}
	
//	@Test
//	public void givenHotelInfo_shouldReturnChepestHotel(){
//		for(int i=1;i<=3;i++)
//			 hrTest.addHotel();
//       ArrayList<HotelResult> arr= hrTest.findCheapestHotel("10Sep2021", "11Sep2021");
//       int expected = arr.get(0).getTotalRate();
//       Assert.assertEquals(220, expected);
//	}
	
//	@Test
//	public void givenHotelInfo_shouldReturnWeekdaysWeekendsRates() {
//		for(int i=1;i<=3;i++)
//			 hrTest.addHotel();
//      ArrayList<HotelResult> arr = hrTest.findCheapestHotel("11Sep2021", "12Sep2021");
//      String expected = arr.get(0).getName();
//      Assert.assertEquals("Lakewood", "Bridgewood" , expected);
//		
//	}
	
	@Test
	public void givenHotelInfo_shouldReturnCheapestRatingHotel() {
		for(int i=1;i<=3;i++)
			hrTest.addHotel();
		ArrayList<HotelResult> arr = hrTest.findCheapestRatedHotel("11Sep2021", "12Sep2021");
		String expected = arr.get(0).getName();
		Assert.assertEquals("Bridgewood" , expected);
	}
}
