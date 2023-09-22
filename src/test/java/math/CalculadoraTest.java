package math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
/* Por padrão temos que colocar o nome da classe teste igual ao da classe que estamos testando e adicionar o 'Test'
* Sobre o método a seguir, temos que basicamente dar o nome da função do método que iremos testar.
* por convensão é tudo escrito em inglês*/

    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(20, 35);
        Assertions.assertEquals(55, soma);
    }
/* Assertions.assertEquals() faz a comparação do valor esperado com o valor retornado do método que está testando. */

    @Test
    public void verificaSeEPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaSeEPar(2222232);
        Assertions.assertTrue(verifica);
    }
}
