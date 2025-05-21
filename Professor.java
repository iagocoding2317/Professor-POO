public class Professor {  
    private int matricula;
    private String nome;
    private String departamento;

    public Professor(int matricula, String nome, String departamento){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        }
        
    public void setNome(String nome) {
        this.nome = nome;
        }
        
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
        }
    
    public void imprimir(){
        System.out.println("Matrícula do professor:" + matricula + "\nNome do professor: " + nome + "\nDepartamento: " + departamento);
    }
}
