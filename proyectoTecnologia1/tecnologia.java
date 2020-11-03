package proyectoTecnologia1;

public abstract class tecnologia {
		
	//Atributos
	
	    protected String Nombre;       
	    protected int Cedula;
		protected int Numfactura;
		protected int CodigoCliente;
		
		public tecnologia(String nombre, int cedula, int numfactura, int codigoCliente) {
			
			Nombre = nombre;
			Cedula = cedula;
			Numfactura = numfactura;
			CodigoCliente = codigoCliente;
		}

			//obtencion y establecimiento  (gets y sets)

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public int getCedula() {
			return Cedula;
		}

		public void setCedula(int cedula) {
			Cedula = cedula;
		}

		public int getNumfactura() {
			return Numfactura;
		}

		public void setNumfactura(int numfactura) {
			Numfactura = numfactura;
		}

		public int getCodigoCliente() {
			return CodigoCliente;
		}

		public void setCodigoCliente(int codigoCliente) {
			CodigoCliente = codigoCliente;
		}
	
		public void mostrardatos () {
			
			System.out.println("nombre: " + Nombre
					+ "/n cedula: " + Cedula 
					+ "/numero de factura: " + Numfactura
					+ "/n codigo cliente:" + CodigoCliente);
		}

		public abstract void descuento();
		
		public abstract void memoria();
	
		public abstract void precioDescuento();
			
	}

