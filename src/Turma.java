public class Turma {
    static final int turmaTotal = 20;
    public static Aluno[] a = new Aluno[20];
    static int index = 0;

    static void armazenaAluno(String nome, String sobrenome, int telefone, int id) {
        a[++index] = new Aluno(nome, sobrenome, telefone, id);
    }
}
