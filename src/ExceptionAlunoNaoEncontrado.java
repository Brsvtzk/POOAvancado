public class ExceptionAlunoNaoEncontrado extends Exception {
    int indexAluno = Aluno.id;
    String alunoNome = Aluno.nome;

    public ExceptionAlunoNaoEncontrado(String alunoNome) {
        super();
        this.alunoNome = alunoNome;
    }

    @Override
    public String toString() {
        return "Aluno não encontrado";
    }
}
