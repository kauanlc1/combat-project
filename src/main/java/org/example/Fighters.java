package org.example;

public class Fighters {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void Fighters(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);

        System.out.println("Teste");
    }


    public Fighters(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentarLutador() {
        System.out.println("Apresentamos... " + this.getNome() + ", ");
        System.out.print("diretamente de/a " + this.getNacionalidade());
        System.out.print(", com seus " + this.getIdade() + " anos ");
        System.out.print("e pesando " + this.getPeso() + " Kg.");
        System.out.print(" Consta com " + this.getVitorias() + " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.print(this.getEmpates() + " empates.");
    }

    public void status() {
        System.out.println("O lutador " + this.getNome() + " da categoria " + this.getCategoria() + " conta com os seguintes números: ");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;

        this.setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float pesoLutador) {
        if (pesoLutador <= 52.2) {
            this.categoria = "Inválido";
        } else if (pesoLutador <= 70.3) {
            this.categoria = "Leve";
        } else if (pesoLutador <= 83.9) {
            this.categoria = "Médio";
        } else if (pesoLutador <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
