
package projeto.comandosiniciais;

public class Carros {
    private String modelo;
    private int ano;
    private double valor;
    
    
    
    
    public Carros(String modelo, int ano, double valor){
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    };
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public double getValor(){
        return valor;
    }
    @Override
    public String toString() {
        return modelo + " (" + ano + ") - R$ " + String.format("%.2f", valor);
    }
    
    
    
}
