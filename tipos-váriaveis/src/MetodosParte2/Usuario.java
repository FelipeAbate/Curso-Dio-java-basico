package MetodosParte2;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();

        System.out.println("TV Ligada? : " + smarTv.ligada);
        System.out.println("Canal Atual? : " + smarTv.canal);
        System.out.println("Volume Atual : " + smarTv.volume);
        
        smarTv.ligar();
        System.out.println("\nNovo Status -> TV Ligada? : " + smarTv.ligada);
                               
        smarTv.mudarCanal(13); //usuario digita o canal
        System.out.println("Novo Status -> Canal Atual? : " + smarTv.canal);

        smarTv.diminuirVolume (); // diminuindo volume para 24
        smarTv.diminuirVolume (); // diminuindo para 23
        smarTv.diminuirVolume (); // diminuindo para 22
        smarTv.aumentarVolume (); // aumentando volume para 24
        System.out.println("Novo Status -> Volume Atual : " + smarTv.volume);

        smarTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : " + smarTv.ligada +"\n");
    }
}
