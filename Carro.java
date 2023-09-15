package J.Martins;

public abstract class Carro {
    private String marca;
    private String eletrico;
    private String motor;
    private String cor;
    private String automático;
    private String manual;

    public Carro() {
    }

    public String getEletrico() {
        return this.eletrico;
    }

    public void setEletrico() {
        this.eletrico = this.eletrico;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca() {
        this.marca = this.marca;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor() {
        this.motor = this.motor;
    }

    public String getAutomático() {
        return this.automático;
    }

    public void setAutomático(String automático) {
        this.automático = automático;
    }

    public String getManual() {
        return this.manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
