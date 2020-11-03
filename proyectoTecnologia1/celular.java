package proyectoTecnologia1;

public class celular extends tecnologia{
		  
		//Atributos
		
	private final int Ram;
	private final int Almacenamiento;
	private final int ResolucionCamara;
	
	//constructor

	public celular(String nombre, int cedula, int numfactura, int codigoCliente, int ram, int resolucionCamara, int Almacenamiento) {
		super(nombre, cedula, numfactura, codigoCliente);
		this.Ram = ram;
		this.ResolucionCamara = resolucionCamara;
		this.Almacenamiento= Almacenamiento;
	}		

	public void memoria() {
		
	switch (this.Ram) {

            case 2:
	               System.out.println("Memoria Ram no disponible");
	               
	        break;
	                
            case 3:
	        	  System.out.println("Memoria Ram Disponible");	    
	        	  
	        break;

            case 4:
	        	  System.out.println("Memoria ram no disponible");

	        break;

            case 6:
	        	  System.out.println("Memoria ram Disponible");
	        	  
	        break;

	        default:
	               System.out.println("No es un valor valido");

	        break;

	    }

	   switch (this.Almacenamiento) {

           case 16:
                   System.out.println("El dispositivo no cuenta con esta capacidad de memoria");
           
           break;
            
           case 32:
    	            System.out.println("El dispositivo cuenta con esta capacidad de memoria");
    	   
           break;

           case 64:
    	            System.out.println("el dispositivo cuenta con esta capacidad de memoria");

           break;

           default:
                    System.out.println("Ninguno de nuestros dispisitivos cuenta con esta capacidad");

           break;

       }
  			
	}


@Override
	
	public void mostrardatos () {
		super.mostrardatos();   //usar super

		 System.out.println("\nmemoria Ram " + Ram
				 + "\nresolucion camara: " + ResolucionCamara
				 + "\nalmacenamiento: " + Almacenamiento);	
	}

	    @Override
        public void descuento() {
	
         }

		@Override
		public void precioDescuento() {
			
		}
	}

