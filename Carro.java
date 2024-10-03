class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void abrirPortas() {
        System.out.println("Abrindo " + numeroDePortas + " portas do carro.");
    }
}
