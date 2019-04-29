import java.io.*;

    /**
     * El cÃ³digo ordena de mayor a menor los valores de cada elemento del array.
     * 
     * El cÃ³digo selecciona dos valores,si el valor mayor se situa antes no hace ninguna modificaciÃ³n,si es al reves cambia el orden de los valores hasta conseguir que el numero mayor se encuentre al inicio de la serie y el menor al final.
     * 
     * @author a17braispg
     */
public class burbuja{
public static void main(String arg[]) throws IOException{
    
    /**
     * Este bloque crea el array y le asigna un tamaÃ±o
     */   
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
int tam = Integer.parseInt(in.readLine());
int arr[] = new int[tam];

System.out.println();

    /**
     * Es un bucle que ordena los valores de mayor a menor.
     */
int j = 0;
for (int i = 0 ; i < arr.length;i++){
j+=1;
System.out.print("Elemento " + j + " : ");
arr[i] = Integer.parseInt(in.readLine());
}
burbuja(arr);
}

    /**
     * Ordena los valores de mayor a menor.
     * 
     * @param arreglo compara los valores de los arrays
     */
public static void burbuja(int arreglo[]){
for(int i = 0; i < arreglo.length - 1; i++){
for(int j = 0; j < arreglo.length - 1; j++){
if (arreglo[j] < arreglo[j + 1]){
int tmp = arreglo[j+1];
arreglo[j+1] = arreglo[j];
arreglo[j] = tmp;
}
}
}
for(int i = 0;i < arreglo.length; i++){
System.out.print(arreglo[i]+"\n");
}
}
}
