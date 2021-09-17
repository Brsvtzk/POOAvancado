public class Turma {
    private final int turmaTotal = 20;
    private Aluno[] a = new Aluno[3];
    private int index = 0;

    public void armazenaAluno(String nome, String sobrenome, int telefone, int id) {
        a[++index] = new Aluno(nome, sobrenome, telefone, id);
    }

    public int getIndex() {
        return index;
    }

    public int getTurmaTotal() {
        return turmaTotal;
    }

    public Aluno[] getA() {
        return a;
    }

}
