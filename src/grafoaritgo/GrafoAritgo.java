/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoaritgo;

/**
 *
 * @author andre.ramos
 */
public class GrafoAritgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grafo g = new Grafo();

        for (int i = 1; i <= 100; i++) {
            g.getVertices().add(new Vertice(i));
        }
        System.out.println("g?:"+g.getVertices().size());

        for (int i = 1; i <= 100; i++) {
//            System.out.println("E-"+i);
            if (i > 10) {
                //          System.out.println(("E" + i +""+ (i - 100)));
               Aresta a = new Aresta(g.getById(i),g.getById((i-10)), 1d);
                 System.out.println("O:"+a.getOrigem()+" - "+a.getDestino());
            }

            if (!((i % 10) == 0)) {
                
                Aresta a = new Aresta(g.getById(i),g.getById((i+1)), 1d);
//                g.addEdge("E" + i + "-" + (i + 1), "V" + String.valueOf(i), "V" + String.valueOf(i + 1));
//                g.getEdge("E" + i + "-" + (i + 1)).addAttribute("weight", 1);
            }

        }
//        g.getById(70).getVizinhos().get(1).setPeso(9999d);

//        Vertice v1 = new Vertice("1");
//        Vertice v2 = new Vertice("2");
//        Vertice v3 = new Vertice("3");
//        Vertice v4 = new Vertice("4");
//
//        g.getVertices().add(v1);
//        g.getVertices().add(v2);
//        g.getVertices().add(v3);
//        g.getVertices().add(v4);
//
//        Aresta a1 = new Aresta(v1,v2,1d);
//        Aresta a2 = new Aresta(v1,v3,7d);
//        Aresta a3 = new Aresta(v2,v3,3d);
//        Aresta a4 = new Aresta(v2,v4,9d);
//        Aresta a5 = new Aresta(v3,v4,1d);
//        Aresta a6 = new Aresta(v1,v4,10d);
//        
        Dijkstra dij = new Dijkstra(g, g.getById(50));
        dij.executar();
        
        for(Vertice v:g.getVertices()){
            System.out.println("id:"+v.getId()+" - Custo:"+v.getDiCustoMinimo()+" - Antecessor:"+v.getDiAntecessor());
        }
        
        Vertice destino = g.getById(100);
        Vertice origem  = g.getById(50);
        
        System.out.println("--------Caminho 50-100----------");
        while(!destino.equals(origem)){
            System.out.println("ID:"+destino);
            destino = destino.getDiAntecessor();
        }
        
//        Vertice v = g.getById(50);
        
//        for(Aresta aa:v.getVizinhos()){
//            System.out.println("O:"+aa.getOrigem()+" - "+aa.getDestino());
//        }
        
    }

}
