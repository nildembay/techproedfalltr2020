package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1=new E01();
		
		System.out.println(obj1.getAge());  //25
		
		System.out.println(obj1.getName()); //Ali
		
		obj1.setAge(33);
		System.out.println(obj1.getAge());//33
		
		obj1.setName("Ayþe");
		System.out.println(obj1.getName());
		
		E03 obj3=new E03();
		
		//num ý 38 yap ve ekrana yazdýr
		obj3.setNum(38);
		System.out.println(obj3.getNum());
		
		// name i ekrana yazdýr
		System.out.println(obj3.getName());
		
		//Initial variableýný deðiþtirilemz yapýn
		// cevap E03 teki setInitial metodunu sileriz
		
		
		//Initial  variablený okunamaz yapýn
		// cevap E03 teki getInitial metodunu sileriz
	}

}
