class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor com parâmetros
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor sem parâmetros
    public Veiculo() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    // Método qualquer
    public void info() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // Método a ser sobrescrito
    public void ligar() {
        System.out.println("Veículo ligado.");
    }
}
