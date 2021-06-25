/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.personas;

import ico.fes.alumno.Alumno;
import icos.fes.datos.DatosPersonas;


/**
 *
 * @author YUGEN
 */
public class Personas {
    public static void main(String[] args) {
        DatosPersonas per1=new DatosPersonas();
        per1.setNombre("Eduardo");
        per1.setEdad(18);
        per1.setGenero("Masculino");
        per1.setAltura(1.76f);
        System.out.println(per1);
        
        Alumno alum1=new Alumno();
        alum1.setEdad(18);
        alum1.setCarrera("Ing. Computación");
        alum1.setGenero("Masculino");
        alum1.setNombre("Eduardo");
        alum1.setEstatura(1.76f);
        alum1.setNumeroCuenta(318002547);
        alum1.setSemestre(2);
        System.out.println(alum1.getNombre()+(" ")+ alum1.getEstatura()+(" ")+ alum1.getGenero()+(" ")+alum1.getCarrera()
                            +(" ")+alum1.getEdad()+(" ")+alum1.getNumeroCuenta()+(" ")+alum1.getSemestre());
      
    }
    
   
}

