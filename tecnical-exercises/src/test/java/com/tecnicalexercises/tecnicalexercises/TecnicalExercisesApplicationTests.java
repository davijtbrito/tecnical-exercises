package com.tecnicalexercises.tecnicalexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecnicalexercises.tecnicalexercises.functionalities.FuncInterfaceExamples;

@SpringBootTest
class TecnicalExercisesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFuncInterface(){
		FuncInterfaceExamples funcInterface = new FuncInterfaceExamples();
		
		String str = "davi";        
		String strFmt = funcInterface.fmtString(str, p -> "**" + p + "**");		
		assertEquals(strFmt, "**"+ str +"**"); 
	}

	@Test
	void testPredicates(){
		
		Predicate<Integer> greaterThanTen = (i) -> i> 10;
		assertTrue(greaterThanTen.test(11));
		assertFalse(greaterThanTen.test(8));
	}


}
