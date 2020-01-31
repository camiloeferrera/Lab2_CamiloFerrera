package lab2_camiloferrera;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lab2_CamiloFerrera {

    public static void main(String[] args) {        
        Scanner leer = new Scanner (System.in);
        Random rand = new Random ();
        ArrayList<Personaje> personajes = new ArrayList();
        personajes.add(new Personaje("Camilo","Mago","Humano","Es malisimo en java", "Norfair",(1.72),50,19));
        personajes.add(new Personaje("Luper","Pícaro","Elfo","Es muy picaro", "Norfair",(1.33),60,65));
        personajes.add(new Personaje("David","Pícaro","Enano","Esta quedando pelon", "Brinstar",(2.34),50,20));
        while (true) {
            System.out.println("1. Creación de Personajes \n"
                    + "2. Modificar Personajes \n"
                    + "3. Ver Atributos de un Personaje \n"
                    + "4. Eliminar Personajes \n"
                    + "5. Combate \n"
                    + "6. Salir");
            System.out.print("Ingrese opción: ");
            int opcion = leer.nextInt();
            System.out.println();
            
            if (opcion == 1){
                System.out.print("Ingrese nombre: ");
                String nombre = leer.next();
                System.out.print("Ingrese edad: ");
                int edad = leer.nextInt();
                System.out.print("Ingrese estatura (metros): ");
                Double estatura = leer.nextDouble();
                System.out.print("Ingrese peso (kg): ");
                Double peso = leer.nextDouble();
                System.out.print("Ingrese descripcion: ");
                String descripcion = leer.next();
                descripcion = leer.nextLine();
                
                while (edad <= 0) {
                    System.out.println();
                    System.out.println("La edad debe ser mayor a 1");
                    System.out.print("Ingrese edad: ");
                    edad = leer.nextInt();
                }
                while (estatura <= 0) {
                    System.out.println();
                    System.out.println("La estatura debe ser mayor a 1 (metro)");
                    System.out.println("Ingrese estatura (metros): ");
                    estatura = leer.nextDouble();
                }
                System.out.println();
                String nac = null,raza = null,clase = null;
                
                System.out.println("1. Clérigo \n"
                        + "2. Bárbaro \n"
                        + "3. Mago \n"
                        + "4. Pícaro");
                System.out.print("Ingrese opción de clase: ");
                opcion = leer.nextInt();                
                switch (opcion) {
                    case 1:
                        clase = "Clérigo";
                        break;
                    case 2:
                        clase = "Clérigo";
                        break;
                    case 3:
                        clase = "Mago";
                        break;
                    case 4:
                        clase = "Pícaro";
                        break;
                }
                System.out.println();
                
                System.out.println("1.Mediano \n"
                        + "2. Enano \n"
                        + "3. Elfo \n"
                        + "4. Humano");
                System.out.print("Ingrese opción de raza: ");
                opcion = leer.nextInt();                
                switch (opcion) {
                    case 1:
                        raza = "Mediano";
                        break;
                    case 2:
                        raza = "Enano";
                        break;
                    case 3:
                        raza = "Elfo";
                        break;
                    case 4:
                        raza = "Humano";
                        break;
                }
                System.out.println();
                
                System.out.println("1.Norfair \n"
                        + "2. Brinstar \n"
                        + "3. Maridia \n"
                        + "4. Zebes \n"
                        + "5. Crateria");
                System.out.print("Ingrese opción de nacionalidad: ");
                opcion = leer.nextInt();                
                switch (opcion) {
                    case 1:
                        nac = "Norfair";
                        break;
                    case 2:
                        nac = "Brinstar";
                        break;
                    case 3:
                        nac = "Maridia";
                        break;
                    case 4:
                        nac = "Zebes";
                        break;
                    case 5:
                        nac = "Crateria";
                        break;
                }
                
                personajes.add(new Personaje(nombre,clase,raza,descripcion,nac,estatura,peso,edad));
                
            } else if (opcion == 2){
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println((i+1) + ". " + personajes.get(i).getNombre());
                }
                System.out.print("Ingrese opción de personaje: ");
                opcion = leer.nextInt();
                opcion--;
                System.out.println();
                
                System.out.println("1. Nombre \n"
                        + "2. Edad \n"
                        + "3. Estatura \n"
                        + "4. Peso \n"
                        + "5. Descripcion \n"
                        + "6. Clase \n"
                        + "7. Raza \n"
                        + "8. Nacionalidad");
                System.out.print("Ingrese opción de atributo a modificar: ");
                int atributo = leer.nextInt();
                System.out.println();
                
                switch (atributo) {
                    case 1:
                        System.out.print("Ingrese nuevo nombre: ");
                        String nombre = leer.next();
                        personajes.get(opcion).setNombre(nombre);                        
                        break;
                    case 2:
                        System.out.print("Ingrese nueva edad: ");
                        int edad = leer.nextInt();
                        personajes.get(opcion).setEdad(edad);
                        break;
                    case 3:
                        System.out.print("Ingrese nueva estatura: ");
                        double estatura = leer.nextInt();
                        personajes.get(opcion).setEstatura(estatura);    
                        break;
                    case 4:
                        System.out.print("Ingrese nuevo peso: ");
                        double peso = leer.nextInt();
                        personajes.get(opcion).setPeso(peso);    
                        break;
                    case 5:
                        System.out.print("Ingrese nueva descripcion: ");
                        String descripcion = leer.next();
                        personajes.get(opcion).setDescripcion(descripcion);                        
                        break;
                    case 6:
                        System.out.println("1. Clérigo \n"
                                + "2. Bárbaro \n"
                                + "3. Mago \n"
                                + "4. Pícaro");
                        System.out.print("Ingrese opción de clase: ");
                        int flag = leer.nextInt(); 
                        String clase = null;
                        switch (flag) {
                            case 1:
                                clase = "Clérigo";
                                break;
                            case 2:
                                clase = "Clérigo";
                                break;
                            case 3:
                                clase = "Mago";
                                break;
                            case 4:
                                clase = "Pícaro";
                                break;
                        }
                        personajes.get(opcion).setClase(clase);
                        break;
                    case 7:
                        System.out.println("1. Mediano \n"
                                + "2. Enano \n"
                                + "3. Elfo \n"
                                + "4. Humano");
                        System.out.print("Ingrese opción de raza: ");
                        flag = leer.nextInt();
                        String raza = null;
                        switch (flag) {
                            case 1:
                                raza = "Mediano";
                                break;
                            case 2:
                                raza = "Enano";
                                break;
                            case 3:
                                raza = "Elfo";
                                break;
                            case 4:
                                raza = "Humano";
                                break;
                        }
                        personajes.get(opcion).setRaza(raza);
                        break;
                    case 8:
                        System.out.println("1. Norfair \n"
                                + "2. Brinstar \n"
                                + "3. Maridia \n"
                                + "4. Zebes \n"
                                + "5. Crateria");
                        System.out.print("Ingrese opción de nacionalidad: ");
                        flag = leer.nextInt(); 
                        String nac = null;
                        switch (flag) {
                            case 1:
                                nac = "Norfair";
                                break;
                            case 2:
                                nac = "Brinstar";
                                break;
                            case 3:
                                nac = "Maridia";
                                break;
                            case 4:
                                nac = "Zebes";
                                break;
                            case 5:
                                nac = "Crateria";
                                break;
                        }
                        personajes.get(opcion).setNacionalidad(nac);
                        break;
                }
            } else if (opcion == 3){
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println((i+1) + ". " + personajes.get(i).getNombre());
                }
                System.out.print("Ingrese opción de personaje: ");
                opcion = leer.nextInt();
                opcion--;
                System.out.println();
                
                System.out.println("Edad: " + personajes.get(opcion).getEdad());
                System.out.println("Estatura: " + personajes.get(opcion).getEstatura() + " m");
                System.out.println("Peso: " + personajes.get(opcion).getPeso() + " kg");
                System.out.println("Clase: " + personajes.get(opcion).getClase());
                System.out.println("Raza: " + personajes.get(opcion).getRaza());
                System.out.println("Nacionalidad: " + personajes.get(opcion).getNacionalidad());
                System.out.println("Descripcion: " + personajes.get(opcion).getDescripcion());
                
            } else if (opcion == 4){
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println((i+1) + ". " + personajes.get(i).getNombre());
                }
                System.out.print("Ingrese opción de personaje a eliminar: ");
                opcion = leer.nextInt();
                System.out.println();
                opcion--;
                personajes.remove(opcion);
                System.out.println("Personaje Elimando Exitosamente!");
            } else if (opcion == 5){
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println((i+1) + ". " + personajes.get(i).getNombre());
                }
                System.out.print("Ingrese opción de personaje a para jugar (Player1): ");
                int personajep1 = leer.nextInt();
                System.out.println();
                System.out.println("Player1 jugara con: " + personajes.get(personajep1).getNombre());
                int personajecpu = rand.nextInt(personajes.size());
                System.out.println("La CPU jugara con: " + personajes.get(personajecpu).getNombre());
                
                int hp1 = 0, hpcpu = 0;
                if (personajes.get(personajep1).getRaza().equals("Mediano")){
                    hp1 = 50+rand.nextInt(11);
                } else if(personajes.get(personajep1).getRaza().equals("Enano")){
                    hp1 = 80+rand.nextInt(21);
                } else if(personajes.get(personajep1).getRaza().equals("Elfo")){
                    hp1 = 50 + rand.nextInt(21);
                } else if(personajes.get(personajep1).getRaza().equals("Humano")){
                    hp1 = 40 + rand.nextInt(31);
                }
                if (personajes.get(personajecpu).getRaza().equals("Mediano")){
                    hpcpu = 50+rand.nextInt(11);
                } else if(personajes.get(personajecpu).getRaza().equals("Enano")){
                    hpcpu = 80+rand.nextInt(21);
                } else if(personajes.get(personajecpu).getRaza().equals("Elfo")){
                    hpcpu = 50 + rand.nextInt(21);
                } else if(personajes.get(personajecpu).getRaza().equals("Humano")){
                    hpcpu = 40 + rand.nextInt(31);
                }
                
                
                boolean ganador = false;
                int ac1 = 0, acpu = 0, cs1 = 0, cscpu = 0, damage1 = 0, damagecpu = 0;
                
                while (ganador == false) { 
                    
                    System.out.println("1. Atacar \n"
                            + "2. Defender");
                    System.out.println("Ingrese opción de accion: ");
                    opcion = leer.nextInt();
                    System.out.println();

                    if (personajes.get(personajep1).getClase().equals("Clérigo")){
                        ac1 = 40;
                        cs1 = 97;
                        damage1 =  5 + rand.nextInt(11);
                    } else if(personajes.get(personajep1).getClase().equals("Bárbaro")){
                        ac1 = 65;
                        cs1 = 93;
                        damage1 = 15+rand.nextInt(16);
                    } else if(personajes.get(personajep1).getClase().equals("Mago")){
                        ac1 = 20;
                        cs1 = 101;
                        damage1 = 5 +rand.nextInt(6);
                    } else if(personajes.get(personajep1).getClase().equals("Pícaro")){
                        ac1 = 50;
                        cs1 = 80;
                        damage1 = 15 + rand.nextInt(11);
                    }
      
                    int opcioncpu = 1+rand.nextInt(2);
                    System.out.println();

                    if (personajes.get(personajecpu).getClase().equals("Clérigo")){
                        acpu = 40;
                        cscpu = 97;
                        damagecpu =  5 + rand.nextInt(11);
                    } else if(personajes.get(personajecpu).getClase().equals("Bárbaro")){
                        acpu = 65;
                        cscpu = 93;
                        damagecpu = 15+rand.nextInt(16);
                    } else if(personajes.get(personajecpu).getClase().equals("Mago")){
                        acpu = 20;
                        cscpu = 101;
                        damagecpu = 5 +rand.nextInt(6);
                    } else if(personajes.get(personajecpu).getClase().equals("Pícaro")){
                        acpu = 50;
                        cscpu = 80;
                        damagecpu = 15 + rand.nextInt(11);
                    }
                    
                    

                    if (opcion == 1 && opcioncpu == 1){
                        int ataque = rand.nextInt(101);
                        if (ataque > acpu){
                            if (ataque > cs1){
                                System.out.println("Player1 ha hecho golpe critico");
                                damage1*=2;
                            }
                            hpcpu -= damage1;
                        } else {
                            System.out.println("Player1 no acerto el golpe");
                        }
                        
                        
                        ataque = rand.nextInt(101);
                        if (ataque > ac1){
                            if (ataque > cscpu){
                                System.out.println("CPU ha hecho golpe critico");
                                damagecpu*=2;
                            }
                            hp1 -= damagecpu;
                        } else {
                            System.out.println("CPU no acerto el golpe");
                        }
                        
                    } else if (opcion == 1 && opcioncpu == 2){
                        acpu += 15;
                        int ataque = rand.nextInt(101);
                        if (ataque > acpu){
                            if (ataque > cs1){
                                damage1*=2;
                                System.out.println("Player1 ha hecho golpe critico");
                            }
                            hpcpu -= damage1;
                        } else {
                            System.out.println("Player1 no acerto el golpe");
                        }
                        System.out.println("CPU se defendio");
                    } else if (opcion == 2 && opcioncpu == 1){
                        ac1 += 15;
                        int ataque = rand.nextInt(101);
                        if (ataque > ac1){
                            if (ataque > cscpu){
                                System.out.println("CPU ha hecho golpe critico");
                                damagecpu*=2;
                            }
                            hp1 -= damagecpu;
                        } else {
                            System.out.println("CPU no acerto el golpe");
                        }
                    } else {
                        ac1 += 15;
                        acpu += 15;
                        System.out.println("Los dos se defendieron");
                    }
                    
                    if (hp1 == 0 || hpcpu == 0){
                        ganador = true;
                    } else {
                        System.out.println("HP PLAYER 1: " + hp1);
                        System.out.println("HP PLAYER 1: " + hpcpu);
                    }
                    System.out.println();
                }
            } else if (opcion == 6){
                System.exit(0);
            } else {
                System.out.println("Opcion Incorrecta");
            }
            System.out.println();
        }
    }
    
}