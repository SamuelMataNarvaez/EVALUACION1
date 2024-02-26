/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asigatura;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_6_ASIGATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clave,nombre,creditos,horasteoria,horaspracticas,carrera,tipomateria
        String clave,nombre,carrera;
        int creditos,horasTeoria,horasPractica;
        boolean tipoMateria;
        //CAPTURAR
        Scanner captura = new Scanner (System.in);
        System.out.println("introduce la clave de la asignatura:");
        clave = captura.nextLine();
        System.out.println("introduce el nombre de la asignatura:");
        nombre = captura.nextLine();
        System.out.println("introduce la carrera de la asignatura:");
        carrera = captura.nextLine();
        System.out.println("introduce los creditos de la asignatura:");
        creditos = captura.nextInt();
        System.out.println("introduce las horas teoricas de la asignatura:");
        horasTeoria = captura.nextInt();
        System.out.println("introduce las horas practicas de la asignatura:");
        horasPractica = captura.nextInt();
        System.out.println("introduce el tipo de materia:");
        tipoMateria = captura.nextBoolean();
        
        //HACER ALGO CON LOS DATOS CAPTURADOS
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeoria);
        System.out.println(horasPractica);
        System.out.println(tipoMateria);
    }
    
}
