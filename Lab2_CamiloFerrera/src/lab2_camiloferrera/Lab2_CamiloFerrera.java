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
                
                int hp1 = 0,hp = 0;
                if (personajes.get(personajep1).getRaza().equals("Mediano")){
                    hp1 = 50+rand.nextInt(11);
                } else if(personajes.get(personajep1).getRaza().equals("Enano")){
                    hp1 = 80+rand.nextInt(21);
                } else if(personajes.get(personajep1).getRaza().equals("Elfo")){
                    hp1 = 50 + rand.nextInt(21);
                } else if(personajes.get(personajep1).getRaza().equals("Humano")){
                    hp1 = 40 + rand.nextInt(31);
                }
                int turno = 0;
                boolean ganador = false;
                while (ganador == false) {
                    if (turno%2 == 0){
                        
                    } else {
                        
                    }
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