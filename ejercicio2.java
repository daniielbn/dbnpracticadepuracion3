import java.util.Scanner;

public class ejercicio2 {
    public static void EJ2() {
        //Indicamos el tamaño
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce longitud array");
        int numeroUsuario = sn.nextInt();
        int num[]=new int[numeroUsuario];
        //Invocamos las funciones
        rellenarNumAleatorioArray(num, 0, 9);
        mostrarArray(num);
        }

        public static void rellenarNumAleatorioArray(int lista[], int a, int b){
            for(int i=0;i<lista.length;i++){
                //Generamos un número entre los parametros pasados
                lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
            }
        }
        public static void mostrarArray(int lista[]){
            for(int i=0;i<lista.length/*-1*/;i++){
                System.out.println("En el indice "+i+" esta el valor "+lista[i/*+1*/]);
            }
    }

}
