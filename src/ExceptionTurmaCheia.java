public class ExceptionTurmaCheia extends Exception {
    int id = Aluno.getId();
    int alunoId = Aluno.getId();

    public ExceptionTurmaCheia(int alunoId) {
        super();
        this.alunoId = alunoId;
    }

    @Override
    public String toString() {
        return "Turma cheia";
    }
}
