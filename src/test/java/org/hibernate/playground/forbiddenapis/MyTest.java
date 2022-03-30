package org.hibernate.playground.forbiddenapis;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class MyTest {

	@Test
	void test() {
		System.out.printf( Locale.ROOT, "Runtime version: %s\n", Runtime.version() );
	}
}
