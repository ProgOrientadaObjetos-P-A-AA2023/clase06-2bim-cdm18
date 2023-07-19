/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author SALA H
 */
public class Principal02 {

    public static void main(String[] args) {
        String[][] autos = {
            {"LBC0001", "230.2"},
            {"LBC0002", "330.2"},
            {"LBC0003", "430.2"},
            {"LBC0004", "530.1"},
            {"LBC0005", "130.2"}};

        Enlace c = new Enlace();

        for (String[] auto : autos) {
            Auto a = new Auto();
            a.establecerPlaca(auto[0]);
            a.establecerValorMatricula(Double.parseDouble(auto[1]));
            c.insertarAuto(a);
        }

        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
        
        // 1. guardar en la tabla autos de la base de datos
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
    }
}
