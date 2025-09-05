package entidades;

public class Retangulo implements FiguraGeometrica{
	private double largura;
	private double altura;
	
	
	
	public Retangulo(double largura, double altura) {
		setAltura(altura);
		setLargura(largura);
		if (largura < 0||altura < 0) {
			throw new ValorInvalidoException("Valor inválido: valor negativo não permitido");
		}

	}
	
	public Retangulo() {}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if (altura <= 0) {
			//throw new ValorNegativoException("A altura deve ser maior que zero.");
		}
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
		
	}
	
	public void setLargura(double largura) {
		if (largura <= 0) {
			//throw new ValorNegativoException("A largura deve ser maior que zero.");
		}
		this.largura = largura;
	}
	
	public String toString() {
		return "O retângulo criado tem largura de tamanho: " + largura + " e altura de tamanho: " + altura;
	}

	@Override
	public double calcularArea() {
		return largura * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (largura + altura)*2;
	}
}