package spring;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.MeanFilter;
import core.Negative;

public class SpringTest {
	
	static ApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void test() {
		Negative negative = context.getBean("Negative",Negative.class);
		assertEquals(negative, context.getBean("Negative",Negative.class));
		MeanFilter meanFilter = context.getBean("MeanFilter",MeanFilter.class);
		assertEquals(meanFilter, context.getBean("MeanFilter",MeanFilter.class));
		
	}

}
