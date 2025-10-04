public class CodeChadsAcademy {
    public static void main(String[] args) {
        //PRIMERA PARTE
        int[] puntajes = new int[5];  
        puntajes[0] = 75; //nota 1
        puntajes[1] = 85; //nota 2
        puntajes[2] = 65; //nota 3
        puntajes[3] = puntajes[1]<60 ? 100 : puntajes[1]; //nota 4
        int suma = puntajes[0]+puntajes[2];
        puntajes[4] = suma > 150 ? 95 : 70; //nota 5
        System.out.println("Notas: "+puntajes[0]+" "+puntajes[1]+" "+puntajes[2]+" "+puntajes[3]+" "+puntajes[4]);

        //2da PARTE. 
        //Pto1
        int aprobadas = 0;
        for (int i=0; i<puntajes.length ; i++ ) {
            if(puntajes[i]>=60){
                aprobadas +=1;
            }
        }
        System.out.println("Cantidad aprobada: " + aprobadas);
        if (aprobadas==5){
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (aprobadas==0){
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }

        //Pto2
        int mayorVariacion = 0;
        int posicion = 0;
        for (int i = 0; i < puntajes.length - 1; i++) {
            int diferencia = Math.abs(puntajes[i + 1] - puntajes[i]);
            if (diferencia > mayorVariacion) {
                mayorVariacion = diferencia;
                posicion = i;
            }
        }
        System.out.println("Mayor salto fue de "+mayorVariacion+" puntos entre la prueba "+(posicion+1)+" y la prueba "+(posicion+2));
/* 
        //Pto3
        int mejorNota = puntajes[0];
        for (int i=1; i<puntajes.length ; i++ ){
            if (mejorNota<=puntajes[i]){
                mejorNota=puntajes[i];
            } else {
                break;
            }
            if (i==4){
                System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
            }
        }
        
        //Pto4

        //Pto5 
        int total = puntajes[0]+puntajes[1]+puntajes[2]+puntajes[3]+puntajes[4];
        if (total<250){
            System.out.println( "Normie total 😢");
        } else if (total>=250 && total<=349) {
            System.out.println("Soft Chad");
        } else if (total>=350 && total<=449) {
            System.out.println("Chad");
        } else if (total>=450) {
            System.out.println("Stone Chad definitivo 💪");
        }*/
    } 
        
}

