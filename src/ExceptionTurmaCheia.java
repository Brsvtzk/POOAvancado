public class ExceptionTurmaCheia extends Exception {
    int alunoId = Aluno.id;

    public ExceptionTurmaCheia(int alunoId) {
        super();
        this.alunoId = alunoId;
    }

    @Override
    public String toString() {
        return "Turma cheia";
    }
}
