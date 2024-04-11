public class Aluno {
    
    private String nome;
    private String sexo;
    private int matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", sexo=" + sexo + ", matricula=" + matricula + "]";
    }

}
