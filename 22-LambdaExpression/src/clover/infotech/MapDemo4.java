package clover.infotech;


import java.util.Arrays;
import java.util.List;

public class MapDemo4 {

	public static void main(String[] args) {
		
		List<String> javaCource = Arrays.asList("coreJava","advJava","springboot", "restapi","micrservice");
		
		javaCource.stream().limit(3).forEach( c -> System.out.println(c));
		
		javaCource.stream().skip(3).forEach(c -> System.out.println(c));
		
		List<String> names = Arrays.asList("raja","rani","raja","rani","guru");
		names.stream().distinct().forEach(name -> System.out.println("MapDemo4.main()"));
		
		
		

	}

}
