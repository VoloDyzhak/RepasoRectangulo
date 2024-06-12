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

@Test 
void testArea2() {
	int Area2Esperada = 21;
	int Area2Obtenida = r2.arrea();
	assertEquals(Area2Esperada,Area2Obtenida);
	
}

@Test 
void testPerimetro2() {
	int perimetro2Esparado = 20;
	int perimetro2Obtenido = r2.perimetro();
	assertEquals(perimetro2Esparado, perimetro2Obtenido);
}
@Test
void testRectanguloExeption1() {
	Exception exception = assertThrows(IllegalArgumentException.class,
			() -> new rectangulo(-2,0));
	String mensajeEsperado = "La base y altura deben ser superiores a 0";
	String mensajeObtenido = exception.getMessage();
	assertEquals(mensajeEsperado, mensajeObtenido);
	
		
		
	
}

}
