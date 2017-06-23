/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoaritgo;

import java.util.Objects;

/**
 *
 * @author andre.ramos
 */
public class Aresta {

    private Vertice origem;
    private Vertice destino;
    private Double peso;

    public Aresta(Vertice origem, Vertice destino, Double peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
        origem.getVizinhos().add(this);
        destino.getVizinhos().add(this);
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.origem);
        hash = 53 * hash + Objects.hashCode(this.destino);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aresta other = (Aresta) obj;
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return true;
    }

    public Vertice getVizinho(Vertice v) {
        return destino.equals(v) ? origem : destino;
    }

}
