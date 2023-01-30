package ejerciciofiguras1;

import java.util.InputMismatchException;// IMPORTACION PARA EL CATCH
import java.util.Scanner;//IMPORTACION SCANNER, PARA INTRODUCIR DATOS

public class ClasePrincipal {
	
public static void main(String[] args) {
		// MENÚ DE FIGURAS Y SCANNER PARA QUE PUEDA INTRODUCIR DATOS EL USUARIO
		Scanner scanner = new Scanner(System.in);
		 System.out.println("     FIGURAS PLANAS     \n ---------------------\n \n 1.Crear un triángulo\n 2.Crear un rectángulo \n\n\n Escoge una opción:");
        
		 String opcion = scanner.nextLine();
		 //CONDICIONAL PARA ELEGIR DETERMINADA ACCION, DEPENDIENDO DE LA OPCION ELEGIDA Y MOSTRAR LOS DATSO REQUERIDOS
		 while(true){
	            if(opcion.equals("1") || opcion.equals("2")){
	                break;
	            }
	            else{
	                System.out.println("Has introducido un numero incorrecto porfavor intentelo de nuevo: ");
	                opcion = scanner.nextLine();
	            }
	        }
	        if(opcion.equals("1")){
	            Triangulo miTriangulo = new Triangulo("miTriangulo", "rojo", 8, 8, 8, 6.93);
	            miTriangulo.dime_caracteristicas();
	            miTriangulo.getTipoTriangulo();
	            scanner.close();
	        }
	        else if(opcion.equals("2")){
	            try {
	                System.out.println("Elija un color: ");
	                String color = scanner.nextLine();
	                System.out.println("Elija la medida del lado izquierdo: ");
	                double ladoIzquierdo = scanner.nextDouble();
	                System.out.println("Elija las medidas del lado alto: ");
	                double ladoArriba = scanner.nextDouble();
	                System.out.println("Elija las medidas del lado derecho: ");
	                double ladoDerecho = scanner.nextDouble();
	                System.out.println("Elija las medidas del lado bajo: ");
	                double ladoAbajo = scanner.nextDouble();
	                Rectangulo miRectangulo = new Rectangulo("miRectangulo", color, ladoIzquierdo, ladoArriba, ladoDerecho, ladoAbajo);
	                scanner.close();
	                System.out.println("Perimetro: " + miRectangulo.getPerimetro() + "\nArea: " + miRectangulo.getArea());
	                if(miRectangulo.comprobarCuadrado(miRectangulo) == true){
	                    System.out.println("Es un cuadrado");
	                }
	                else{
	                    System.out.println("Es un rectangulo");
	                }}catch (InputMismatchException e) {
	                    System.out.println(" No  has introducido un numero. \nPorfavor introduzca un numero");
	                    
	                }
	            
	            {
		 
		}
	}
	

	}}
