package barreto.fillipe.ReprodutorAudio.funcionalidade;
import barreto.fillipe.ReprodutorAudio.audios.Audio;
public class MinhasPreferidas {

    public void inclui(Audio au){
        if(au.getClassificacao()>=9){
            System.out.println(au.getTitulo()+" É um sucesso de popularidade, por que não ouvir agora?");
        }else{
            System.out.println(au.getTitulo()+" É excelente para se ouvir daqui à pouco!");
        }
    }
}
