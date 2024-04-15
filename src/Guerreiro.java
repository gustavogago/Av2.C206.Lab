public class Guerreiro extends Personagem implements LutarComArmas {

    private Arma arma;

    public Guerreiro(String nome, int vida, int energia, int poder, Arma arma) {
        super(nome, vida, energia, poder);
        this.arma = arma;
    }



    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    void usarHabilidade() {
        super.usarHabilidade();
        System.out.println("O Guerreiro esta motivado para a batalha");
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Guerreiro atacou " + personagem.getNome());
        personagem.setVida(personagem.getVida() - this.arma.getDano());
        System.out.println(personagem.getNome() + " esta com " + personagem.getVida() + " de vida");
    }
}
