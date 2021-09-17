public class ExceptionAlunoNaoEncontrado extends Exception {
    int indexAluno = Aluno.getId();
    String alunoNome = Aluno.getNome();

    public ExceptionAlunoNaoEncontrado(String alunoNome) {
        super();
        this.alunoNome = alunoNome;
    }

    @Override
    public String toString() {
        return "Aluno não encontrado";
    }
}
