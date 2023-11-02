package barreto.fillipe.ReprodutorAudio.audios;
import barreto.fillipe.ReprodutorAudio.funcionalidade.Baixar;


public class Musica extends Audio implements Baixar {

    private int quantaMusica;

    private String nomeSingle;

    private String nomeAlbum;

    private String nomeEp;

    private String autor;

    private String genero;

    public int getQuantaMusica() {
        return quantaMusica;
    }
    public void quantaMusicaTemNoLancamento(int quantidade){
        this.quantaMusica = quantidade;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducao()>2000){
            return 10;
        }else{
            return 7;
        }
    }

    public void nomeDoLancamento(String nome){
        if(quantaMusica <= 3 && quantaMusica > 0){
            this.nomeSingle = nome;
            System.out.println("O nome do single é: "+this.nomeSingle);
        }else if(quantaMusica <= 6 && quantaMusica > 0){
            this.nomeEp = nome;
            System.out.println("O nome do EP é: "+this.nomeEp);
        }else if (quantaMusica >= 7) {
            this.nomeAlbum = nome;
            System.out.println("O nome do álbum é: "+this.nomeAlbum);
        }else{
            System.out.println("Por favor digite um número acima de zero");
        }
    }

    @Override
    public void baixar() {
        this.baixado = true;
        System.out.println("A música "+this.titulo+" foi baixada com sucesso");
    }
}
