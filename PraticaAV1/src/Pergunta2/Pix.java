package Pergunta2;

public class Pix extends Pagamento{

    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscal(){
        return "Data e Hora: " + getDataHoraPagamento() + "\nNumero do Pagamento: " + getNumeroPagamento() + "\nValorPago: " + getValorPago() + "\nComprovante do PIX: " + isComprovanteTransacaoPix();
    }
}
