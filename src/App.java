import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int opcao = 0;
        int opcao2 = 0;
        Scanner inputUsuario = new Scanner(System.in);

        do {
            System.out.println("\n                   =========================");
            System.out.println("                  | 1 - Matricular Aluno    |");
            System.out.println("                  | 2 - Consultar Matricula |");
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
                            System.out.println("Nome do Aluno:");
                            String entradaNome = inputUsuario.next();
                            String nome = entradaNome;
                            // Aluno.nome = entradaNome;
                            System.out.println("Telefone de Contato:");
                            int entradaTel = inputUsuario.nextInt();
                            int telefone = entradaTel;
                            // Aluno.telefone = entradaTel;
                            Turma.armazenaAluno(nome, telefone);
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
                                for (int i = 0; i <= Aluno.id; i++) {
                                    System.out.println("ID:" + Aluno.id + "\nNome do Aluno:" + Aluno.nome);
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
                                        System.out.println("ID:" + Aluno.id + "\nNome do Aluno:" + Aluno.nome
                                                + "\nTelefone de Contato:" + Aluno.telefone);
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
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (opcao != 0);

        inputUsuario.close();
    }

}
