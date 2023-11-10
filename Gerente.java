package Polimorfismo;

public class Gerente extends Funcionarios{

	 private  String nome;
	 private  String cargo;
	 private  String salario;
	 

	 public Gerente(String nome, String cargo, String salario) {
		 super(nome, cargo, salario);
		 
		 this.nome = nome;
		 this.cargo = cargo;
		 this.salario = salario;
	  
	}

     public String getnome() {
       return nome;
     }

     public void setnome(String nome) {
       this.nome = nome;
     }

     public String  getcargo() {
	   return cargo;
     }

     public void setcargo (String cargo ) {
	     this.cargo = cargo;
     }

     public String salario () {
        return salario;
    }  

     public void setsalario(String salario ) {
         this.salario = salario;
     }
   
    public  void mostrarGerente() {
       System.out.println("Nome: " + nome);
       System.out.println("Cargo: " + cargo);
       System.out.println("Salario: " + salario);
       
   }
      public  static void main(String[] args) {
    	  
    	  Gerente g1 = new Gerente("Fernando" , "Gerente" , "8.500");
 	      g1.mostrarGerente();
      }
      public  void mostrarInformacoesGerente() {
	        System.out.println("Nome: " + nome);
	        System.out.println("cargo: " + cargo);
	        System.out.println("Salario: " + salario);   
	    }
	

 }