package J.Martins;

public class Toyota extends Carro {
    private String marca;
    private String eletrico;
    private String motor;
    private String cor;
    private String automático;

    public Toyota() {
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

    public String getEletrico() {
        return this.eletrico;
    }

    public void setEletrico(String eletrico) {
        this.eletrico = eletrico;
    }

    public String getAutomático() {
        return this.automático;
    }

    public void setAutomático(String automático) {
        this.automático = automático;
    }

    public String imprimirListaT() {
        return this.marca + " Toyota | " + this.motor + ": " + this.automático + " | Versão: " + this.eletrico + " | de Cor: " + this.cor;
    }

    public static void imprimirToyota() {
        System.out.println("Marca: Toyota Motor: Elétrico versão: Automático de cor Branca está pronto para retirar!");
    }
}

