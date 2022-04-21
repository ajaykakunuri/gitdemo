package ajayintro;

import java.util.stream.Stream;

public class Streams {

	public void Filter()
	{
		Stream.of("ajay","rajesh","singh","aman").filter(s->s.startsWith("a")).forEach(s->System.out.println(s));

	}

}
