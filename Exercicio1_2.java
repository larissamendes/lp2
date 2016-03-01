
Class Exercicio1_3{
Int a,b,c;
Public void imprimirSoma() {
Int soma= (this.a)+(this.b)+(this.c);
System.out.println(“ O valor da soma foi: “ + this.soma);
}
Public void imprimirMultiplicacao() {
Int multiplicação= (this.a)*(this.b)*(this.c);
System.out.println(“O valor da multiplicação:” +this.multiplicacao);
}
Public void imprimirDivisao() {
Int divisão= (this.a)/(this.b)/(this.c);
System.out.println(“O valor da divisão:” +this.divisao);
}
Public void imprimirSubtracao(){
Int subtração= (this.a)-(this.b)-(this.c);
System.out.println(“O valor da subtração:” +this.divisao);
}
Public  static void main ( Int [] a,b,c) {
Exercicio1_3 x= new Exercicio1_3();
x.a= 45;
x.b=20;
x.c=3;
x.imprimirSoma ();
x.imprimirMultiplicacao();
x.imprimirDivisao ();
x.imprimirSubtracao ();
   }
}
