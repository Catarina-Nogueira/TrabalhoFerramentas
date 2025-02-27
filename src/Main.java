/* Paradigma de Programação orientada ao Objeto - modelo sequencial de programação
Tem como base pensar e caracterizar um objeto.

Um objeto é uma entidade física e única, conceptual do munfo real.

A interação entre objetos dá-se através de um dispositivo de mensagens. Um objeto envia (objeto emissor) a mensagem a um objeto (recetor) para que este execute o pedido que lhe foi diretamente dirigido.

Deste modo um objeto traz consigo atributos (variáveis) privados e funcionalidades / comportamentos (métodos).

Atenção, os métodos não devem ter System.out.print

A instaciação do objeto segue sempre o modelo: Nome da classe   Nome do objeto  =  new    Nome da Classe ();

*/
public class Main {
    public static void main(String[] args) {
        Cilindro cili1= new Cilindro(); // instanciar o objeto - criação do objeto da classe Cilindro; o "c1" é uma variável local ao método main
        Cilindro cili2 = new Cilindro();
        double v1;
        double v2;

        cili1.setRaio(5);
        cili1.setAltura(10); //refência para o objeto "c1" sobre o método de instância set
        v1 = cili1.calcularVolume();

        cili2.setRaio(4);
        cili2.setAltura(16); //refência para o objeto "c2" sobre o método de instância set
        v2 = cili2.calcularVolume(); //invocação de métodos

        System.out.println("Volume de c1: " + v1);
        System.out.println("Volume de c2: " + v2);
    }
}
