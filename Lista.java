
package com.mycompany.listaduplamenteencandeada;

public class Lista {
    
    private No inicio;
    private No fim;

    public Lista() {
        this.inicio = null;
        this.fim = null;
    }
    
    public void insereInicio(Object data){
        if(inicio == null){
            inicio = new No();
            inicio.setData(data);
            fim = inicio;
            fim.setProximo(null);
        }
        else{
            No aux = new No();
            aux.setData(data);
            aux.setProximo(inicio);
            inicio.setAnterior(aux);
            inicio = aux;
            inicio.setAnterior(null);
        }
    }
    
    public int size(){
        int count = 0;

        if(inicio == null)
            return count;

        for (No n = inicio; n != null; n = n.getProximo()) {
            count++;
        }
        return count;
    }
        
    public Object remove(Object data){
        No aux = inicio;
        int contador = 0;
        while(true){
            
            if(aux.getData() == data){ // remove no início
                No dead = aux;
                inicio = inicio.getProximo();
                return dead;
            }
            
            aux = aux.getProximo();
            contador ++;
            
            if (aux.getData() == data) {
                
                if(contador == size()){ // remover o último
                    No dead = aux;
                    fim = fim.getAnterior(); // dado atual vira dado anterior
                    fim.setProximo(null); // anterior seta  proximo null 
                    return dead;
                }
                
                else{
                No dead = aux; // Só salva o dado morto para retornar
                No next = aux.getProximo(); //Pega o próximo dado do dado morto
                aux = aux.getAnterior(); // pega o dado anterior ao dado morto
                aux.setProximo(next); //anterior seta o próximo ao dado morto
                return dead;
                }
                
            }
        }

    }
    
    /*
    A diferença entre lista encadeada para lista duplamente encadeada 
    está na adição da referência anterior na lista duplamente 
    encandeada.
    Os métodos de remoçãos são iguais, a diferença esta que na lista simples 
    percorre-se a lista até encontrar o nó anterior ao que vai ser removido, 
    na lista duplamente encandeada não é necessário.
    E nos metódos de inserção na lista duplamente encandeada além de referenciar
    o próximo também referencia-se o anterior.   
    */
    
    
    public void mostraIF(){
        No aux = inicio;
        while(aux != null){
            System.out.print(aux.getData());
            aux = aux.getProximo();
        }
    }
    
    public void mostraFI(){       
        No aux = fim;
        while(aux != null){
            System.out.print(aux.getData());
            aux = aux.getAnterior();
        }
    }
    
    public static void main(String[] args) {
        /*Lista lista = new Lista();
        lista.insereInicio("H");
        lista.insereInicio("a");
        lista.remove("a");
        lista.mostraIF();*/
    }
    
}
