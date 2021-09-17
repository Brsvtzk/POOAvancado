public class Aluno {
    private static int matricula = 1;
    private static int id = 1;
    private static String nome, sobrenome;
    private static int telefone;

    public Aluno(String nome, String sobrenome, int telefone, int id) {
        super();
        Aluno.nome = nome;
        this.setSobrenome(sobrenome);
        Aluno.telefone = telefone;
        Aluno.setMatricula(id++);
    }

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        Aluno.matricula = matricula;
    }

    public static String getSobrenome() {
        return Aluno.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Aluno.sobrenome = sobrenome;
    }

    public void setId(int id) {
        Aluno.id = id;
    }

    public static int getId() {
        return Aluno.id;
    }

    public void setNome(String nome) {
        Aluno.nome = nome;
    }

    public static String getNome() {
        return Aluno.nome;
    }

    public void setTelefone(int telefone) {
        Aluno.telefone = telefone;
    }

    public static int getTelefone() {
        return Aluno.telefone;
    }

}