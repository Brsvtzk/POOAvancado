public class Aluno {
    static int id;
    static String nome, sobrenome;
    static int telefone;

    public Aluno(String nome, String sobrenome, int telefone, int id) {
        super();
        Aluno.nome = nome;
        Aluno.telefone = telefone;
        Aluno.sobrenome = sobrenome;
        Aluno.id = id;
    }

    static void setId(int id) {
        Aluno.id = id;
    }

    public int getId() {
        return Aluno.id;
    }

    static void setNome(String nome) {
        Aluno.nome = nome;
    }

    public String getNome() {
        return Aluno.nome;
    }

    static void setTelefone(int telefone) {
        Aluno.telefone = telefone;
    }

    public int getTelefone() {
        return Aluno.telefone;
    }

}