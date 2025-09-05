package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Circulo;

class CirculoTeste {
	
	Circulo circulo;
	
	@BeforeEach
	public void setUp() {
		circulo = new Circulo(2);
	}

	@Test
	void testGetSetRaioCirculo() {
		Circulo cir = new Circulo();
		cir.setRaio(2);
		assertEquals(2, cir.getRaio());
	}
	@Test
	void testValorInvalido(){
		assertEquals("Valor inválido: valor negativo não permitido",circulo = new Circulo(-1))
	}
	
	@Test
	void testCalularPerimetroCirculo() {
		assertEquals(12.56, circulo.calcularPerimetro());
	}
	
	@Test
	void testCalcularAreaCirculo() {
		assertEquals(12.56, circulo.calcularArea());
	}
	
	@Test
	void testToStringCirculo() {
		String str = "O circulo tem raio: " + circulo.getRaio();
		assertEquals(str, circulo.toString());
	}

}
