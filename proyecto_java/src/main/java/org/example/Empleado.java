package org.example;

public class Empleado {

    private String Nombre_Empleado;
    private String Correo_Empleado;
    private String Empresa_Empleado;
    private String Rol_Empleado;

    public Empleado(String nombre_Empleado, String correo_Empleado, String empresa_Empleado, String rol_Empleado) {
        this.Nombre_Empleado = nombre_Empleado;
        this.Correo_Empleado = correo_Empleado;
        this.Empresa_Empleado = empresa_Empleado;
        this.Rol_Empleado = rol_Empleado;
    }

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        Nombre_Empleado = nombre_Empleado;
    }

    public String getCorreo_Empleado() {
        return Correo_Empleado;
    }

    public void setCorreo_Empleado(String correo_Empleado) {
        Correo_Empleado = correo_Empleado;
    }

    public String getEmpresa_Empleado() {
        return Empresa_Empleado;
    }

    public void setEmpresa_Empleado(String empresa_Empleado) {
        Empresa_Empleado = empresa_Empleado;
    }

    public String getRol_Empleado() {
        return Rol_Empleado;
    }

    public void setRol_Empleado(String rol_Empleado) {
        Rol_Empleado = rol_Empleado;
    }

    /* Comentario */
    
}
