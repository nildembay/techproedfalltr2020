package day40lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyas�n� okuyunuz..(console yazd�r�n)
		
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).forEach(System.out::println);
		
		//FileForLambda dosyas�n� okuyunuz..(console b�y�k harflerle yazd�r�n)
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
		
		// FileForLambda dosyas�ndaki ilk sat�r� k���k harflerle okuyunuz
	//1. yol
		
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);
	//2. yol
		
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toLowerCase).findFirst());

		// lambda kelimesinin ka� sat�rda ge�ti�ini bulan program	
		
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).filter(t->t.toLowerCase().contains("Lambda")).count());
		
	
		
		
		//FileForLambda dosyas�nda t�m farkl� kelimeleri bir listin i�inde ekrana yazd�r�n�z...
		
		System.out.println(Files.
			lines(Paths.get("src/day40lambda/FileForLambda")).
			map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).
			distinct().collect(Collectors.toList()));
		
		//FileForLambda dosyas�nda t�m farkl� kelimeleri natural order olarak bir listin i�inde ekrana yazd�r�n�z...
		
		Files.
		lines(Paths.get("src/day40lambda/FileForLambda")).
		map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);
		
		// FileForLambda dosyas�nda "Lambda" kelimesinin ka� kere ge�ti�ini b�y�k harf k���k harf �nemsemeden ekrana yazd�ran program
		
		System.out.println(Files.
		lines(Paths.get("src/day40lambda/FileForLambda")).
		map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).filter(t->t.equals("lambda")).count());
		
		//FileForLambda dosyas�nda i�inde "m" harfi ge�en kelimelerin say�s�n� ekrana yazd�ran program
		System.out.println(Files.
				lines(Paths.get("src/day40lambda/FileForLambda")).
				map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("m")).count());
	
		//FileForLambda dosyas�nda i�inde "m" harfi ge�en kelimeleri ekrana yazd�ran program
		
		Files.
				lines(Paths.get("src/day40lambda/FileForLambda")).
				map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("m")).forEach(System.out::println);
		
		//FileForLambda dosyas�nda ka� farkl� harf bulundu�unu g�steren program
		
		System.out.println(Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
				map(t->t.replaceAll("\\W", "").split("")).flatMap(Arrays::stream).distinct().count());
		
		
		//FileForLambda dosyas�nda ka� farkl� kelime bulundu�unu g�steren program
		
		System.out.println(Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
				map(t->t.replaceAll("[.,?!-]","").split(" ")).flatMap(Arrays::stream).distinct().count());
		
		//FileForLambda dosyas�ndaki farkl� kelimeleri ekrana yazd�ran
		Files.lines(Paths.get("src\\day40lambda\\FileForLambda")).
        map(t->t.replaceAll("[.!?,\\-]", "").split(" ")).
        flatMap(Arrays::stream).
        distinct().
        forEach(System.out::println);
	}

}
