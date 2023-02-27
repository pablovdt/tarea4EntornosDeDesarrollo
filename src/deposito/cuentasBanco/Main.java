package cuentasBanco;
public class Main {

    public static void main(String[] args) {
        CuentaBanco miCuenta;
        double saldoActual;

        extracted();
    }

	private static void extracted() {
		operativaCuenta();
	}

	private static void operativaCuenta() {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		float cantidad = 0.0f;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
