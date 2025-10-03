public class CodeChadsAcademy {
    public static void main(String[] args) {
        int[] puntajes = new int[5];  
        puntajes[0] = 15; //nota 1
        puntajes[1] = 43; //nota 2
        puntajes[2] = 55; //nota 3
        puntajes[3] = puntajes[1] < 60 ? 100 : puntajes[1];
        int suma = puntajes[0]+puntajes[2];
        puntajes[4] = suma > 150 ? 95 : 70;
        System.out.println(puntajes[3]);
        System.out.println(puntajes[4]);
    } 
        /*int total = 0;
        for (int i = 0; i < 3; i++) { 
            total += puntajes[i]; 
        } 
        System.out.println("Puntos acumulados hasta ahora: " + total);*/
}

