//CREADOR: SANTIAGO GUILLEN RAMIREZ

//SENA-2020-ADSI

// TIENDA TECNOLOGICA


package proyectoTecnologia1;

public class TecnoApp {
	
  public static void main(String[] args) {

	  //Instancias

	  tecnologia laptop2 = new laptop("luis",223,4445,987,400,"apple");

	  tecnologia celular1 = new celular("jose" , 3323211 , 3332 , 12 , 6 , 16 , 64);

	  tecnologia television1 = new television("pepe", 100614748, 4477, 19, 32, "plana", 500);
	  
	 
	          System.out.println("LAPTOP");	  //muestra en pantalla los datos de la laptop
	  
	 laptop2.mostrardatos();
	 
	 laptop2.descuento();
	 
	 
	          System.out.println();	//Separador
	 

	          System.out.println("CELULAR");	 //muestra en pantalla los datos del celular
	 	 
     celular1.mostrardatos();
     
     celular1.memoria();
     
	 
                System.out.println();	//Separador
                
	
     System.out.println("TELEVISION");	  //muestra en pantalla los datos de la laptop
	  
   	 television1.mostrardatos();
   	 
   	 television1.precioDescuento();
   	 
   
  }
	  
}





	  


	  
	 



