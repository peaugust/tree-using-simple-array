public class AdicionarException extends IllegalArgumentException {
    public AdicionarException (){
        super("Não é possível adicionar números negativos, tente novamente!");
    }
}
