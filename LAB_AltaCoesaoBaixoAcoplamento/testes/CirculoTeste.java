package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Circulo;
import exceptions.ValorInvalidoException;

class CirculoTeste {
	
	Circulo circulo;
	
	@BeforeEach
	public void setUp() {
		try {
			circulo = new Circulo(2);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testGetSetRaioCirculo() {
		Circulo cir = new Circulo();
		cir.setRaio(2);
		assertEquals(2, cir.getRaio());
	}
	
	@Test
	void testValorInvalido() {
		assertThrows(ValorInvalidoException.class, () -> circulo = new Circulo(-2));
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
