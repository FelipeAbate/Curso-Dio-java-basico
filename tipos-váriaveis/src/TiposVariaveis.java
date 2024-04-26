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
      System.out.println("\n");



      //-----------------------------------------------------------------------------
      // Operador Unário -> Eles realizam alguns trabalhos básicos como 
      //incrementar, decrementar, inverter valores numéricos e booleanos
      
      int numero = 5;  
                  
      
      numero = - numero;        // a variável é negativa !
      System.out.println(numero);

      numero = + numero;       // voltarei-o a positivo, naõ é assim !
      System.out.println(numero);                         // faça
       
       numero = numero * -1 ;          // agora voltou a ser positivo !
       System.out.println(numero);


       //decremento , incremento
       System.out.println("\n");
       
       System.out.println(numero++); // incrementação após "numero++"
                                     // recebe +1 porém exibe desatualizada
      // de outro 
      System.out.println(numero);   // e ela exibirá atualizada                         

       System.out.println(++numero); // incrementação antes recebe +1 e ja imprime-a
                                    //  atualizada

      System.out.println("\n O mesmo vale para decremento"); 
      System.out.println(numero--); 
      System.out.println(numero);   

      System.out.println(--numero); 

      System.out.println("\n");
      // - operador !   (negação)    
      // inverter uma variável do tipo boolean

      boolean var = true;
      System.out.println(var);

      var = !var; // negue-a
      System.out.println(var);

       
      System.out.println("\n");
      /*------------------------------------------------------------------------------
        Operador Ternário -> ?   
        Resumo: 
        -sintaxe: <Expressão condicional> ? <caso seja true> : <caso seja false>
        -define uma condição dentre dois valores
        -Como se fosse um IF..porém de uma forma que sua toda sua estrutura estará 
        escrita numa única linha             
      */

      int a = 5;
      int b = 6;

      //  pode usar String ou int, fica a seu critério
      //  Ex:
      //   String resultado = a==b ? "true" : "false";
      //   int resultado = a==b ? 1 : 0;
      
      // Mas usarei uma boolean
      boolean resultado = a==b ? true : false;
      System.out.println("Result:" + resultado);


      System.out.println("\n");
      /*------------------------------------------------------------------------------
        Operador Relacionais -> ?   
        Resumo: 
          <
          >
          <=
          >=
          !=             
      */
     
      int num1 = 5;
      int num2 = 6;

    System.out.println(num1 == num2);  // EX: não criei uma boolean, simplesmente..
                                        // o compilador verificou se é igual !
                                         // e automaticamente me retornou FALSE

    if (num1 == num2) { System.out.println("Verdade"); } // outro ex com IF ELSE
    else              { System.out.println("Falso");   }
           
    boolean  diferente = num1 != num2;                     // EX: com boolean
    System.out.println("num1 é diferente a num2 ? " + diferente);

    System.out.println(num1 > num2);

    System.out.println(num1 < num2);

    System.out.println(num1 <= num2);
    System.out.println("num1 não é igual a num2, se é menor? sim, é menor.");

    boolean  maiorOuIgual = num1 >= num2;
    System.out.println("num1 é maior ou igual a num2 ? " + maiorOuIgual + ", num1 não é igual nem maior a num2, é menor");
    
    
    System.out.println("\n");
    // Precisamos compreender que nem sempre estamos falando de números em nossas
    // comparações, as vezes queremos comparar textos, objetos etc
    
    /* 
    String frase1 = "testa se é igual";
    String frase2 = "testa se é igual";
    System.out.println(frase1==frase2); // ok, o comp retorna true, afinal é true (são iguais)
    */


    // agora imagine, se
    String frase1 = "testa se é igual";
    String frase2 = new String ("testa se é igual"); //criando um novo objeto
    System.out.println(frase1==frase2); //o comp retorna false, mas o conteudo são iguais, não?

    /*
     nesse caso o que pode acontecer é que agora temos 2 objetos na memória, 
     quando estamos falando de numeros a linguagem java tem uma compreensão que 
     os números vão para um espaço em memória, quando estamos falando de objetos 
     esses valores são aplicados em uma outra estrutura...
    */

    // o que faço então? uso  .equals
    System.out.println(frase1.equals(frase2));

    // para numeros podemos usar os operadores relacionais
    // mas para objetos é interessante usar ->     .equals


}
}
