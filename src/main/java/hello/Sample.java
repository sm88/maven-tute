package hello;

public class Sample{
	public String greet(){
		Greeter greeter = new Greeter();		
		return greeter.greet();
	}

	public static void main(String[] args) {
		System.out.println(new Sample().greet());
	}
}