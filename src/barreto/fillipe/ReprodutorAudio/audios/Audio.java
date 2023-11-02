package barreto.fillipe.ReprodutorAudio.audios;

public class Audio {

    protected String titulo;

    protected int duracao;

    protected int totalReproducao;

    protected int curtidas;

    protected boolean baixado;

    protected int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getBaixado(){
        if(this.baixado == true){
            String frase = "O audio está baixado";
            return frase;
        }else{
            String frase = "O audio não está baixado";
            return frase;
        }
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getClassificacao() {
        return classificacao;
    }



    public void ouvir(){
        this.totalReproducao++;
    }

    public void curtir(){
        this.curtidas++;
    }
}
