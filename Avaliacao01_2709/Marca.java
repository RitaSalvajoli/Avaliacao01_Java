import java.util.Date;

public class Marca {

    private String nome;
    private int numeroModelos;
    private Date lancamento;
    private int codigo;

    public String getNome() {
        return nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getNumeroModelos() {
        return numeroModelos;
    }

    public void setNumeroModelos(final int numeroModelos) {
        this.numeroModelos = numeroModelos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(final Date lancamento) {
        this.lancamento = lancamento;
    }

    public static void main(final String[] args) {
        
    }
}
