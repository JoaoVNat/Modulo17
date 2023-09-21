package J.Martins;

public abstract class Carro {
    private String marca;
    private String eletrico;
    private String motor;
    private String cor;
    private String automático;
    private String manual;

    public Carro(String marca, String eletrico, String motor,String cor, String automático, String manual) {
        this.marca = marca;
        this.eletrico = eletrico;
        this.motor = motor;
        this.cor = cor;
        this.automático = automático;
        this.manual = manual;

    }


}

