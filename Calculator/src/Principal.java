import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;
        
        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("Dividir");
            //Primer cambio yeber
            System.out.println("3. Salir");

            //cambios desde tarensota
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion >= 1 && opcion <= 2) {
                try {
                    System.out.print("Ingrese primer número: ");
                    num1 = Double.parseDouble(sc.nextLine());

                    System.out.print("Ingrese segundo número: ");
                    num2 = Double.parseDouble(sc.nextLine());

                    switch (opcion) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println("Resultado: " + resultado);
                            break;

                        case 2:
                            resultado = num1 - num2;
                            System.out.println("Resultado: " + resultado);
                            break;

                    }

                } catch (Exception e) {
                    System.out.println("Error: ingrese números válidos.");
                }
            }

            System.out.println();

        } while (opcion != 3);

        System.out.println("Programa finalizado.");
    }
    
}
