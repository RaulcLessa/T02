package T02_Integrado;

import java.text.ParseException;
import java.util.Vector;

public class JanelaBusca {
	
	public static Vector<Cliente> vetor = new Vector<Cliente>();

	static int valorBusca;
	
	public static void setValorBusca(int i){
		valorBusca = i;
		System.out.println(valorBusca);
	}
	public static int getValorBusca(){
		return valorBusca;
	}
	
	public static void main(String []args){
		setValorBusca(0);
		try {
			new JanelaCadastro();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
