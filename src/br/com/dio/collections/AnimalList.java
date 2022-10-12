package br.com.dio.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    public static void main(String[] args) {

        List<String> palavras =  new ArrayList<>();
        palavras.add("banana");
        palavras.add("maçã");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        Animal exotico = new Animal();

        exotico.setNome("Gerbil");
        exotico.setAmbiente("Deserto Mongolia");
        exotico.setSexo(true);
        exotico.alimentar(exotico.getNome());
        exotico.reproduzir(6);


        Animal urbano = new Animal();

        urbano.setNome("Rattus Rattus");
        urbano.setAmbiente("Campo");
        urbano.setSexo(false);
        urbano.alimentar(urbano.getNome());
        urbano.reproduzir(16);


        List<Animal> animais = new ArrayList<>();
        animais.add(exotico);
        animais.add(urbano);

        for (Animal animal : animais) {
            System.out.println(animal.getNome());
            LocalDate data = LocalDate.now();
            animal.setDataEntrada(data);
            System.out.println(animal);
        }
    }
}
