class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    public void realizarManobras() {
        System.out.println("Realizando manobras com a moto.");
    }
}
