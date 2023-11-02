package barreto.fillipe.ReprodutorAudio.principal;

import barreto.fillipe.ReprodutorAudio.audios.Musica;
import barreto.fillipe.ReprodutorAudio.audios.Podcast;
import barreto.fillipe.ReprodutorAudio.funcionalidade.MinhasPreferidas;

public class Principal {
    public static void main(String[] args) {

        Musica moon = new Musica();
        moon.setTitulo("Moon");
        moon.setDuracao(5);
        moon.quantaMusicaTemNoLancamento(12);
        moon.nomeDoLancamento("Biophilia");
        moon.setGenero("Pop");
        System.out.println(moon.getTitulo());
        for (int i = 0; i < 5000; i++) {
            moon.ouvir();
        }

        for (int i = 0; i < 2000; i++) {
            moon.curtir();
        }

        System.out.println(moon.getTotalReproducao());
        System.out.println(moon.getCurtidas());
        moon.baixar();
        System.out.println(moon.getBaixado());
        System.out.println(moon.getGenero());
        moon.getClassificacao();




        Podcast geekCast = new Podcast();
        geekCast.setTitulo("Geekcast");
        geekCast.setHost("Marcos");
        geekCast.setDescricao("Podcast de cultura nerd e geek");
        for(int i =0;i<=800;i++){
            geekCast.curtir();
        }
        geekCast.getClassificacao();



        MinhasPreferidas preferido = new MinhasPreferidas();
        preferido.inclui(geekCast);
        preferido.inclui(moon);
    }
}