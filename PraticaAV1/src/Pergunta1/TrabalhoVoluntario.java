package Pergunta1;

public class TrabalhoVoluntario extends Projeto{

    private String tipoTrabalho;
    private int duracaotrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaotrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaotrabalho = duracaotrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaotrabalho() {
        return duracaotrabalho;
    }

    public void setDuracaotrabalho(int duracaotrabalho) {
        this.duracaotrabalho = duracaotrabalho;
    }

    public boolean validaProjeto(){
        if(getDuracaotrabalho()>2)
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "\nNome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData de Início: " + getDataInicio() + "\nData do Fim: " + getDataFim() + "\nTipo de Trabalho: " + getTipoTrabalho() + "\nDuração do Trabalho: " + getDuracaotrabalho();
    }
}
