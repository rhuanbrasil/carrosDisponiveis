package projeto.comandosiniciais;

import java.util.Scanner;
import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Carros> carrosPredefinidos;
    private int totalCarrosAte2000;
    private int totalGeral;
    
    public Concessionaria(){
        carrosPredefinidos = new ArrayList<>();
        carrosPredefinidos.add(new Carros("Fusca", 1975, 15000));
        carrosPredefinidos.add(new Carros("Gol G3", 2005, 25000));
        carrosPredefinidos.add(new Carros("Civic", 1998, 20000));
        carrosPredefinidos.add(new Carros("HB20", 2015, 40000));
        carrosPredefinidos.add(new Carros("OPALA", 1980, 30000));
        
        totalCarrosAte2000 = 0;
        totalGeral = 0;  
    }
    private void ListarCarros(){
        System.out.println("Modelos disponíveis para venda:");
        for (int i = 0; i < carrosPredefinidos.size(); i++){
            System.out.println((i + 1) + ". " + carrosPredefinidos.get(i));
        }
    }    
    private void CalcularDesconto(Carros Carros){   
        double desconto;
        if (Carros.getAno() <= 2000){
          desconto = Carros.getValor() * 0.12;
          totalCarrosAte2000++;
        } else {
          desconto = Carros.getValor() * 0.07;
        }
        double valorTotal = Carros.getValor() - desconto;         
        totalGeral++;
        
        System.out.println("Modelo do carro: " + Carros.getModelo());
        System.out.println("Preço do carro: " + Carros.getValor());
        System.out.printf("Valor de desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor Total: R$ %.2f\n", valorTotal);
        System.out.println("Total de carros 2000: " + totalCarrosAte2000);
        System.out.println("Total de carros: " + totalGeral);
        
        
    }
    //Executar vai fazer o loop para repetir o código até resp ser "nao"
    public void Executar(){
        Scanner scanner = new Scanner(System.in);
        String resposta = "sim";
        
        while (resposta.equals("sim") || (resposta.equals("s"))){
            ListarCarros();
            System.out.print("Escolha um número dos carros acima: ");
            int escolha = scanner.nextInt();
            if ((escolha < 1) || (escolha > carrosPredefinidos.size())){
                System.out.print("Favor, informe um valor válido");
                scanner.nextLine();
                continue;
            } 
            Carros carroEscolhido = carrosPredefinidos.get(escolha - 1);
            
            CalcularDesconto(carroEscolhido);
            
            
            
            
            
            
            
            
            scanner.nextLine();
            System.out.print("Deseja continuar (Sim ou Nao)? ");
            resposta = scanner.nextLine().strip().toLowerCase();
            
            
        }
    }
    
    
}
