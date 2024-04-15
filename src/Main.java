public class Main {
    public static void main(String[] args) {


        Arma armaAssasino = new Arma("Adaga",45);
        Arma armaGuerreiro = new Arma("Espada", 24);

        Assasino assasino = new Assasino("Carpini",100,100,100,armaAssasino);
        Guerreiro guerreiro = new Guerreiro("Calleri",150,100,100,armaGuerreiro);
        Mago mago =new Mago("Prior",70,1000,100);

        Personagem [] personagens = new Personagem[3];

        personagens[0]= assasino;
        personagens[1]= guerreiro;
        personagens[2]= mago;

        System.out.println("Assasino: ");
        System.out.println("Nome: " + personagens[0].getNome());
        System.out.println("Vida: " +personagens[0].getVida());
        System.out.println("energia: " + personagens[0].getEnergia());
        System.out.println("poder: " + personagens[0].getPoder());
        System.out.println("Nome da arma: " + assasino.getArma().getNome());
        System.out.println("Dano da arma: "+ assasino.getArma().getDano());

        assasino.usarHabilidade();
        assasino.atacar(mago);

        System.out.println("Guerreiro: ");
        System.out.println("Nome: " + personagens[1].getNome());
        System.out.println("Vida: " +personagens[1].getVida());
        System.out.println("energia: " + personagens[1].getEnergia());
        System.out.println("poder: " + personagens[1].getPoder());
        System.out.println("Nome da arma: " + guerreiro.getArma().getNome());
        System.out.println("Dano da arma: "+ guerreiro.getArma().getDano());

        guerreiro.usarHabilidade();
        guerreiro.atacar(mago);

        System.out.println("Mago: ");
        System.out.println("Vida: " +personagens[2].getVida());
        System.out.println("Nome: " + personagens[2].getNome());
        System.out.println("energia: " + personagens[2].getEnergia());
        System.out.println("poder: " + personagens[2].getPoder());

        mago.usarHabilidade();



    }
}