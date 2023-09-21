package J.Martins;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarrosAPP {
    public ListaDeCarrosAPP() {
    }

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro toyota = new Toyota("Toyota", "Elétrico", "Motor", "Branca", "Automático");
        carros.add(toyota);

        Carro honda = new Honda("Honda", "Elétrico", "Motor", "Prata", "Manual");
        carros.add(honda);

        listaCarros(carros);
    }

    private static void listaCarros(List<Carro> carros) {
        for (Carro carro : carros) {
            System.out.println(carro.imprimirInfo());
        }
    }
}