package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;//Nó que foi popado/retirado
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            //aplicando entrada da pilha a referencia do segundo No, assim, o popado perde o lugar na pilha
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
        //apenas retorna a referência do topo
    }

    public boolean isEmpty(){
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true :false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------------\n";
        stringRetorno += "        Pilha\n";
        stringRetorno += "-----------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=======================\n";
        return stringRetorno;
    }
}
