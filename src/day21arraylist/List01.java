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
		
		ls.add(1,"K");// belirtilen indexe belirtilen elemaný yerleþtirir
		ls.add(0,"S");
		ls.add("T");
		ls.add("M");
		
		// listin içindeki eleman sayýsý
		System.out.println(ls.size());
		
		//bir listin boþ olup olmadýðýný kontrol eden
		System.out.println(ls.isEmpty()); //false
		
		//bir listen index kullanarak eleman silmek
		ls.remove(2);// bu ifade bize indexi girilen elemaný verir.
		System.out.println(ls);
		
		//bir list içerisindeki elemaný silme
		ls.remove("T");
		System.out.println(ls);
		ls.remove("x");// olmayan elemaný silmeye kalkarsak false üretir
		ls.remove("M"); // list teki ilk bulduðu "M" yi siler.
		System.out.println(ls);
		
		//bir listte istenilen elemanýn var olup olmadýðýný kontrol eder
		
		System.out.println(ls.contains("A"));
	
		//bir listin bir elemanýný deðitirmek
		ls.set(1,"Bursa");
		System.out.println(ls);
		
		//bir listteki elemanlarý sýralamak
		Collections.sort(ls);
		System.out.println(ls);
		
		//bir listteki tüm elemanlarý silme
		ls.clear();
		
		
	
	}

}
