import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int id = 0;
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
                        if (Aluno.id <= Turma.turmaTotal) {
                            System.out.println("Nome:");
                            String entradaNome = inputUsuario.next();
                            String nome = entradaNome;
                            System.out.println("Sobrenome:");
                            String entradaSobrenome = inputUsuario.next();
                            String sobrenome = entradaSobrenome;
                            // Aluno.nome = entradaNome;
                            System.out.println("Telefone de Contato:");
                            int entradaTel = inputUsuario.nextInt();
                            int telefone = entradaTel;
                            // Aluno.telefone = entradaTel;
                            Turma.armazenaAluno(nome, sobrenome, telefone, id);
                        } else {
                            throw new ExceptionTurmaCheia(Aluno.id);
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
                        } else {
                            opcao2 = 4;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    switch (opcao2) {
                        case 3:
                            try {
                                for (int i = 1; i <= Turma.a.length; i++) {
                                    System.out.println("Nº de Matrícula: " + Aluno.id + "\nNome do Aluno: " + Aluno.nome
                                            + " " + Aluno.sobrenome + "\nTelefone: " + Aluno.telefone);
                                    // String resultado = Turma.a[i].toString();
                                    // System.out.println(resultado);
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;

                        case 4:
                            try {
                                System.out.println("Digite o Nome --------->");
                                String nome = inputUsuario.next();
                                String alunoNome = nome;
                                for (int i = 0; i <= Turma.index; i++) {
                                    if (alunoNome == Aluno.nome) {
                                        System.out.println("ID:" + Aluno.id + "\nNome do Aluno:" + Aluno.nome + " "
                                                + Aluno.sobrenome + "\nTelefone de Contato:" + Aluno.telefone);
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
