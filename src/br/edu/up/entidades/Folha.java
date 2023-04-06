package br.edu.up.entidades;

public class Folha {
    private String nome;
    private int mes;
    private int ano;
    private int horasTrabalhadas;
    private float valorHora;

    public Folha() {
    }

    public Folha(String nome, int mes, int ano, int horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.mes = mes;
        this.ano = ano;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Folha{" +
                "nome='" + nome + '\'' +
                ", mes=" + mes +
                ", ano=" + ano +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                '}';
    }
}
