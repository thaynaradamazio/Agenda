package programa;

import classes.Piloto;
import classes.Pessoa;
import classes.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {
        Piloto pil = new Piloto();
        Pessoa pes = new Pessoa();
        Passageiro pas = new Passageiro();

        pil.setNome("Thaynara");
        pil.setCarteiraDePiloto("12345");

        System.out.printf("Carteira do piloto %s: %s", pil.getNome(), pil.getCarteiraDePiloto());
    
        pes.setNome("QualquerNome");
        pes.setCpf("123-456-789");

        System.out.printf("Nome da pessoa %s: %s", pes.getNome(), pes.getCpf());

        pas.setNome("NomePassageiro");
        pas.setPassagem("abcd");

        System.out.printf("Passageiro %s: %s", pas.getNome(), pas.getPassagem());

    }
}