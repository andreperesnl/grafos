/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoaritgo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andre.ramos
 */
public class Dijkstra {

    public Grafo grafo;
    public Vertice origem;
    public Set<Vertice> verticesVisitados;
    public Set<Vertice> verticesNaoVisitados;

    public Dijkstra(Grafo grafo, Vertice orig) {
        this.grafo = grafo;
        origem = orig;
        origem.setDiCustoMinimo(0d);

    }

    public void executar() {
        verticesVisitados = new HashSet<Vertice>();
        verticesNaoVisitados = new HashSet<Vertice>();
        verticesNaoVisitados.add(origem);
        while (!verticesNaoVisitados.isEmpty()) {
            Vertice min = getMenor(verticesNaoVisitados);
            encontrarDistanciaMinima(min);
            verticesVisitados.add(min);
            verticesNaoVisitados.remove(min);
        }

    }

    public Vertice getMenor(Set<Vertice> vertices) {
        Vertice minimo = null;
        for (Vertice v : vertices) {
            if (minimo == null) {
                minimo = v;
            }
            if (v.getDiCustoMinimo() < minimo.getDiCustoMinimo()) {
                minimo = v;
            }
        }
        return minimo;
    }

    public void encontrarDistanciaMinima(Vertice v) {
        for (Aresta adjacente : v.getVizinhos()) {

            if (verticesVisitados.contains(v)) {
                break;
            }
            if (adjacente.getVizinho(v).getDiCustoMinimo() > (v.getDiCustoMinimo() + adjacente.getPeso())) {
                adjacente.getVizinho(v).setDiAntecessor(v);
                adjacente.getVizinho(v).setDiCustoMinimo((v.getDiCustoMinimo() + adjacente.getPeso()));
//                adjacente.getVizinho(v).setDiAntecessor(v);
            }
            verticesNaoVisitados.add(adjacente.getVizinho(v));

        }
    }

}
