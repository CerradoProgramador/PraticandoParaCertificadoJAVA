package semanaNumeroUM;

public class desafioLivroWhileOuter {
    public static void main(String[] args) {

        int age = 13;
        outer:
        while(age <= 21){
            ++age;
                while (age == 16) {
                    System.out.println("Qual a sua licença de motorista? DIGITE O ID: ");
                    continue outer;
                }
            System.out.println("Another Year");

        }

    }

}
