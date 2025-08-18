package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Warrios", 9.5);
        Filme filmeB = new Filme("O Fugitivo", 8.1);

        Ator atorA = new Ator("Mark Hamill");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>(Filme.class);
        dao.incluirAtomico(filmeA);


    }
}
