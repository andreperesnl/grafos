/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoaritgo;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author andre.ramos
 */
public class Vertice {

    private Integer id;
    private Vertice diAntecessor;
    private Double diCustoMinimo;
    private List<Aresta> vizinhos;

    public Vertice(Integer id) {
        this.id = id;
        diCustoMinimo = Double.POSITIVE_INFINITY;
        vizinhos = new LinkedList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vertice getDiAntecessor() {
        return diAntecessor;
    }

    public void setDiAntecessor(Vertice diAntecessor) {
        this.diAntecessor = diAntecessor;
    }

    public Double getDiCustoMinimo() {
        return diCustoMinimo;
    }

    public void setDiCustoMinimo(Double custoMinimo) {
        this.diCustoMinimo = custoMinimo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Vertice other = (Vertice) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public List<Aresta> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<Aresta> vizinhos) {
        this.vizinhos = vizinhos;
    }

    @Override
    public String toString() {
        return "Vertice{" + "id=" + id + '}';
    }

}
