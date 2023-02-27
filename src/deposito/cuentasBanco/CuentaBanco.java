package cuentasBanco;
public class CuentaBanco {
	
	/**
	* 
	*  This class contains the basic elements to simulate a bank account.
	* 
	* @author Pablo del Pozo Vizueta
	* 
	*/

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    // Default constructor and constructor with parameters
    public CuentaBanco()
    {
    }
    
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Gets the account saldo
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Inserts saldo in this account
     * @param cantidad amount to be paid
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
        
        if (cantidad > 5000)
            throw new Exception("Para ingresar mas de 5000 necesitas confirmacion");
        	//Llamar al método requestConfirmation()
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Get amount in this account
     * @param cantidad amount to be obtained
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    // Getters and setters by class atributes
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
