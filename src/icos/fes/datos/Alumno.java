/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icos.fes.datos;



/**
 *
 * @author YUGEN
 */
public class Alumno extends DatosPersonas{
    private int numeroCuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(int numeroCuenta, String carrera, int semestre) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(int numeroCuenta, String carrera, int semestre, String nombre, int edad, String genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }

    
}
    

    
