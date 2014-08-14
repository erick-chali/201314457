import java.util.Scanner;
public class Programa_3 {
    public static void main(String args[]){
        System.out.println("*****Programa 3*****");
        System.out.println("201314457 - Erick Gustavo Chali Ulin\n");
        pedirNum();
    }

    private static void pedirNum() {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero");
        try{
            n=s.nextInt();
            while((n%2)==0){
                System.out.println("Siga intentando con otro numero.\n");
                pedirNum();
            }
            if((n%2)!=0){
                System.out.println("Felicidades el numero " + n + " es impar.");
                System.exit(1);
            }
        }catch(Exception e){
            System.out.println("Debe ingresar un numero.\n");
            pedirNum();
        }

    }
}
