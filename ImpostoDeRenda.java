public class ImpostoDeRenda {

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularImposto() {
        if (salario <= 2500) {
            return 0;
        } else if (salario <= 5000) {
            return salario * 0.1;
        } else {
            return salario * 0.2;
        }
    }

    public static void main(String[] args) {
        ImpostoDeRenda ir = new ImpostoDeRenda();
        ir.setSalario(6000);
        System.out.println("Imposto devido: R$ " + ir.calcularImposto());
    }
}
