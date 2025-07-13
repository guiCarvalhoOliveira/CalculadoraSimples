import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo à calculadora!");
        System.out.print("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Selecione a operação desejada(+, -, *, /): ");
        String operacao = sc.nextLine();
        
        double resultado;
        
        switch (operacao) {
            case "+":
            resultado=numero1+numero2;
            System.out.print("Resultado: " + resultado);
            break;

            case "-":
            resultado=numero1-numero2;
            System.out.print("Resultado: " + resultado);
            break;

            case "*":
            resultado=numero1*numero2;
            System.out.print("Resultado: " + resultado);
            break;

                case "/":
                if(numero2!=0){
                resultado=(double) numero1/numero2;
                System.out.print("Resultado: " + resultado);
                }
                else{
                    System.out.print("Divisão por 0 = 0");
                }
                break;

            default:
            System.out.print("Operação inválida!");
                
        }




        
sc.close();
    }
}

