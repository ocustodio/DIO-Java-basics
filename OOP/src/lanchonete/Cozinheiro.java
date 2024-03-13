package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarCombo() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO HAMBURGUER");
    }

    public void prepararSuco() {
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    public void selecionarIngredienteLanche() {
        System.out.println("SELECIONANDO PAO, SALADA E CARNE");
    }

    public void selecionarIngredienteSuco() {
        System.out.println("SELECIONANDO FRUTA");
    }

    public void pedirTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
