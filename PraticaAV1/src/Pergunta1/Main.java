package Pergunta1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nomeProjeto;
        String descricao;
        String endereco;
        String dataInicio;
        String dataFim;
        String descAlimento;
        float qtde;
        String tipoTrabalho;
        int duracaoTrabalho;
        int opcao;


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Projeto Distribuir Alimentos \n<2> Cadastrar Projeto Trabalho Voluntário \n<3> Sair"));

            switch (opcao) {
                case 1: {
                    nomeProjeto = JOptionPane.showInputDialog("Nome do Projeto:");
                    descricao = JOptionPane.showInputDialog("Descrição: ");
                    endereco = JOptionPane.showInputDialog("Endereço: ");
                    dataInicio = JOptionPane.showInputDialog("Data de Início: ");
                    dataFim = JOptionPane.showInputDialog("Data do Fim: ");
                    descAlimento = JOptionPane.showInputDialog("Descrição do Alimento: ");
                    qtde = Float.parseFloat(JOptionPane.showInputDialog("Quantidade: "));

                    DistribuicaoAlimento distribuicaoAlimento1 = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);

                    JOptionPane.showMessageDialog(null, distribuicaoAlimento1.validaProjeto() + distribuicaoAlimento1.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 2: {
                    nomeProjeto = JOptionPane.showInputDialog("Nome do Projeto:");
                    descricao = JOptionPane.showInputDialog("Descrição: ");
                    endereco = JOptionPane.showInputDialog("Endereço: ");
                    dataInicio = JOptionPane.showInputDialog("Data de Início: ");
                    dataFim = JOptionPane.showInputDialog("Data do Fim: ");
                    tipoTrabalho = JOptionPane.showInputDialog("Tipo do Trabalho: ");
                    duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Duração do Trabalho: "));

                    TrabalhoVoluntario trabalhoVoluntario1 = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);

                    JOptionPane.showMessageDialog(null, trabalhoVoluntario1.validaProjeto() + trabalhoVoluntario1.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
        }
        while (opcao != 3);
    }
}