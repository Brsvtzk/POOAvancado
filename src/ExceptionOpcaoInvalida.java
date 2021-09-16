public class ExceptionOpcaoInvalida extends Exception {
    int opcaoInvalida;

    public ExceptionOpcaoInvalida(int opcaoInvalida) {
        super();
        this.opcaoInvalida = opcaoInvalida;
    }

    @Override
    public String toString() {
        return "Opção inválida, digite novamente";
    }
}
