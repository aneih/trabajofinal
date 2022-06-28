/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acceso;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class empleado {
    private String documento; //en el que se va a guardar el documento del empleado
    private String nombre; // en el que se va a guardar el nombre del empleado
    private String tabla[][]; // es la matriz donde estaran los nombres y documentos 
    private boolean v; //verifica si el docuemnto es correcto y tiene un nombre asosiado

    // los getter y setter para manejar las variables
    public String[][] getTabla() {
        return tabla;
    }

    public void setTabla(String[][] tabla) {
        this.tabla = tabla;
    }      

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getV() {
        return v;
    }

    public void setV(boolean v) {
        this.v = v;
    }
    
    
    // es la tabla de los empleados que estan registrados
    public String[][] primeratabla()  {
        
        String nombres [][]={
            {"JUAN PEREZ","11111111","0"},
            {"MARIA RICAURTE","11111112","0"},
            {"RENE RIVAS","11111113","0"},
            {"RICARDO LEON","11111114","0"},
            {"PEDRO CIFUENTES","11111115","0"},
            {"JUAN ARBOLEDA","11111116","0"},
            {"LUISA HERRERA","11111117","0"},
            {"PATRCIO SOSA","11111118","0"},
            {"EDUARDO MALO","11111119","0"},
            {"ROCIO LARREA","11111120","0"},
            {"CATALINA GUERRA","11111121","0"},
            {"FERNANDO ORTIZ","11111122","0"},
            {"MARIO GUERRON","11111123","0"},
            {"ANA LLERENA","11111124","0"},
            {"PABLO PITARQUE","11111125","0"},
            {"DOLORES RIBADENEIRA","11111126","0"},
            {"PETER VILLEGAS","11111127","0"},
            {"JUAN CARLOS SALAS","11111128","0"},
            {"MARIA SOL GALARZA","11111129","0"},
            {"MARISOL RESTREPO","11111130","0"},
            };
        
        return nombres;
    }
    // comparar si el documento ingresado es valido y tiene un nombre asosiado
    public void comparar(){
        
        String nombres [][]=getTabla();
        
        for (int i = 0; i < 20; i++) {
           if (this.documento.equals(nombres[i][1])) {
                this.nombre=nombres[i][0];
                this.tabla[i][2]=hora();
                v=true;
        }
           
           
        }
        
        
        
    }
    // nos permite saber la hora del sistema y guardarla al empleado que ingresa
    public String hora(){
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        //System.out.println(dtf4.format(LocalDateTime.now()));
        return dtf4.format(LocalDateTime.now());
    }
    // es la tabla con el registro de empleados que ya ingresaron 
    public void guardados(){
        String nombres [][]=getTabla();
        for (int i = 0; i < 20; i++) {
           if ((!"0".equals(nombres[i][2]))) {
                System.out.println(this.tabla[i][0]+" ingreso "+this.tabla[i][2]);
        }
    }
        
        
    
    
    
    
    
    
}
}
