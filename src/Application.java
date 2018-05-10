public class Application {

    public static void main(String[] args){
        Abba teste = new Abba(3);
        teste.adicionar(5);
        teste.adicionar(20);
        teste.adicionar(1);
        teste.adicionar(13);
        teste.adicionar(130);
        teste.adicionar(11);
//        teste.adicionar(16);

        teste.listar();
        teste.numeroElementos();
    }
}
