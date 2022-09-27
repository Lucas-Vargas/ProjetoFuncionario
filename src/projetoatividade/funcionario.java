
package projetoatividade;

import java.util.ArrayList;

public class funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private float salario;
    ArrayList arrayUsu = new ArrayList();
    
    public funcionario(){
        ArrayList arrayUsuarios = new ArrayList();
        arrayUsuarios = arrayUsu;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String toString(){
        String res ="";
        for (int i = 0; i < this.arrayUsu.size();i++) 
	      { 		      
	          res += arrayUsu.get(i)+"\n"; 		
	      }   
        return res;
    }
    
    
    
}
