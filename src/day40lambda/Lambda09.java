package day40lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasýný okuyunuz..(console yazdýrýn)
		
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).forEach(System.out::println);
		
		//FileForLambda dosyasýný okuyunuz..(console büyük harflerle yazdýrýn)
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
		
		// FileForLambda dosyasýndaki ilk satýrý küçük harflerle okuyunuz
	//1. yol
		
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);
	//2. yol
		
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toLowerCase).findFirst());

		// lambda kelimesinin kaç satýrda geçtiðini bulan program	
		
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).filter(t->t.toLowerCase().contains("Lambda")).count());
		
	
		
		
		//FileForLambda dosyasýnda tüm farklý kelimeleri bir listin içinde ekrana yazdýrýnýz...
		
		System.out.println(Files.
			lines(Paths.get("src/day40lambda/FileForLambda")).
			map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).
			distinct().collect(Collectors.toList()));
		
		//FileForLambda dosyasýnda tüm farklý kelimeleri natural order olarak bir listin içinde ekrana yazdýrýnýz...
		
		Files.
		lines(Paths.get("src/day40lambda/FileForLambda")).
		map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);
		
		// FileForLambda dosyasýnda "Lambda" kelimesinin kaç kere geçtiðini büyük harf küçük harf önemsemeden ekrana yazdýran program
		
		System.out.println(Files.
		lines(Paths.get("src/day40lambda/FileForLambda")).
		map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).filter(t->t.equals("lambda")).count());
		
		//FileForLambda dosyasýnda içinde "m" harfi geçen kelimelerin sayýsýný ekrana yazdýran program
		System.out.println(Files.
				lines(Paths.get("src/day40lambda/FileForLambda")).
				map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("m")).count());
	
		//FileForLambda dosyasýnda içinde "m" harfi geçen kelimeleri ekrana yazdýran program
		
		Files.
				lines(Paths.get("src/day40lambda/FileForLambda")).
				map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("m")).forEach(System.out::println);
		
		//FileForLambda dosyasýnda kaç farklý harf bulunduðunu gösteren program
		
		System.out.println(Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
				map(t->t.replaceAll("\\W", "").split("")).flatMap(Arrays::stream).distinct().count());
		
		
		//FileForLambda dosyasýnda kaç farklý kelime bulunduðunu gösteren program
		
		System.out.println(Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
				map(t->t.replaceAll("[.,?!-]","").split(" ")).flatMap(Arrays::stream).distinct().count());
		
		//FileForLambda dosyasýndaki farklý kelimeleri ekrana yazdýran
		Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
        map(t->t.replaceAll("[.!?,\\-]", "").split(" ")).
        flatMap(Arrays::stream).
        distinct().
        forEach(System.out::println);
	}

}
