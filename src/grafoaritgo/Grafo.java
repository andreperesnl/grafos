/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoaritgo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author andre.ramos
 */
public class Grafo {

    private List<Vertice> vertices;

    public Grafo() {
        vertices = new LinkedList<>();
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public Vertice getById(Integer id) {
//        System.out.println("GetById:"+id);
        for (Vertice v : vertices) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}
