import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	    Optional<String> opt = Optional.empty();
	    System.out.println(opt.isPresent());
	    
	    List<String> maList = new ArrayList<String>();
	    maList.add("toto");
	    maList.add("hello");
	    maList.add("titi");
	    maList.add("tata");
	    maList.add("tata");
	   //maList = maList.stream().dropWhile(s -> s.endsWith("o")).collect(Collectors.toList());
	    maList.forEach(maChaine -> System.out.println(maChaine));
	    System.out.println(maList.size());
	    
	    System.out.println("taille before : " + maList.stream().count());
	    
	    System.out.println("taille after : " + maList.stream().count());
	 
	    
	   String result = "toto";
	   System.out.println("optional else get");
	   String myResult = Optional.ofNullable(result).orElseGet(() -> executeFunctionWithOptional());
	   
	   
	   System.out.println("-------------------------------------");
	   System.out.println("optional else");
	   myResult = Optional.ofNullable(result).orElse(executeFunctionWithOptional());
	   
	   String test = "t";
	   Optional<String> optionalof = Optional.of(test);
	   
	   
	   System.out.println("Optional result : " + myResult);
	   
	   List<String> list= new ArrayList();
	      list.add("Ram");
	      list.add("TutorialPoints");
	      list.stream().forEach(System.out::print);
	      List<String> list3= new ArrayList();
	      list3.add("Ram");
	      list3.add("TutorialPoints");
	      list3.forEach(System.out::print);
	      //THIS A COMMENT
	      System.out.println("hello world");
	}
	
	public static String  executeFunctionWithOptional() {
		
		System.out.println("i call function if i not null");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		return "zizi";
	}

}
