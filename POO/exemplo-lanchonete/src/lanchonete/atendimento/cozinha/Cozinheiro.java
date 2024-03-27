package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburger no balcao");
    }
    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    // pode ser default
    public  void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche tipo hamburger");
    }
    private void prepararVitamina(){
        System.out.println("Preparando suco");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavar ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hamburger");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngrediente(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
