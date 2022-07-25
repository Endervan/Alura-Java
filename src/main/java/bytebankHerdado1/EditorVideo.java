package bytebankHerdado1;

public class EditorVideo extends Funcionario {
    @Override // se pai tiver metodo abstract os filho sao obrigados
//    a implementa esse metod
    public double getBonificacao() {
        return 200;
    }
}
