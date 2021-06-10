import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int alt = 0, edad = 0, altF = 0, altM = 0, edadT = 0, mas = 0, fem = 0, prom = 0;
        String gen;
        do{
            System.out.println("La altura: ");
            alt = scanner.nextInt();
            if(alt > 0){
                System.out.println("La edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Su genero, F: femenino y M: masculino: ");
                gen = scanner.nextLine();

                if(gen.equals("M")){
                    mas ++;
                    altM += alt;
                }
                else{
                    fem ++;
                    altF += alt;
                }
                edadT += edad;
                prom ++;
            }
        }while(alt > 0);
        System.out.println("Promedio de altura de mujeres: " +(altF / fem));
        System.out.println("Promedio de altura de hombre: " +(altM / mas));
        System.out.println("Promedio de altura de los participantes: " +(edadT / prom));
    }
}