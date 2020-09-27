import java.util.Date;

public class Carro extends Marca{

    private char modelo;
    private String cor;
    private Date ano;
    private String marca;
    private char chassi;
    private float velocidadeMax;
    private float velocidadeAtual;
    private int numeroPortas;
    private boolean tetoSolar;
    private int numeroMarchas;
    private boolean cambioAutomatico;
    private float volumeCombustivel;

    public char getModelo() {
        return modelo;
    }
    
    public void setModelo(final char modelo) {
        this.modelo = modelo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(final Date ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
    }

    public void setCor(final String cor) {
        this.cor = cor;
    }

    public char getChassi() {
        return chassi;
    }

    public void setChassi(final char chassi) {
        this.chassi = chassi;
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(final float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public float getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(final float volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(final float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(final int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(final int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(final boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(final boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public static void main(final String[] args) {
        Proprietario proprietario = new Proprietario();
    }
}
