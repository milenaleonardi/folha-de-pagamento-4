package br.edu.up.front;
import br.edu.up.entidades.Folha;
import br.edu.up.negocio.FolhaNegocio;
import br.edu.up.persistencia.FolhaPersistencia;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Folha folha = null;
        double salarioBruto = 0, ir = 0, inss = 0;

        do {
            System.out.println("\n\n1- Cadastro da folha ");
            System.out.println("2- Consultar folha");
            System.out.println("3- Listar folha");
            System.out.println("4- Sair");
            opcao = Console.readInt("Informe a opção: ");
            switch (opcao) {
                case 1:
                    folha = new Folha();
                    folha.setNome(Console.readString("Nome do funcionário: "));
                    folha.setMes(Console.readInt("Mês: "));
                    folha.setAno(Console.readInt("Ano: "));
                    if (FolhaPersistencia.buscarFolha(folha) == null) {
                        folha.setHorasTrabalhadas(Console.readInt("Horas trabalhadas: : "));
                        folha.setValorHora(Console.readFloat("Valor da hora: "));
                        FolhaPersistencia.incluirFolha(folha);
                    } else {
                        System.out.println("Funcionário já registrado. ");
                    }
                    break;
                case 2:
                    folha = new Folha();
                    folha.setNome(Console.readString("Nome do funcionário: "));
                    folha.setMes(Console.readInt("Mês: "));
                    folha.setAno(Console.readInt("Ano: "));
                    folha = FolhaPersistencia.buscarFolha(folha);
                    if (folha != null) {
                        System.out.println("Funcionário: " + folha.getNome());
                        System.out.println("Mês: " + folha.getMes());
                        System.out.println("Ano: " + folha.getAno());
                        System.out.println("Horas trabalhadas: " + folha.getHorasTrabalhadas());
                        System.out.println("Valor da hora: " + folha.getValorHora());
                        salarioBruto = FolhaNegocio.calcularSalarioBruto(folha);
                        System.out.println("Salário Bruto: " + salarioBruto);
                        ir = FolhaNegocio.calcularIR(folha, salarioBruto);
                        System.out.println("IR: " + ir);
                        inss = FolhaNegocio.calcularINSS(folha, salarioBruto);
                        System.out.println("INSS: " + inss);
                        System.out.println("FGTS: " + FolhaNegocio.calcularFGTS(folha, salarioBruto));
                        System.out.println("Salário Líquido: " + FolhaNegocio.calcularSalarioLiquido(folha, salarioBruto, ir, inss));

                    } else {
                        System.out.println("Funcionário não encontrado. ");
                    }
                    break;
                case 3:
                    folha = new Folha();
                    folha.setMes(Console.readInt("Mês: "));
                    folha.setAno(Console.readInt("Ano: "));
                    if (FolhaPersistencia.listarFolha(folha) != null) {
                        System.out.println("Funcionario: " + folha.getNome());
                        System.out.println("Salario liquido: " + FolhaNegocio.calcularSalarioLiquido(folha, salarioBruto, ir, inss));
                    } else {
                        System.out.println("");
                    }
                    break;
            }
        } while (opcao != 4) ;
    }
}