public class SkelbimuTalpykla {

    AutoSkelbimas [] skelbimai;

    void dataLoad () {

        skelbimai = new AutoSkelbimas[5];

        AutoSkelbimas skelbimas = new AutoSkelbimas();

        skelbimas.setAutoData("2015-10");
        skelbimas.setAutoKaina(8000);
        skelbimas.setAutoMarke("Audi");
        skelbimas.setAutomobilioModelis("A6");
        skelbimas.setSkelbimoData("2018-12-01");
        skelbimas.setSkelbimoID("J726345-33");

    }



}
