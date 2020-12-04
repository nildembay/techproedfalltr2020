package day40lambda;

import java.util.ArrayList;

import java.util.List;
import java.util.OptionalDouble;


public class Lambda07 {

	public static void main(String[] args) {
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		
		
		System.out.println(ogrSayiAvgScr93Bir(courseList));
		System.out.println(ogrSayiAvgScr93Iki(courseList));
		System.out.println(OgrenciSayisi140danFazlaAverage(courseList));
		System.out.println(dayKursSayisi(courseList));
		System.out.println(OgrenciSay130tanFazlaMax (courseList));
		System.out.println(OgrenciSay150denAzMin ( courseList));
	}
	
	//average skorlar� 93 ten fazla kurslar�n ��renci say�lar� toplam�n� bulunuz.
	
	public static int ogrSayiAvgScr93Bir(List<Course> courseList){
		return courseList.stream().filter(t->t.getAverageScore()>93).map(t->t.getNumberOfStudents()).reduce(0,Integer::sum);
	}
	
	public static int ogrSayiAvgScr93Iki(List<Course> courseList){
		return courseList.stream().filter(t->t.getAverageScore()>93).mapToInt(t->t.getNumberOfStudents()).sum();
	}
	
	//��renci say�lar� 140 tan fazla olan kurslar�n average score unu bulunuz.
	
	public static OptionalDouble OgrenciSayisi140danFazlaAverage(List<Course> courseList){
		
		return courseList.stream().filter(t-> t.getNumberOfStudents()>140).mapToDouble(t-> t.getAverageScore()).average();
	}
	
	//day time kurslar�n�n say�s�n� bulan bir program
	
	public static long dayKursSayisi(List<Course> courseList) {
		return courseList.stream().filter(t->t.getCourseName().contains("Day")).count();
	}
	
	//��renci say�lar� 130 tan fazla olanlar�n max average scorelar�n� bulunuz
	
	public static OptionalDouble OgrenciSay130tanFazlaMax (List<Course> courseList) {
		return courseList.stream().filter(t->t.getNumberOfStudents()>130).mapToDouble(Course::getAverageScore).max();
	}
	
	//��renci say�lar� 150 den az olanlar�n mminimum average scorelar�n� bulunuz
	
	public static OptionalDouble OgrenciSay150denAzMin (List<Course> courseList) {
		return courseList.stream().filter(t->t.getNumberOfStudents()<150).mapToDouble(Course::getAverageScore).min();
	}
	
	
	
	
	
	
	

}
