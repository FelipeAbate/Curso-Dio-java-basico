public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


// java é fotemente tipado !


short numeroCurto = 1; 
int numeroNormal = numeroCurto; // Por mais que esse numero seja igual a 1
                                // em algum momento ele pode ser maior que 32.000 que 
                                // o tamanho q short comporta

                                // mude numeroCurto2 para int ou então use o recurso cast
short numeroCurto2 = (short) numeroNormal; //neste caso usamos cast
                                // cast pega um numero especifico e transforma para
                               // o numero correspondente
System.out.println(numeroCurto + " - " + numeroNormal + " - " + numeroCurto2);


 //  Sobre constantes : declarada em caixa alta com a palavra 
   // reservada final antes de declarar o nome da variavel

      final double VALOR_PI = 3.14;
      System.out.println(VALOR_PI );

      // em outra linguagem voce faria assim:  double VALOR_PI = 3.14; ?
      // ou assim final double valor_pi = 3.14; ?
      // isso em java não funciona ! faça: final double VALOR_PI = 3.14; 
    }
}
