import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
        ListaDoble list=new ListaDoble();
        boolean inMenu=true;
        while (inMenu){
            System.out.println("\n----- Menu Lista -----\n");
            System.out.println("1 para insertar al inicio\n" +
                    "2 para insetar al final\n" +
                    "3 para eliminar al inicio\n" +
                    "4 para eliminar al final\n" +
                    "5 para eliminar cualquier dato\n" +
                    "6 para mostrar de inicio al fin\n" +
                    "7 para mostrar de fin a inicio\n" +
                    "8 para salir del menú\n" +
                    "Ingrese su opción: ");
            int opcion=Integer.parseInt(cp.readLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el dato: ");
                    list.agregarAlInicio(Integer.parseInt(cp.readLine()));
                    break;
                case 2:
                    System.out.println("Ingrese el dato: ");
                    list.agregarAlFinal(Integer.parseInt(cp.readLine()));
                    break;
                case 3:
                    list.eliminarInicio();
                    break;
                case 4:
                    list.eliminarFin();
                    break;
                case 5:
                    System.out.println("Ingrese el dato a eliminar: ");
                    list.eliminar(Integer.parseInt(cp.readLine()));
                    break;
                case 6:
                    list.mostrarListaInicioAFin();
                    break;
                case 7:
                    list.mostrarListaFinAInicio();
                    break;
                case 8:
                    inMenu=false;
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }


    }
}