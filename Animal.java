abstract class Animal {

    public abstract void emitirSom();

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}

class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
        cachorro.dormir();
        gato.dormir();
    }
}
