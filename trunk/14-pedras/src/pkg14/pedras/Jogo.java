/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.pedras;

/**
 *
 * @author raissa
 */
import java.util.LinkedList;

public class Jogo {

    int N = 3;
    int M = 5;
    int[][] quadros;

    public Jogo() {
        this.quadros = new int[N][M];
        int i, j, aux;
        int posX = random(0, N - 1, new LinkedList<Integer>());
        int posY = random(0, M - 1, new LinkedList<Integer>());
        LinkedList<Integer> selecionados = new LinkedList();
        for (i = 0; i < this.quadros.length; i++) {
            for (j = 0; j < this.quadros[i].length; j++) {
                if (i != posX || j != posY) {
                    aux = random(1, (N * M)-1, selecionados);
                    selecionados.push(aux);
                    this.quadros[i][j] = aux;
                }
            }
        }
    }

    @Override
    public String toString() {
        String resposta = "";
        int i, j;
        for (i = 0; i < this.quadros.length; i++) {
            for (j = 0; j < this.quadros[i].length; j++) {
                resposta += "[";
                if (this.quadros[i][j] < 10) {
                    resposta += " ";
                }
                if (this.quadros[i][j] != 0) {
                    resposta += this.quadros[i][j];
                } else {
                    resposta += " ";
                }
                resposta += "]";
            }
            resposta += "\n";
        }
        return resposta;
    }

    private static Integer random(int min, int max, LinkedList<Integer> ignore) {
        Integer i = (int) Math.round(Math.random() * 50);
        while (i < min || i > max || ignore.contains(i)) {
            i = (int) Math.round(Math.random() * 50);
        }
        return i;
    }
}
