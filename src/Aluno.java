public class Aluno {
    static int id;
    static String nome;
    static int telefone;

    public Aluno(String nome, int telefone) {
        super();
        Aluno.nome = nome;
        Aluno.telefone = telefone;
    }

    public void setId(int id) {
        Aluno.id = id;
    }

    public int getId() {
        return Aluno.id;
    }

    public void setNome(String nome) {
        Aluno.nome = nome;
    }

    public String getNome() {
        return Aluno.nome;
    }

    public void setTelefone(int telefone) {
        Aluno.telefone = telefone;
    }

    public int getTelefone() {
        return Aluno.telefone;
    }

}