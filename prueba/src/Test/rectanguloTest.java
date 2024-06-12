package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clase.rectangulo;

class rectanguloTest {
	static private rectangulo r1 ;
	static private rectangulo r2;
	

@BeforeAll
	static void init() {
	
	r1 = new rectangulo(2, 3);
	r2 = new rectangulo(7, 3);
}

    

@Test

void testArea1() {
	int areaEsperada = 6;
	int areaObtenida = r1.arrea();
	assertEquals(areaEsperada, areaObtenida);
}


@Test

void testPerimetro1() {
	int perEsperada = 10;
	int perObtenida = r1.perimetro();
	assertEquals(perEsperada, perObtenida);
}



}
