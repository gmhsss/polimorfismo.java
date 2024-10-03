public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo moto = new Moto("Honda", "CBR", 2019, true);
        Veiculo caminhao = new Caminhao("Mercedes", "Actros", 2021, 15000);

        // Chamar o método específico dos filhos usando instanceof e type casting
        if (carro instanceof Carro) {
            ((Carro) carro).abrirPortas();
        }
        if (moto instanceof Moto) {
            ((Moto) moto).realizarManobras();
        }
        if (caminhao instanceof Caminhao) {
            ((Caminhao) caminhao).carregar();
        }

        // Chamada polimórfica do método sobrescrito
        ligarVeiculo(carro);
        ligarVeiculo(moto);
        ligarVeiculo(caminhao);
    }

    // Método que recebe referência polimórfica
    public static void ligarVeiculo(Veiculo veiculo) {
        veiculo.ligar();
    }
}
