public class CodeChadsAcademy {
    public static void main(String[] args) {
        //PRIMERA PARTE
        int[] puntajes = new int[5];  
        puntajes[0] = 75; //nota 1
        puntajes[1] = 85; //nota 2
        puntajes[2] = 85; //nota 3
        puntajes[3] = puntajes[1]<60 ? 100 : puntajes[1]; //nota 4
        int suma = puntajes[0]+puntajes[2];
        puntajes[4] = suma > 150 ? 95 : 70; //nota 5
        System.out.println("Notas: "+puntajes[0]+" "+puntajes[1]+" "+puntajes[2]+" "+puntajes[3]+" "+puntajes[4]);

        //2da PARTE. Pto1
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

        //2da PARTE. Pto2

        //2da PARTE. Pto3
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
    
        
    } 
        
}

