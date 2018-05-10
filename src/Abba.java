public class Abba {
    private int[] arvore;
    private int contador;

    public Abba (int numeroNiveis){
            this.arvore = new int[(int) Math.pow(2, numeroNiveis) - 1];
            for (int loop = 0; loop < this.arvore.length; loop++) {
                this.arvore[loop] = -2;
            }
    }

    public void adicionar(int novoElemento){
        if(novoElemento > 0) {
            this.adicionar(novoElemento, 0);
        }else {
            throw new AdicionarException();
        }
    }

    private void adicionar(int novoElemento, int raiz){
        if(raiz < this.arvore.length) {
            if (this.arvore[raiz] == -2) {
                this.arvore[raiz] = novoElemento;
                this.contador++;
            } else {
                if (novoElemento < this.arvore[raiz]) {
                    this.adicionar(novoElemento, raiz + 1);
                } else {
                    this.adicionar(novoElemento, raiz + 2);
                }
            }
        }else{
            throw new SuperarCapacidadeArvoreException();
        }
    }

    public void remover(){
//        Basicamente aqui eu tenho que verificar a raiz
//        se for igual - removo a raiz, insiro o a folha menor
//        no lugar da raiz removida, desço pra folha menor recursivamente
//        faço a operação anterior até não existir mais folhas
//        TODO:DESENHAR ISSO
    }

    public void buscar(){}

    public void listar(){
        System.out.println("Árvore:");
        for (int loop = 0; loop < this.arvore.length; loop++){
            System.out.print(this.arvore[loop]);
        }
        System.out.println();
    }

    public void numeroElementos(){
        System.out.println("Há "+ this.contador + " elementos nessa árvore");
    }

}
