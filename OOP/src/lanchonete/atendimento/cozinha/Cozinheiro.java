package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

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

    private void prepararLanche() {
        System.out.println("PREPARANDO HAMBURGUER");
    }

    private void prepararSuco() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    private void selecionarIngredienteLanche() {
        System.out.println("SELECIONANDO PAO, SALADA E CARNE");
    }

    private void selecionarIngredienteSuco() {
        System.out.println("SELECIONANDO FRUTA");
    }

    private void pedirTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
