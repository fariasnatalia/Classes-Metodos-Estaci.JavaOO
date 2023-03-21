package aluno;
public class Atividade1 {
    
    String nome;
    String endereco;
    int idade;
    String curso;
    String pretencao_salarial;
    
    void status(){
    
    
        System.out.print(" O nome dela está na lista de presença?\n" + this.nome);
        System.out.println("-----------------------------------------");
      
        System.out.println("-----------------------------------------");
        System.out.println("Ö endereço dela está atualizado?\n" + this.endereco);
        
        System.out.println("-----------------------------------------");
        System.out.println("Ela é  maior de idade\n"+  this.idade);
        
        System.out.println("-----------------------------------------");
        System.out.println("Ëstá gostando do curso\n" + this.curso);
        
        System.out.printf("Qual remuneração a deixaria satisfeita? \n" + this.pretencao_salarial);
    
    }
    
    
    public Atividade1(String nome) {
        this.nome = nome;
    }

    public Atividade1() {
    }


    void exibir_informacoes(){

    }
    
    void exibir_salario(){

    }
   
    
}