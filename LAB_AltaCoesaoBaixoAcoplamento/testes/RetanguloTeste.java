package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Retangulo;
import exceptions.ValorInvalidoException;

class RetanguloTeste {
	Retangulo retangulo;
	
	@BeforeEach
	public void setUp() {
		try {
			retangulo = new Retangulo(2,2);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testGetSetAlturaRetangulo() {
		Retangulo ret = new Retangulo();
		ret.setAltura(2);
		
		assertEquals(2, ret.getAltura());
	}
	
	@Test
	void testValorInvalidoAlturaRetangulo(){
		assertThrows(ValorInvalidoException.class , () -> retangulo = new Retangulo(-1,20));
		
	}
	
	@Test
	void testValorInvalidoLarguraRetangulo() {
		assertThrows(ValorInvalidoException.class, () -> retangulo = new Retangulo(20,-1));
	}
	
	@Test
	void testGetSetLarguraRetangulo() {
		Retangulo ret = new Retangulo();
		ret.setLargura(2);
		
		assertEquals(2, ret.getLargura());
	}
	
	@Test
	void testCalcularPerimetroRetangulo() {
		assertEquals(8, retangulo.calcularPerimetro());
	}
	
	@Test
	void testCalcularAreaRetangulo() {
		assertEquals(4, retangulo.calcularArea());
	}
	
	@Test
	void testToStringRetangulo() {
		String str = "O retângulo criado tem largura de tamanho: " + retangulo.getLargura() + " e altura de tamanho: " + retangulo.getAltura();
		
		assertEquals(str, retangulo.toString());
	}

}
