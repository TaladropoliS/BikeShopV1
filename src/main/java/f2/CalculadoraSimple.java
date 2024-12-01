package f2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculadoraSimple implements ICalculadoraStockSeguridad {

    @Override
    public List<Integer> calcular() {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for(int i=0; i < 5; i++) {
            randomNumbers.add(random.nextInt(50));
        }
        System.out.println("Stocks aleatorios");
        randomNumbers.forEach(System.out::println);

        System.out.println("Stocks de Seguridad con Algoritmo Simple");
        for(int stock:randomNumbers){
            if(stock <= 2){
                System.out.println("2");
            }else{
                System.out.println("2");
            }
        }
        return randomNumbers;
    }
}
