package day21arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class List01 {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
	
		ls.add("B");
		ls.add("M");
		ls.add("A");
		
		ls.add(1,"K");// belirtilen indexe belirtilen eleman� yerle�tirir
		ls.add(0,"S");
		ls.add("T");
		ls.add("M");
		
		// listin i�indeki eleman say�s�
		System.out.println(ls.size());
		
		//bir listin bo� olup olmad���n� kontrol eden
		System.out.println(ls.isEmpty()); //false
		
		//bir listen index kullanarak eleman silmek
		ls.remove(2);// bu ifade bize indexi girilen eleman� verir.
		System.out.println(ls);
		
		//bir list i�erisindeki eleman� silme
		ls.remove("T");
		System.out.println(ls);
		ls.remove("x");// olmayan eleman� silmeye kalkarsak false �retir
		ls.remove("M"); // list teki ilk buldu�u "M" yi siler.
		System.out.println(ls);
		
		//bir listte istenilen eleman�n var olup olmad���n� kontrol eder
		
		System.out.println(ls.contains("A"));
	
		//bir listin bir eleman�n� de�itirmek
		ls.set(1,"Bursa");
		System.out.println(ls);
		
		//bir listteki elemanlar� s�ralamak
		Collections.sort(ls);
		System.out.println(ls);
		
		//bir listteki t�m elemanlar� silme
		ls.clear();
		
		
	
	}

}
