package org.example;

public class Main {
    public static void main(String[] args) {
        Fighters[] f = new Fighters[6];

        f[0] = new Fighters("Kauan Cândido", "Rússia", 20, 1.74f, 85.3f, 10, 0, 2);
        f[1] = new Fighters("Diogo Bonetti", "Brasil", 21, 1.76f, 90.5f, 3, 3, 4);
        f[2] = new Fighters("Yago Oliveira", "Argélia", 22, 1.72f, 68.7f, 2, 5, 3);
        f[3] = new Fighters("Geisson Fernandes", "Romênia", 27, 1.87f, 105.6f, 7, 2, 1);
        f[4] = new Fighters("Ruhan Cimolin", "Singapura", 34, 1.73f, 102.3f, 1, 6, 3);
        f[5] = new Fighters("Adriano Mello", "Alemanha", 42, 1.84f, 95.6f, 8, 0, 3);

    }
}