package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Quadrado;

class QuadradoTeste {
	Quadrado quadrado;
	
	@BeforeEach
	public void setUp() {
		quadrado = new Quadrado(2);
	}
	
	@Test
	void testSetGetQuadrado() {
		Quadrado quad = new Quadrado();
		quad.setLado(3);
		assertEquals(3,quad.getLado());
	}
	
	@Test
	void testCalcularPerimetroQuadrado() {
		assertEquals(8,quadrado.calcularPerimetro());
	}
	
	@Test
	void testCalcularAreaQuadrado() {
		assertEquals(4, quadrado.calcularArea());
	}
	
	@Test
	void testToStringQuadrado() {
		String str = "O quadrado criado tem o lado de tamanho: "+quadrado.getLado();
		assertEquals(str, quadrado.toString());
	}

}
