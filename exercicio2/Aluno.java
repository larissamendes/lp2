public class Aluno{
	String nome;
    int idade;
    String numeroMatricula;
	

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " +this.nome + "Numero Matricula: " 					+this.numeroMatricula + "Idade: " + this.idade);
}

	public static void main(String [] args){

		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		Aluno al3 = new Aluno();
		Aluno al4 = new Aluno();
 
	al1.nome = "Larissa";
	al1.numeroMatricula = "201418110132";
	al1.idade = 17;

  al1.imprimirDadosCadastrais();
 	
	al2.nome = "Eduardo";
	al2.numeroMatricula = "201418110258";
	al2.idade = 17;

  al2.imprimirDadosCadastrais();
	
	al3.nome = "Joao";
	al3.numeroMatricula = "201418113258";
	al3.idade = 18;
 
  al3.imprimirDadosCadastrais();
 
    al4.nome = "Bia";
	al4.numeroMatricula = "201418112354";
	al4.idade = 18;

  al4.imprimirDadosCadastrais();
} 
 
 }



 






