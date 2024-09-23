public class CalculadoraArea {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean isCircle) {
        if (isCircle) {
            return Math.PI * raio * raio;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        System.out.println("Área do quadrado: " + calc.calcularArea(4));
        System.out.println("Área do retângulo: " + calc.calcularArea(4, 6));
        System.out.println("Área do círculo: " + calc.calcularArea(3, true));
    }
}
