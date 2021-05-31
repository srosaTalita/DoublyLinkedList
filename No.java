package com.mycompany.listaduplamenteencandeada;

public class No {
    
    private Object data;
    private No proximo;
    private No anterior;
    
    public No() {
        this.data = data;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }           

}
