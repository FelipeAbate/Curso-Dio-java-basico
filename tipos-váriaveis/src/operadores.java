public class operadores {
    public static void main(String[] args) {
        //Expressão aritimética resto da divisão em java:  x / y = resto   

      int module = 20 % 3;
      System.out.println("resto -> " + module); 


      // obs: o operador + quando usado em strings une-as
      String palavra1 = "CONCATENE palavra 1";
      String palavra2 = "com a palavra 2";
       
      System.out.println(palavra1 + palavra2); 

      // veja as diferenças
      String concatenacao = "?";
      System.out.println(concatenacao); 

      concatenacao = 1+1+1+"1";         // soma e imprime e assim exibe
      System.out.println(concatenacao);

      concatenacao = 1+"1"+1+1;        // soma, pega valor impresso, volta a somar
      System.out.println(concatenacao);// e nessa sequencia exibe

      concatenacao = 1+"1"+1+"1";      // compreenda as outras opções!
      System.out.println(concatenacao);

      concatenacao = "1"+1+1+1;
      System.out.println(concatenacao);

      concatenacao = "1"+(1+1+1);
      System.out.println(concatenacao);

    }
}
