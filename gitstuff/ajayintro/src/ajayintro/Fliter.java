package ajayintro;

import java.util.stream.Stream;

public class Fliter {

	public static void main(String[] args) {
		
		
		Long c=Stream.of("ajay","rajesh","singh","aman").filter(s->s.startsWith("a")).count();
		System.out.println(c);

	}

}
