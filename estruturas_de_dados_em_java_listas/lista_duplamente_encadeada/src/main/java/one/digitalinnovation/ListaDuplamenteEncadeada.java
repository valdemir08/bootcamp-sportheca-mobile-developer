package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);//mas por padrão já é criado como nulo
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;

    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);// ou noAuxiliar.setNoPrevio()
        }else{
            //como a referência null do primeiro nó (primeiroNo.noPrevio) não ocupa o 1° índice então
            // só é possível pegar a referência null do ultimo nó. Ocorrerá quando passar index maior do que existe na lista
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        /*
        Em caso de inserção no index 0 (o primeiroNo vai para index 1),
         este bloco atualiza/indica que o primeiro nó agora é o do índice 0 que fói recentemente inserido
         */
        if (index == 0){
            primeiroNo = novoNo;
        }else{
            //o comando deste bloco obrigatoriamente tem que occorer em um else de "if (index == 0)"
            //Caso ocorrese fora, poderia dar problema na referência nula do nó index 0 (ex: index0.getNoPrevio()),
            // pois como é nulo, não é instância da classe NoDuplo, gerando um erro.
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove (int index){
        if (index ==0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i =0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; i < size(); i++){
            strRetorno += "[No{conteúdo= " + noAuxiliar.getConteudo()+"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
