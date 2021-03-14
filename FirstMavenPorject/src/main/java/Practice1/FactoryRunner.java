package Practice1;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryRunner {

@Test	
@Factory
public Object[] RunTest(){
	
	return new Object[] {new Factory1Test(), new Factory2Test()};

}}