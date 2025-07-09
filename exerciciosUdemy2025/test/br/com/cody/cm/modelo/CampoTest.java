package br.com.cody.cm.modelo;

import br.com.cody.cm.excessao.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTest {
    Campo campo;

    @BeforeEach
        // Método executado antes de cada teste
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testVizinhoEsquerda() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado : "Vizinho encontrado.";
    }

    @Test
    void testNaoEVizinho() {
        Campo vizinho = new Campo(10, 10);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert !resultado : "Nçao e Vizinho.";
    }

    @Test
    void marcacaoPadrao() {
        assert !campo.isMarcado() : "Campo deveria estar marcado.";
    }

    @Test
    void alternarMarcacao() {
        campo.alternarMarcado();
        assert campo.isMarcado() : "Campo deveria estar marcado.";

        campo.alternarMarcado();
        assert !campo.isMarcado() : "Campo deveria estar desmarcado.";
    }

    @Test
    void alternaMarcacao2Vezes() {
        campo.alternarMarcado();
        campo.alternarMarcado();
        assert !campo.isMarcado() : "Campo deveria estar desmarcado.";
    }

    @Test
    void testAbrirCampoMinado() {
        campo.alternarMarcado();
        campo.minar();
        boolean resultado = campo.abrir();
        assert !resultado : "Campo minado e marcado deve retornar true ao abrir.";
    }

    @Test
    void testAbrirCampoNaoMinadoNaoMarcado() {
        boolean resultado = campo.abrir();
        assert resultado : "Campo não minado e não marcado deve ser aberto e retornar true.";
    }

    @Test
    void testAbrirCampoJaAberto() {
        campo.abrir();
        boolean resultado = campo.abrir();
        assert !resultado : "Campo já aberto deve retornar false ao tentar abrir novamente.";
    }

    @Test
    void testAbrirCampoMarcado() {
        campo.alternarMarcado();
        boolean resultado = campo.abrir();
        assert !resultado : "Campo marcado não deve ser aberto e deve retornar false.";
    }

    @Test
    void testAbrirCampoMarcadoMinado() {
        campo.alternarMarcado();
        campo.minar();
        boolean resultado = campo.abrir();
        assert !resultado : "Campo minado e marcado não deve ser aberto e deve retornar false.";
    }

    @Test
    void testAbrirMinadoNaoMrcado() {
        campo.minar();
        try {
            campo.abrir();
            assert false : "Campo minado e não marcado deve lançar uma exceção ao abrir.";
        } catch (ExplosaoException e) {
            assert e.getMessage().contains("Explosão! Campo minado.") : "Mensagem da exceção incorreta.";
        }
    }

    @Test
    void testAbrirComVizinhancaSegura() {
        Campo vizinho1 = new Campo(3, 4);
        Campo vizinho2 = new Campo(3, 5);
        campo.adicionarVizinho(vizinho1);
        campo.adicionarVizinho(vizinho2);
        vizinho1.adicionarVizinho(campo);
        vizinho2.adicionarVizinho(campo);
        vizinho1.adicionarVizinho(vizinho2);
        vizinho2.adicionarVizinho(vizinho1);
        // Nenhum vizinho minado
        campo.abrir();
        assert campoAberto(campo) : "Campo principal deve estar aberto.";
        assert campoAberto(vizinho1) : "Vizinho 1 deve ser aberto recursivamente.";
        assert campoAberto(vizinho2) : "Vizinho 2 deve ser aberto recursivamente.";
    }



    // Método auxiliar para acessar o campo privado 'aberto'
    private boolean campoAberto(Campo c) {
        try {
            java.lang.reflect.Field f = Campo.class.getDeclaredField("aberto");
            f.setAccessible(true);
            return f.getBoolean(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
