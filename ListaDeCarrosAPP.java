package J.Martins;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarrosAPP {
    public ListaDeCarrosAPP() {
    }

    public static void main(String[] args) {
        List<Toyota> carro = new ArrayList();
        Toyota toy = new Toyota();
        toy.setMarca("Marca");
        toy.setMotor("Motor");
        toy.setEletrico("Elétrico");
        toy.setCor("Branca");
        toy.setAutomático("Automático");
        carro.add(toy);
        listaCarro1(carro);
        List<Honda> carroManual = new ArrayList();
        Honda hon = new Honda();
        hon.setMarca("Marca");
        hon.setMotor("Motor");
        hon.setEletrico("Elétrico");
        hon.setCor("prata");
        hon.setManual("Manual");
        carroManual.add(hon);
        listaCarro2(carroManual);
    }

    private static void listaCarro1(List<? extends Toyota> carro) {
        for (Toyota carroT : carro) {
            System.out.println(carroT.imprimirListaT());
            Toyota.imprimirToyota();
        }
        System.out.println();
    }

    private static void listaCarro2(List<Honda> carroTracao) {
        for (Honda carroH : carroTracao) {
            System.out.println(carroH.imprimirListaH());
            Honda.imprimirHonda();
        }
    }

}
