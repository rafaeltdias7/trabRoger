package trabalhoRoger;

public class ExConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		 double valor1 = c1.lerDouble("Informe a quantidadee a depositar: "); 
		 c1.deposita(valor1);
		 
		 System.out.println(c1.getSaldo());
		 
		 double valor2 = c1.lerDouble("Informe a q a sacar: ");
		 c1.saca(valor2);
		 
		 System.out.println ("Saldo: ");
		 System.out.println(c1.getSaldo());
	}

}
