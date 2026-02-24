import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        boolean seguir = true;
        do {
            System.out.println("1=numeros del 1 al 10, 2=pares del 1 al 20, 3=salir");
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 20; i++) {
                        if (i%2 == 0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 3:
                    seguir = false;
                    break;
            }
        }while(seguir);
    }
}