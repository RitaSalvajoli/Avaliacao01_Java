public class TestePolimorfismo {

    public class Pessoa {

        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(final String nome) {
            this.nome = nome;
        }

    }

    public class PessoaFisica {

        private long cpf;

        public PessoaFisica() {
        }

        public long getCpf() {
            return cpf;
        }

        public void setCpf(final long cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return "Pessoa Fisica: " + super.getNome() + " - CPF: " + this.getCpf();
        }
    }

    public class PessoaJuridica {

        private long cnpj;

        public PessoaJuridica() {
        }

        public long getCnpj() {
            return cnpj;
        }

        public void setCnpj(final long cnpj) {
            this.cnpj = cnpj;
        }

        public String getNome() {
            return "Pessoa Juridica: " + super.getNome() + " - CNPJ: " + this.getCnpj();
        }
    }

    public static void main(final String[] args) {
        final TestePolimorfismo.PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Cristiano");
        fisica.setCpf(12345678901L);

        final Pessoa juridica = new PessoaJuridica();
        juridica.setNome("Rafael");

        final Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = fisica;
        pessoas[1] = juridica;

        for (final Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
          }
        }
    
}
