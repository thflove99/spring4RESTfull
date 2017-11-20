package com.spring4RESTful.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sping4RESTful.bean.Hello;

public class TestHello {
	
	@Test
	public void testHello(){
		Hello hello = new Hello();
		assertEquals(hello.sayHello(),"Hello,spring4RESTful");
	}

}
