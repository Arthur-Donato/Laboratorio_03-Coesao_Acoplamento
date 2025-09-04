package entidades;

import java.util.ArrayList;
import java.util.List;

public class BrincandoComAsFigurasGeometricas {

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Retangulo(10, 5));
        figuras.add(new Quadrado(3));
        figuras.add(new Circulo(7));

        // sem precisar de if/switch
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("----------------------------------");
        }
    }
}
