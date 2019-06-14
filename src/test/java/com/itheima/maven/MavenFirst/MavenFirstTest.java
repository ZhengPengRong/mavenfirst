package com.itheima.maven.MavenFirst;

import org.junit.Assert;
import org.junit.Test;

public class MavenFirstTest 
{
	@Test
	public void testSayHello()
	{
		MavenFirst first=new MavenFirst();
		String resul=first.sayHello("Hello Maven");
		Assert.assertEquals("Hello Maven", resul);
	}
}
