import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Defina o limite de Alunos total: ");
        int limite = scan.nextInt();

        Pilha PE_1 = new Pilha(limite);
        Pilha PE_2 = new Pilha(limite);

        System.out.println("Agora, informe os dados dos Alunos!");
        int i = 0;
        while(i < limite) {

            
            System.out.println("Nome: ");
            String name = scan.next();

            
            System.out.println("Sexo: ");
            String sexo = scan.next();

            
            System.out.println("Matricula: ");
            int matricula = scan.nextInt();


            Aluno aluno = new Aluno();
            aluno.setNome(name);
            aluno.setSexo(sexo);
            aluno.setMatricula(matricula);

            if(sexo.toLowerCase() == "masculino"){

                PE_2.push(aluno);

            }else{

                PE_1.push(aluno);

            }
            
            System.out.println("Aluno inserido com sucesso!\n");

            i++;
        }

        System.out.println("Fim do programa");

    }
}
