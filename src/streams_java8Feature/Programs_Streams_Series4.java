package streams_java8Feature;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Programs_Streams_Series4 {

	//Sequential Streams
	
	@Test(enabled=false)
	public void sequentialStreams() {
		
		Stream<String> stream = Stream.of("Anand","Simon","Tom","Peter","Thomas");
		
		stream.forEach(System.out :: println);		
					
	}
	
	@Test(enabled=false)
	public void sequentialStreams_ifPresent() {
		
		Stream<String> stream = Stream.of("Anand","Simon","Tom","Peter","Thomas");
		
		stream.findFirst().ifPresent(System.out ::println);	
					
	}
	
	@Test(enabled=false)
	public void printRange1To10_IntStream_range() {
		
		IntStream.range(1,11).forEach(System.out :: println);
					
	}

	@Test(enabled=false)
	public void iterateStream_Stream_iterate() {
		
		Stream.iterate(1, n -> n+1).limit(10).forEach(System.out :: println);
					
	}
	
	@Test(enabled=false)
	public void find10OddNumbers_iterate() {
		
		Stream.iterate(1, n -> n+1)
		.filter(i -> i%2 != 0)
		.limit(10).forEach(System.out :: println);
					
	}

	@Test(enabled=false)
	public void GetIntegerfromString_useSubStringandFindMax() {
		//String data objects
		
		Stream<String> stream = Stream.of("001Anand","276Simon","469Tom","289Peter","342Thomas");
		
		//Extract 1st 3 character from each string then convert it into Int and find max value
		
		stream
			.map(e -> e.substring(0,3))
			.mapToInt(Integer :: parseInt) //Covert String to Integer
			.max()
			.ifPresent(System.out :: println);		
					
	}
		
	@Test(enabled=false)
	public void GetIntegerfromDoubleAndAdd2_mapToInt_map() {
		//Double data objects
		
		Stream<Double> stream = Stream.of(12.32,27.56,46.55,34.52,98.33);
				
		stream
			.mapToInt(Double :: intValue) //convert double to integer-> Double.intValue(12.32) -> Get intvalue from Double
			.map(i -> i+2)
			.forEach(e -> System.out.println(e));	
					
	}
	
	@Test(enabled=false)
	public void GetIntegerfromDoubleAndConcatenateWithStr_mapToInt_mapToObj() {
			
		//Double to String Object
		Stream<Double> stream = Stream.of(12.32,27.56,46.55,34.52,98.33);
		
		stream
			.mapToInt(Double :: intValue) //Get intvalue from Double
			//.map(i -> i+"a")
			.mapToObj(i -> i+"a")
			.forEach(e -> System.out.println(e));	
					
	}
	
	
	//Parallel Streams
	
	
	
}
