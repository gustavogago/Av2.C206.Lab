public class Mago extends Personagem {


    public Mago(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    @Override
    void usarHabilidade() {
        super.usarHabilidade();
        System.out.println("Cura total utilizada, o mago agora esta com 70 de vida");
        this.setVida(70);
    }
}
