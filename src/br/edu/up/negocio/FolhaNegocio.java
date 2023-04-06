package br.edu.up.negocio;
import br.edu.up.entidades.Folha;
public class FolhaNegocio {
    public static double calcularSalarioBruto(Folha folha){
        return folha.getHorasTrabalhadas()*folha.getValorHora();
    }
    public static double calcularIR(Folha folha, double salarioBruto){
        if(salarioBruto <= 1372.81) return 0;
        else if(salarioBruto <= 2743.25) {
            return (salarioBruto * .15) - 205.92;
        }
            return (salarioBruto * .275) - 548.82;
    }
    public static double calcularINSS(Folha folha, double salarioBruto){
        if(salarioBruto <= 868.29)
        {
            return salarioBruto * 0.08;
        }
        else if(salarioBruto <= 1447.14) {
            return salarioBruto * 0.09;
        }
        else if(salarioBruto <= 2894.28) {
            return salarioBruto * 0.11;
        }
        return 318.37;
    }
    public static double calcularFGTS(Folha folha, double salarioBruto){
        return salarioBruto * 0.08;
    }
    public static double calcularSalarioLiquido(Folha folha, double salarioBruto, double ir, double inss){
        return salarioBruto - ir - inss;
    }
}
