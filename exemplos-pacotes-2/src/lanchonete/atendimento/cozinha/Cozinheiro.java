package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburger no balcão");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adcionando suco no balcão");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo hamburger");
    }

    private void prepararSuco(){
        System.out.println("Preparando suco");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionado o pão, salda, ovo e carne.");
    }

    private void selecionarIngredientesSuco(){
        System.out.println("Selecionado a frtua e água.");
    }

    private void lavarIngredientes(){
        System.out.println("Lavandos os ingredientes");
    }

    private void baterSucoNoLiquidificador(){
        System.out.println("Batendo o suco no liquidificador.");
    }

    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e o ovo para o Hamburger");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
