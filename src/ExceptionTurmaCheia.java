public class ExceptionTurmaCheia extends Exception {
    static final int turmaTotal = 20;
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
