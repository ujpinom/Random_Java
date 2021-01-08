package ATM;

public class ATM {
	
	private int numeroCuenta=0;
	private Pantalla pantalla;
	private BaseDatos basedatos;
	private DispensadorEfectivo dispensador;
	private Teclado teclado;
	private RanuraDeposito ranura;
	private boolean usuariovalidado=false;
	private final int Retirar=1;
	private final int SolicitudSaldo=2;
	private final int depositar=3;
	private final int salir=4;
	
	public ATM() {
		
		pantalla= new Pantalla();
		basedatos= new BaseDatos();
		dispensador= new DispensadorEfectivo();
		teclado= new Teclado();	
		ranura=new RanuraDeposito();	
	}
	
	public void Run() {
		while(true) {
		
		validez();
	
		desplegarMenu();
		
		int accion= teclado.ObtenerEntradaTeclado();
		
		if(accion==salir) {
		
		}
		else
			EjecutarTransaccion(accion);
		
		
		usuariovalidado=false;
		numeroCuenta=0;
		
		}
}// Fin del metodo Run del ATM
	
	public void validez() {
		while(!usuariovalidado) {
			
			pantalla.ImprimirMensaje("Bienvenido a nuestro ATM!");
			validarUsario();
			}
	}
	
	public void EjecutarTransaccion(int accion) {
		
		
		boolean bandera=false;
		double monto;
		
		while(!bandera) {
			
		switch(accion) {
		
		case Retirar: 
			pantalla.ImprimirLinea("Por favor ingrese el monto a retirar: %n");
			monto= establecerMonto();
			
			if(monto!=0) {
				
			Retiro tipotransaccion= new Retiro(numeroCuenta,pantalla,basedatos,monto);
			if(tipotransaccion.ObtenerMonto()>tipotransaccion.SaldoDisponible()) {
				pantalla.ImprimirLinea("El monto solicitado es mayor que su saldo disponible.Vuelva a identificarse.%n");
				bandera=true;
			}
			else {
				tipotransaccion.Ejecutar();
				pantalla.ImprimirLinea("Por favor retire su dinero!%n");
				pantalla.ImprimirLinea("Saldo disponible: ");
				
				pantalla.imprimirNumeros(tipotransaccion.SaldoDisponible());
				pantalla.ImprimirLinea("Saldo Total: ");
				pantalla.imprimirNumeros(tipotransaccion.SaldoTotal());
				pantalla.ImprimirLinea("Que tenga un buen día!%n");
				pantalla.ImprimirLinea("Billetes disponibles: ");
				pantalla.imprimirNumeros(dispensador.billetesdisponibles());
				bandera=true;
			}
		}
			else {
				bandera=true;
				break;
			}
			break;
		case  SolicitudSaldo:
			SaldoCuenta consultasaldo=new SaldoCuenta(numeroCuenta,pantalla,basedatos);
			pantalla.ImprimirLinea(consultasaldo.ConsultaSaldo());
			pantalla.ImprimirEspacio();
			bandera=true;
			break;
			
		case depositar:
			pantalla.ImprimirLinea("Tenga presente que el dinero no se verá reflejado inmediantamente para su uso.%n");
			pantalla.ImprimirLinea("Introduzca la cantidad de dinero que desea depositar: %n");
			monto= teclado.ObtenerEntradaTeclado();
			Deposito depositoactual= new Deposito(numeroCuenta,pantalla,basedatos,ranura,teclado,monto);
			depositoactual.Ejecutar();
			
			pantalla.ImprimirLinea("El dinero se recibió satisfactoriamente!%n");
			pantalla.ImprimirLinea("Su nuevo Salto Total es: ");
			pantalla.imprimirNumeros(depositoactual.ObtenerSaldoTotall());
			pantalla.ImprimirMensaje("Tenga un buen día!");
			bandera=true;
			break;
		default:
			bandera=true;
			pantalla.ImprimirLinea("Seleccion erronea!%n");
		}
		
	}
		
}
	
	public int establecerMonto() {
		
		int cantidades[]= {0,20,40,60,100,200};
		
		pantalla.ImprimirMensaje("Ingrese la opción de retiro: ");
		pantalla.ImprimirLinea("1--$20%n");
		pantalla.ImprimirLinea("2--$40%n");
		pantalla.ImprimirLinea("3--$60%n");
		pantalla.ImprimirLinea("4--$100%n");
		pantalla.ImprimirLinea("5--$200%n");
		pantalla.ImprimirLinea("6--Cancelar%n");
		
		
		int Monto;
		int seleccion= teclado.ObtenerEntradaTeclado();
		if(seleccion!=6) {
		Monto= cantidades[seleccion];
	
		if(!dispensador.EstablecerMontooo(Monto)) {
			
			pantalla.ImprimirLinea("El ATM no tiene suficiente dinero para llevar acabo la transacción.Intente de nuevo más tarde.%n");
			Monto=0;
		}
			
		}
		else {
			Monto= cantidades[0];
		}
		
			return Monto;
	}
	
	
	public void validarUsario()
	{
		pantalla.ImprimirLinea("Por favor ingrese su numero de cuenta: ");
		int numeroCuenta1=teclado.ObtenerEntradaTeclado();
		pantalla.ImprimirLinea("Por favor ingrese su clave: ");
		int clave= teclado.ObtenerEntradaTeclado();
		pantalla.ImprimirEspacio();
		
		usuariovalidado= basedatos.AutenticarUsuario(numeroCuenta1, clave);
		
		if(!usuariovalidado) {
			pantalla.ImprimirMensaje("El usuario no pudo ser validado.Datos incorrectos.");
		}
		else
			numeroCuenta=numeroCuenta1;
	}
	
	public void desplegarMenu() {
		
		pantalla.ImprimirLinea("Ingrese una de las opciones: ");
		pantalla.ImprimirEspacio();
		pantalla.ImprimirLinea("1--Retirar%n");
		pantalla.ImprimirLinea("2--Solicitud de saldo%n");
		pantalla.ImprimirLinea("3--Depositar%n");
		pantalla.ImprimirLinea("4--Salir%n");
		
	}
	
}
