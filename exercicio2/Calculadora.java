public class Calculadora{
	int va1,va2;
	
	public void soma(){
		int soma= va1+va2;
		System.out.println ("A soma dos dois numeros sao: " + soma);
	}

	public void subtracao(){
		int subtracao= va1-va2;
		System.out.println ("A subtraçao dos dois numeros sao: " + subtracao);
	}

	public void multiplicacao(){
		int multiplicacao= va1*va2;
		System.out.println ("A multiplicaçao dos dois numeros sao: " + multiplicacao);
	}

	public void divisao(){
		int divisao= va1/va2;
		System.out.println ("A divisao dos dois numeros sao: " + divisao);
	}

		
     public static void main (String [] args){
		
	Calculadora c1 = new Calculadora();
	Calculadora c2 = new Calculadora();
    Calculadora c3 = new Calculadora();

   
    c1.va1 = 8;
    c1.va2 = 2;

    c1.soma();
	c1.subtracao();
	c1.multiplicacao();
	c1.divisao();

   c2.va1 = 1;
   c2.va2 = 3;

   c2.soma();
   c2.subtracao();
   c2.multiplicacao();
   c2.divisao();

   c3.va1 = 9;
   c3.va2 = 2;
 
   c3.soma();
   c3.subtracao();
   c3.multiplicacao();
   c3.divisao();
 }
}
