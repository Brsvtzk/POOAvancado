public class Turma {
    static final int turmaTotal = 20;
    public static Aluno[] a = new Aluno[20];
    static int index = 0;

    static void armazenaAluno(String nome, int telefone) {
        a[++index] = new Aluno(nome, telefone);
        Aluno.id++;
    }

}
