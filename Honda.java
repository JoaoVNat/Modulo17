package J.Martins;

public class Honda extends Carro {
    private String marca;
    private String motor;
    private String cor;
    private String manual;
    private String eletrico;

    public Honda() {
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getManual() {
        return this.manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getEletrico() {
        return this.eletrico;
    }

    public void setEletrico(String eletrico) {
        this.eletrico = eletrico;
    }

    public String imprimirListaH() {
        return this.marca + " Honda | " + this.motor + ": " + this.manual + " | Versão: " + this.eletrico + " | de Cor: " + this.cor;
    }

    public static void imprimirHonda() {
        System.out.println("Marca: Honda Motor: Manual versão: eletrico de cor Prata está pronto para retirar!");
    }
}
