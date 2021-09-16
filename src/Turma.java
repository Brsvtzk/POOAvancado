public class Turma {
    static final int turmaTotal = 20;
    public static Aluno[] a = new Aluno[20];
    static int index;

    static void armazenaAluno(String nome, String sobrenome, int telefone) {
        a[++index] = new Aluno(nome, sobrenome, telefone);
    }

}
