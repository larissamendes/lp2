public class Palindrome{
	public static int palSize = 5;
	boolean  bool=false;
	String teste="";    
	void encontraPal(String given,int vezesTest){
 for(int i=0;i<=vezesTest;i++){	
  		teste = given.substring(i,i+palSize); 
  		StringBuffer txtrever = new StringBuffer(teste);
  		   	txtrever.reverse();
  			 String rever = txtrever.toString();
  if(teste.equals(rever)){
 System.out.println("O palindrome encontrado foi: " + teste);  
System.out.println("Posição: " + (i+1) + "-" + (i+palSize));
  bool=true;
  System.exit(0);
  }
}
  if(bool==false){
  System.out.println("Nao se encontrou um palindrome");
}
	}
	public static void main(String[]args){
	String text = args[0];
 	int size = text.length();
 	int testVezes = size - palSize;
	TrabalhoPalindromo tp = new TrabalhoPalindromo();
	tp.encontraPal(text,testVezes);    
  }
}
