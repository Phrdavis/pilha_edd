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
    
        topo++;
        alunos[topo] = aluno;

    }

    public Aluno pop(){

        Aluno aluno = new Aluno();

        aluno = alunos[topo];
        topo--;
        return aluno;

    }

    public boolean isEmpty(){

        return (topo == -1);

    }

    public boolean isFull(){

        return (topo == limite -1);

    }

    public Aluno top(){

        return alunos[topo];

    }

}
