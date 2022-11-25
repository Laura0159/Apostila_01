public class TesteCarros {
    static public void main (String[] args){
        Carros  carro1 = new Carros();
        carro1.setRetrovisor("Está movimentando");
        carro1.regular();
        Carros  carro2 = new Carros();
        carro2.setRodas("Está deslizando");
        carro2.acelerar();
    }
        
}
