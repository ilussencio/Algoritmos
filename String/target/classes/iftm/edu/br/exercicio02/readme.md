Instruções

(Nesse exercício deverão utilizar funções, a estrutura da função é dada no Modelo)

Faça um programa em Java que recebe o valor double 'custo' e uma String 'cidade'. Faça o seguinte processamento:

    Caso a 'cidade' seja igual a Uberlandia, então imprima "O custo de vida em Uberlandia e R$ 'custo'";
    Caso a 'cidade' seja igual a Brasilia, então dobre o valor de 'custo' e imprima "O custo de vida em Brasilia e R$ 'custo'";
    Caso seja outra cidade, então divida o valor de 'custo' por 2 e imprima "O custo de vida em 'cidade' e R$ 'custo'".

Crie uma função que faça o ajuste do custo, ela deve receber como parâmetro o 'custo' e a 'cidade', e retornar o valor de 'custo' ajustado segundo as regras acima.

Observação:

    Você precisa tratar as duas casas decimais após o ponto.

    System.out.printf("%.2f", custo);    
      //ou
    System.out.println(String.format("%.2f", custo));

    Capturar um número depois um texto gera o problema de buffer do teclado, solução insira um Scanner.nextLine() entre as linhas, solução no modelo. Não considere acento.

Entradas: Um número real correspondente ao custo de vida e um texto contendo o nome da cidade.