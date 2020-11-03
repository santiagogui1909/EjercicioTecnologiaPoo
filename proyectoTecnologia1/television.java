package proyectoTecnologia1;

public class television extends tecnologia{
 
		    private final double precio;
		    private final int pulgadas;
		    private final String TipoPantalla;
		    
		    //Constructor
		   
		    public television(String nombre, int cedula, int numfactura, int codigoCliente, int pulgadas,String tipoPantalla, double precio) {
				super(nombre, cedula, numfactura, codigoCliente);
				
				this.precio=precio;
				this.pulgadas = pulgadas;
				this.TipoPantalla = tipoPantalla;
			}

		    //Método
		  
		    public void precioDescuento(){
		       
		        double precioFinal;
		        double descuento;

           // descuento

		   if (this.pulgadas >= 60){

			   descuento=this.precio*0.50;
			   precioFinal=this.precio-descuento;

			   System.out.println("tiene un descuento del " + descuento + " por ende el total final es " + precioFinal);

		        }else if (this.pulgadas >= 40){

		        descuento=this.precio*0.30;
		        precioFinal=this.precio-descuento;

		       System.out.println("tiene un descuento del " + descuento + " por ende el total final es " + precioFinal);

		        } else if (this.pulgadas >= 30){

			        descuento=this.precio*0.20;
			        precioFinal=this.precio-descuento;

			    System.out.println("tiene un descuento del " + descuento + " por ende el total final es " + precioFinal);

				}else{

					System.out.println("no tiene ningun descuento");

				}

		    }


	@Override
			
			public void mostrardatos () {
				
				 System.out.println("nombre: " + Nombre
						 + "\ncedula: " + Cedula 
						 + "\nnumero de factura: " + Numfactura
						 + "\ncodigo cliente: " + CodigoCliente 
						 + "\nprecio: " + precio
						 + "\npulgadas: " + pulgadas
						 + "\ntipo de pantalla " + TipoPantalla);
			}
			

			@Override
			public void descuento() {
			
			}

			@Override
			public void memoria() {
				
			}
    }
		