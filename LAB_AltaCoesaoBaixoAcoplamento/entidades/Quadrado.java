package entidades;

public class Quadrado implements FiguraGeometrica{
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado() {
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularPerimetro() {
		return this.lado * 4;
	}
	
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	public String toString() {
		return "O quadrado criado tem o lado de tamanho: " + this.lado;
	}

}
