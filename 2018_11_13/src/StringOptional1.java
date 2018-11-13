import java.util.*;

public class StringOptional1 {

	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.ofNullable(new String("hello"));
		
		if(os1.isPresent())
			System.out.println(os1.get());
		if(os2.isPresent())
			System.out.println(os2.get());
		os1.ifPresent(s->System.out.println(s)); // 람다식
		os2.ifPresent(System.out::println); //메소드 참조
		/*
		  ifPresent의 매개변수 형은 Consumer이다
		  
		  Public void ifPresent(Consumer<? super T>consumer)
		  
		  Consumer<T> void accept ( T t)
		  -> void accept ( String t)
		  
		  	if(os1.isPresent())
			System.out.println(os1.get());     -> os1.ifPresent(s->System.out.println(s));
			
			큰 의미가 있다 !!!!!!!
		  
		 */

	}

}
