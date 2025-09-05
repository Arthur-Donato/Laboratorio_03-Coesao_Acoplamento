package entidades;

import exceptions.ValorInvalidoException;

public class Circulo implements FiguraGeometrica{
	
	private double raio;
	private final double PI = 3.14;
	
	
	public Circulo(double raio) throws ValorInvalidoException {
		if (raio < 0) {
			throw new ValorInvalidoException("Valor inválido: valor negativo não permitido");
		}

		this.raio = raio;
	}
	
	public Circulo() {
		
	}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return this.PI * (this.raio * this.raio);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * this.PI * this.raio;
	}
	
	@Override
	public String toString() {
		return "O circulo tem raio: " + this.raio;
	}

}
