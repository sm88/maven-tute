package hello;

import junit.framework.*;
import org.junit.*;
import hello.*;

public class SampleTest extends TestCase{
	private Sample sample;
	private Greeter greeter;
	protected void setUp(){
		sample = new Sample();
		greeter = new Greeter();
	}

	public void testGreeter(){
		assertEquals(greeter.greet(),"Hello spring!");
	}

	public void testSample(){
		assertEquals(sample.greet(),"Hello spring!");
	}
}