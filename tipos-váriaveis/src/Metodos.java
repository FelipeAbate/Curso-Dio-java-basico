public class Metodos {
    public static void main(String[] args) {
        /*
         Classe:

          - atributos: em sua grande maioria, váriaveis de diferentes tipos e valores
          - métodos: funções ou sub-rotinas disponiveis dentro de nossas classes
        
          
          Critério de nomeação de Métodos:

          - Deve ser nomeado como verbo
          - Seguir o padrão camelCase

          Exemplos:
         
          somar (int n1, n2) {}  
          somar é o nome do método, e (int n1, n2) são os parametros

          concluirProcessamento() {} 
          Não há parametros mas tem uma boa descrição de qual sua finalidade

          calcularImprimir() {} 
          calcula ou imprime? esse tipo de descrição não é boa prática
          O método deve ter uma única responsabilida nesse caso calcula 
          ou imprime. Cria se então um método ->         calcular() {}
                                      e outro ->         imprimir() {}          

         Não existe em Java o conceito de métodos globais. Todos os métodos
         devem SEMPRE ser definidos dentro de uma classe.
         

         public double somar somar (int n1, n2) {

          //código..
         
          return...;
         } 
         public: aparece em todo sistema.
         double: tipo de valor a ser retornado
         int n1, n2:   recebe o valor
         return: retorna alguma informação

         public void imprimir (String texto) {

             //código..
         
         } 
         void: não retorna nada

         throus Exception: indica que o método ao ser utilizado poderá gerar
         uma exceção

         public double(int dividendo, int divisor) throus Exception {}
         // Imagine que o usuário digite 0, esse método ao ser chamado deve estar
         preparado pra tratar essa exceção
         

         método privado não pode ser visto por outras classes
         private void metodoPrivado(){}


         //alguns equívocos estruturais
         public void validar(){

          //esse método deveria  retornar algum valor
          //no caso boolean (true ou false)

         }

         public void gravarCliente( String nome, String cpf, int idade ){
            //este método tem a finalidade de gravar  
            //informações de um cliente por que não criar
            //um objeto cliente e passar como parâmetro?
            //veja abaixo
         }
         public void gravarCliente(Cliente cliente){}
         //ou
         public void gravar(Cliente cliente){}

         */

    }
}
