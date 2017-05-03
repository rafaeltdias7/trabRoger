package trabalhoRoger;

import java.util.Scanner;




public class Conta {
	public String conta;
	private double saldo = 0;
	
	public boolean deposita(double valor){
		if (valor > 0){
			saldo+=valor;
			return true;
		}
		else{
			System.out.println("Valor invalido!");
			return false;
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public boolean saca(double valor1){
		if(valor1 <= this.saldo){
			if(valor1 >= 0){
				saldo -= valor1;
				return true;
			}else{
				System.out.println("valor n valido");
			}
		}else{
			System.out.println("saldo n inuficiente");
		}
		return false;
	}
	
	public double lerDouble(String mensagem){
		System.out.println(mensagem);
		Scanner in = new Scanner(System.in);
		return in.nextDouble();
	}
}
