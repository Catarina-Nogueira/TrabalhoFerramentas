/*
Uma classe é uma representação de uma entidade que serve de modelo para o objeto.
Classes:
- de objeto ou de instância: designam atributos para cada objeto
- de classe ou estáticas: não precisam de criar objetos
- locais

*/
public class Cilindro {

        private double altura;
        private double raio; /*o uso do modificador de acesso private permite o encapsulamento da classe - não se acede diretamente
        Definição de encapsulamento: Capacidade de ocultar o estado interno e as funcionalidades de um objeto permitindo apenas o acesso através de um conjunto público de métodos.

*/
        //atributos com o mesmo conjunto de comportamentos
        //o que distingue dois objetos da classe é o valor dos atributos dos objetos - o estado dos objetos


        public Cilindro(double altura, double raio) {
                this.altura = altura;
                this.raio = raio;
        }

        public Cilindro() {
                this.altura = 0;
                this.raio = 0;
        }

        public double getRaio() { // método de acesso que permite aceder aos valores dos atributos
                return raio;
        }

        public double getAltura() { //método de acesso
                return altura;
        }

        public void setRaio(double raio) { //método de modificação
                this.raio = raio;
        }

        public void setAltura(double altura) {
                this.altura = altura; // "this" é uma referência para o próprio objeto - "este objeto" - para evitar ambiguidade, para não usar o this, pode-se mudar o nome da variável passada por parâmetro
        }

        public double calcularVolume(){ //não leva valores por parâmetro porque usa os valores dos atributos
                return Math.PI * Math.pow(raio,2) * altura;
                //ou também se pode criar uma variável local vol apenas return vol = Math.PI * Math.pow(raio,2) * altura; return vol;
        }

        //estes três métodos get e set e calcularVolume são métodos de instância que variam consoante a situação

}
