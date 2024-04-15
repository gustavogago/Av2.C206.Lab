public class Assasino extends Personagem implements LutarComArmas {

    private Arma arma;

    public Assasino(String nome, int vida, int energia, int poder, Arma arma) {
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
        System.out.println("Assasinio se escondeu nas sombras.");
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Assasino atacou " + personagem.getNome());
        personagem.setVida(personagem.getVida() - this.arma.getDano());
        System.out.println(personagem.getNome() + " esta com " + personagem.getVida() + " de vida");
    }
}
