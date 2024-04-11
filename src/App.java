import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Defina o limite de Alunos total: ");
        int limite = scan.nextInt();

        Pilha PE_1 = new Pilha(limite);
        Pilha PE_2 = new Pilha(limite);

        System.out.println("Agora, informe os dados dos Alunos!");
        
        boolean voltar = false;
        boolean rodando = true;
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

            if(sexo.toLowerCase().equals("masculino")){

                PE_2.push(aluno);

            }else{

                PE_1.push(aluno);

            }
            
            System.out.println("Aluno inserido com sucesso!\n");

            i++;
        }

        while(rodando){
            System.out.println("\n\n\n\n\n\n\n\n");

            System.out.println("Escolha qual pilha manipular: ");
            System.out.println("1 - PE_1 : Alunas cadastradas");
            System.out.println("2 - PE_2 : Alunos cadastrados");
            int escolha = scan.nextInt();
            System.out.println("\n\n");

            Pilha aux = new Pilha(limite);
            if(escolha == 1){

                aux = PE_1;
                

            }else if(escolha == 2){

                aux = PE_2;

            }else{

                System.out.println("Opção Invalida!");

            }

            while (!voltar) {
                
                System.out.println("Selecione uma das opções a baixo: ");
                System.out.println("1 - pop");
                System.out.println("2 - isEmpty");
                System.out.println("3 - isFull");
                System.out.println("4 - top");
                System.out.println("5 - sair");
                System.out.println("\n\n");

                int escolha_pilha = scan.nextInt();

                switch (escolha_pilha) {
                    case 1:

                        System.out.println("\n\n");
                        System.out.println(aux.pop());
                        System.out.println("\n\n");
                        break;
                
                    case 2: 

                        System.out.println("\n\n");
                        System.out.println(aux.isEmpty());
                        System.out.println("\n\n");
                        break;
                
                    case 3: 

                        System.out.println("\n\n");
                        System.out.println(aux.isFull());
                        System.out.println("\n\n");
                        break;
                
                    case 4: 

                        System.out.println("\n\n");
                        System.out.println(aux.top());
                        System.out.println("\n\n");
                        break;
                
                    case 5: 

                        voltar = true;
                        break;

                }

            }


            System.out.println("\n\n Para encerrar o programa, digite 'sim': ");
            String sair = scan.next();

            if(sair.toLowerCase().equals("sim")){

                rodando = false;

            }else{

                voltar = false;

            }

        }
        

        System.out.println("\n\n");
        System.out.println("Fim do programa");

    }
}
