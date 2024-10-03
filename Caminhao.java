class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void ligar() {
        System.out.println("Caminhão ligado.");
    }

    public void carregar() {
        System.out.println("Carregando " + capacidadeCarga + " kg.");
    }
}
