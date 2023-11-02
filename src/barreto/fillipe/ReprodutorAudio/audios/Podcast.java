package barreto.fillipe.ReprodutorAudio.audios;
import barreto.fillipe.ReprodutorAudio.funcionalidade.Baixar;

public class Podcast extends Audio implements Baixar {

    private String host;

    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas()>2500){
            return 10;
        }else {
            return 8;
        }
    }


    @Override
    public void baixar() {
        this.baixado = true;
        System.out.println("O podcast "+this.titulo+" foi baixado com sucesso");
    }
}
