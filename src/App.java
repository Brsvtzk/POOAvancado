import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nome = null;
        String sobrenome = null;
        int telefone = 0;
        Turma t = new Turma();
        int count = 1;
        int id = Aluno.getId();
        int opcao = 0;
        int opcao2 = 0;
        Scanner inputUsuario = new Scanner(System.in);

        do {
            System.out.println("\n                   =========================");
            System.out.println("                  | 1 - Matricular Aluno    |");
            System.out.println("                  | 2 - Consultar Matrícula |");
            System.out.println("                   =========================\n");
            System.out.print("\n");

            try {
                System.out.println("Opção --------->");
                int entradaUsuario = inputUsuario.nextInt();
                opcao = entradaUsuario;
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (opcao) {
                case 1:
                    try {
                        if (Aluno.getId() <= t.getTurmaTotal()) {
                            System.out.println("Nome:");
                            String entradaNome = inputUsuario.next();
                            System.out.println("Sobrenome:");
                            String entradaSobrenome = inputUsuario.next();
                            // Aluno.nome = entradaNome;
                            System.out.println("Telefone de Contato:");
                            int entradaTel = inputUsuario.nextInt();
                            sobrenome = entradaSobrenome;
                            nome = entradaNome;
                            telefone = entradaTel;
                            count = id++;
                            Aluno a = new Aluno(nome, sobrenome, telefone, id);
                            a.setNome(nome);
                            a.setSobrenome(sobrenome);
                            a.setTelefone(telefone);
                            a.setId(id);
                            // Aluno.telefone = entradaTel;

                            // t.armazenaAluno(nome, sobrenome, telefone, id);
                        } else {
                            throw new ExceptionTurmaCheia(id);
                        }
                    } catch (Exception tel) {
                        tel.printStackTrace();
                    }

                    break;

                case 2:
                    System.out.println("\n                   =========================");
                    System.out.println("                  | 1 - Listar Cadastros    |");
                    System.out.println("                  | 2 - Busca por Nome      |");
                    System.out.println("                   =========================\n");
                    System.out.print("\n");

                    try {
                        System.out.println("Opção --------->");
                        int entradaUsuario2 = inputUsuario.nextInt();
                        opcao2 = entradaUsuario2;
                        if (opcao2 == 1) {
                            opcao2 = 3;
                        } else if (opcao2 == 2) {
                            opcao2 = 4;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    switch (opcao2) {
                        case 3:
                            try {
                                for (int i = 1; i <= t.getA().length; i++) {
                                    System.out.println("Nº de Matrícula: " + Aluno.getId() + "\nNome do Aluno: "
                                            + Aluno.getNome() + " " + Aluno.getSobrenome() + "\nTelefone: "
                                            + Aluno.getTelefone());
                                    // String resultado = Turma.a[i].toString();
                                    System.out.println(t.getA().length);
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;

                        case 4:
                            try {
                                System.out.println("Digite o Nome --------->");
                                nome = inputUsuario.next();
                                String alunoNome = nome;
                                for (int i = 0; i <= t.getIndex(); i++) {
                                    if (alunoNome == Aluno.getNome()) {
                                        System.out.println("ID:" + Aluno.getId() + "\nNome do Aluno:" + Aluno.getNome()
                                                + " " + Aluno.getSobrenome() + "\nTelefone de Contato:"
                                                + Aluno.getTelefone());
                                    } else {
                                        throw new ExceptionAlunoNaoEncontrado(alunoNome);
                                    }
                                }
                            } catch (ExceptionAlunoNaoEncontrado e) {
                                System.out.println("Aluno não encontrado");
                            }
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        inputUsuario.close();
    }

}
