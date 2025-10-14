package lezione02_Metodi;

public class metodi_altri {

//In questa classe userò i metodi che ho definito in altre classi dello stesso pkg	
//SINTASSI
//nomClasse.nomeMetodo()
	
	public static void main(String[] args) {
		
		intro.salutaPerNome("Pippo Tanto");
		
		double somma = Calcolatrice_scema.somma(5,7);
		System.out.println(somma);
	}
	
	
	
}
