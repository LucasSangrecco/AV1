package Pergunta3;

public class Mensalidade {

    private double valorMensalidade;
    private int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }

    public double calculaMensalidade(){
        if(this.numeroIrmaos==1) {
            this.valorMensalidade *= 1.05;
            return this.valorMensalidade;
        }
        else if (this.numeroIrmaos==2) {
            this.valorMensalidade *= 1.10;
            return this.valorMensalidade;
        }
        else if (this.numeroIrmaos>2) {
            this.valorMensalidade *= 1.15;
            return this.valorMensalidade;
        }
        else
            return 0;
    }

}
