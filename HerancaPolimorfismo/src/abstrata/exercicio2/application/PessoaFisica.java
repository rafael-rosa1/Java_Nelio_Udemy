package abstrata.exercicio2.application;

import abstrata.exercicio2.entities.Pessoa;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        double imposto = 0.0;
        if(getRendaAnual() >= 20000) {
            imposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
        } else {
            imposto = (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
        }
        return imposto;
    }
}
