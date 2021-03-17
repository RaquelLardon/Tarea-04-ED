package cuentas;

/**
 * @author Raquel Lard�n Olmeda
 * Tarea ED04
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
  /**
   * 
   */
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;

    /** Constructor sin argumentos 
     */
    public CCuenta ()
    {
    }
    /** Constructor con par�metro para iniciar todas las propiedades de la clase
     * 
     * @param nom Nombre del cliente de la cuenta
     * @param cue N�mero de la cuenta del cliente
     * @param sal Saldo actual en la cuenta
     * @param tipo Tipo de inter�s a aplicar a la cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInter�s=tipo;
    }
   /** M�todo para asignar el nombre del titular de la cuenta
     * 
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /** M�todo que me devuelve el nombre del titular
     * 
     * @return <code>nombre</code> Nombre del titular
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /** M�todo que me devuelve el saldo disponible en cada momento
     * 
     * @return <code>saldo</code> Saldo disponible en la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /** M�todo para ingresar cantidades en la cuenta. Modifica el saldo.
      * 
      * @param cantidad Dinero a ingresar en cuenta
      * @throws Exception  Controlamos que no se introduzcan cantidades negativas
      */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    /** M�todo para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     * @param cantidad Dinero a sacar de la cuenta
     * @throws Exception  Controlamos que no se retiren cantidades negativas ni superiores al saldo
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * Devuelve el n�mero de cuenta 
     * @return <code>cuenta</code> Cadena con el n�mero de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Asignamos el n�mero de la cuenta
     * @param cuenta Numero de la cuenta del cliente
     */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Asignamos el valor al saldo
   * @param saldo Introduce el saldo actual
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Nos devuelve el tipo de inter�s
   * @return <code>tipoInter�s</code> Porcentaje a aplicar
   */
  public double getTipoInter�s() {
    return tipoInter�s;
  }

  /**
   * Asignamos el valor del tipo de inter�s
   * @param tipoInter�s Porcentaje a aplicar
   */
  public void setTipoInter�s(double tipoInter�s) {
    this.tipoInter�s = tipoInter�s;
  }
}
