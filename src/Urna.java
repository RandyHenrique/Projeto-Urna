package src;

import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {


        Partido partido1 = new Partido("PSL", "202020202");
        Partido partido2 = new Partido("PT", "202020202");
        Partido partido3 = new Partido("PSOL", "19051993");

        Candidato candidato1 = new Candidato("Niedson", "33", 17, partido1);
        Candidato candidato2 = new Candidato("João", "30", 13, partido2);
        Candidato candidato3 = new Candidato("Randerson", "29", 50, partido3);

        Candidato[] candidatos = new Candidato[3];

        candidatos[0] = candidato1;
        candidatos[1] = candidato2;
        candidatos[2] = candidato3;


        var rerpetir = true;

        while (rerpetir) {
            System.out.println("Digite o numero do candidato que você quer votar");
            Scanner teclado = new Scanner(System.in);
            var voto = teclado.nextInt();

            boolean votou = false;

            for (int i = 0; i < candidatos.length; i++) {

                if (candidatos[i].getNumero() == voto) {
                    candidatos[i].setQtdVotos();
                    System.out.println("voce votou em: " + candidatos[i].getNome());
                    votou = true;
                    break;
                } else if (i == 2) {
                    System.out.println("numero invalido");
                }
            }


            System.out.println("Deseja sair \nS - sim\nN- não");
            var sair = teclado.next().charAt(0);
            if (sair == 's' || sair == 'S') {
                rerpetir = false;


                var totalVotos = candidatos[0].getQtdVotos()+candidatos[1].getQtdVotos()+candidatos[2].getQtdVotos();


                if(candidatos[0].getQtdVotos()>candidatos[1].getQtdVotos() && candidatos[0].getQtdVotos()>candidatos[2].getQtdVotos()){
                    System.out.println("O candidato "+ candidato1.getNome()+" ganhou a eleição com "+candidato1.getQtdVotos()+" votos "+ (candidato1.getQtdVotos()*100)/ totalVotos+"%");
                }
                if(candidatos[1].getQtdVotos()>candidatos[0].getQtdVotos() && candidatos[1].getQtdVotos()>candidatos[2].getQtdVotos()){
                    System.out.println("O candidato "+ candidato2.getNome()+" ganhou a eleição com "+candidato2.getQtdVotos()+" votos "+ (candidato2.getQtdVotos()*100)/ totalVotos+"%");
                }
                if(candidatos[2].getQtdVotos()>candidatos[1].getQtdVotos() && candidatos[2].getQtdVotos()>candidatos[0].getQtdVotos()){
                    System.out.println("O candidato "+ candidato3.getNome()+" ganhou a eleição com "+candidato3.getQtdVotos()+" votos "+ (candidato3.getQtdVotos()*100)/ totalVotos+"%");
                }

            }
        }

    }

}
