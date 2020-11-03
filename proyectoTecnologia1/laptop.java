package proyectoTecnologia1;

public class laptop extends tecnologia {
	
	//Atributos

	private final String Marca;
	private final double valor;
	
	//constructor
	
	public laptop(String nombre, int cedula, int numfactura, int codigoCliente, double valor, String marca) {
		super(nombre, cedula, numfactura, codigoCliente);
		this.Marca = marca;
		this.valor=valor;
	}
	
	//Metodo
	
	@Override
	
	public void descuento() {
		
		double ValorDescuento;
		double montoTotal;
	
		
		if ((this.Marca.equals("asus")) || this.Marca.equals("acer")){  //verifica que el valor sea igual a parametro y ejecute el ciclo if
					
			ValorDescuento=this.valor*0.40;

		}else{
			
			ValorDescuento=this.valor*0.20;

		}

		montoTotal=this.valor-ValorDescuento;
		System.out.println("su descuento es de: " + ValorDescuento + " total a pagar: " + montoTotal);

	}


	//metedo mostrar datos
	
	@Override
	
	public void mostrardatos () {
		
		 System.out.println("nombre: " + Nombre
				 + "\ncedula: " + Cedula 
				 + "\nnumero de factura: " + Numfactura
				 + "\ncodigo cliente: " + CodigoCliente 
				 + "\nmarca: " + Marca 
				 + "\nvalor: " + valor);
	}

	@Override
	public void memoria() {

		
	}

	
	@Override
	
    public void precioDescuento() {
		
	}

}
			


	


