package Polimorfismo;

public class Funcionarios {
	
	private  String nome;
	private  String cargo;
	private  String salario;
	 
	 public  Funcionarios (String nome ,String cargo,String salario ) {
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
	 
	    public void mostrarProgramador() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Salario: " + salario);
	        
	    }
	    
	    public  void mostrarGerente() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Salario: " + salario);
	        
	    }
	    
	       public static void main(String[] args) {
	    	     Programador p1 = new Programador("Kauan" , "Programador" , "4.500 \n");
				 p1.mostrarProgramador();
				 
	    	     Gerente g1 = new Gerente("Fernando" , "Gerente" , "8.500");
	    	     g1.mostrarGerente();

			
	    }
		    public  void mostrarInformacoesFuncionario() {
		        System.out.println("Nome: " + nome);
		        System.out.println("cargo: " + cargo);
		        System.out.println("Salario: " + salario);   
		    }
}