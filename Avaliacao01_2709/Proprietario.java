import java.sql.Date;


public class Proprietario extends Endereco{
    private String nome;
    private int rg; 
    private int cpf;
    private Date nascimento;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getRG() {
        return rg;
    }
    
    public void setRG(int rg){
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }

    public static void main(String[] args) {
        
    }

}