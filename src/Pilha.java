import java.util.Arrays;

public class Pilha {
    
    Aluno alunos[];
    int limite;
    int topo;

    public Pilha(int limite){

        this.limite = limite;
        alunos = new Aluno[limite];
        topo = -1;

    }

    public void push(Aluno aluno){
    
        if(topo < limite){

            topo++;
            alunos[topo] = aluno;
            
            System.out.println("Aluno inserido");

        }else{

            System.out.println("Pilha já esta cheia");

        }

    }

    public Aluno pop(){

        Aluno aluno = new Aluno();

        if(!isEmpty()){

            aluno = alunos[topo];
            alunos[topo] = null;
            topo--;
            return aluno;

        }else {
            System.out.println("A pilha está vazia!");
            return null;
        }


    }

    public boolean isEmpty(){

        return (topo == -1);

    }

    public boolean isFull(){

        return (topo == limite -1);

    }

    public Aluno top(){
        
        if (!isEmpty()) {
            return alunos[topo];
        } else {
            System.out.println("A pilha está vazia!");
            return null;
        }

    }

    @Override
    public String toString() {
        return "Pilha [alunos=" + Arrays.toString(alunos) + ", limite=" + limite + ", topo=" + topo + "]";
    }

   
}
