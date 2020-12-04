package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTime01 {

	public static void main(String[] args) {
		
		//java da LocalDate class ý var.
		
		LocalDate date1=LocalDate.now();
		System.out.println(date1); //standart format
		
		System.out.println(date1.plusDays(3));//mevcut güne gün ekler
		System.out.println(date1.plusMonths(2));// mevcut aya belirtilen kadar ay ekler
		System.out.println(date1.plusDays(3).plusMonths(2)); //mevcut ayý ve günü arttýrýr.
		System.out.println(date1.plusYears(4));// mevcut yýla 4 ekler
		
		System.out.println(date1.minusDays(20));//20 gün geri gider.
		System.out.println(date1.minusMonths(11));
		System.out.println(date1.minusYears(4));
		System.out.println(date1.plusYears(3).minusMonths(4));
		
		//java da LocalTime class ý var.
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		System.out.println(time1.plusMinutes(12));
		System.out.println(time1.plusHours(3));
		
				
		System.out.println(time1.minusMinutes(13));
		System.out.println(time1.minusHours(3));
		
		//baþka ülkelerin saatini bulmak
		LocalTime time2=LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(time2);
		
		//tarihlerin formatýný deðiþtirmek için DateTimeFormatter class ýný kullanýrýz.
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		System.out.println(date1.format(dtf1));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");
		System.out.println(date1.format(dtf2));
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d/MMMM/yyyy");
		System.out.println(date1.format(dtf3));
		
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("MMMM/d");
		System.out.println(date1.format(dtf4));
		
		//Zaman formatýný deðiþtirmek 
		DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("hh:mm");//hour ve minute 12'lik dilim
		System.out.println(time1.format(dtf5)+"pm");
		
		DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("HH:mm");//hour ve minute 24'lik dilim
		System.out.println(time1.format(dtf6));
		
	}

}
