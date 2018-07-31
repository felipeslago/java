package jse24_concurrency;

public class ImmutableObjects {

    /**
     * Uma maneira de lidar com a consistencia de objetos usando concorrencia eh a criacao de objetos imutaveis
     *
     * Objetos imutaveis nao mudam seu estado apos serem criados, garantindo a integridade do objeto ao ser acessado por
     * mais de uma thread
     *
     * Para tornar um objeto imutavel pode-se definir uma classe como final (impedindo que seus metodos sejam
     * reescritos), definir seus atributos como final e private (fazendo com que sejam definidos apenas na criacao do
     * objeto), nao criando setters e quando for necessario uma alteracao, devolver um novo objeto (como no metodo
     * changeName)
     */

    static final class Work {

        final private String name;

        public Work(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Work changeName(String name) {
            return new Work(name);
        }
    }

    public static void main(String[] args) {
        Work work1 = new Work("Test1");

        System.out.println(work1.getName());

        Work work2 = work1.changeName("Test2");

        System.out.println(work2.getName());
    }

}
