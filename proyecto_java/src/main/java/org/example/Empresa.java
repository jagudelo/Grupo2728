package org.example;

public class Empresa {

    private String Nombre_Empresa;
    private String Direccion_Empresa;
    private String Telefono_Empresa;
    private String Nit_Empresa;

    public Empresa(String nombre_Empresa, String direccion_Empresa, String telefono_Empresa, String nit_Empresa) {
        Nombre_Empresa = nombre_Empresa;
        Direccion_Empresa = direccion_Empresa;
        Telefono_Empresa = telefono_Empresa;
        Nit_Empresa = nit_Empresa;
    }

    public String getNombre_Empresa() {
        return Nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        Nombre_Empresa = nombre_Empresa;
    }

    public String getDireccion_Empresa() {
        return Direccion_Empresa;
    }

    public void setDireccion_Empresa(String direccion_Empresa) {
        Direccion_Empresa = direccion_Empresa;
    }

    public String getTelefono_Empresa() {
        return Telefono_Empresa;
    }

    public void setTelefono_Empresa(String telefono_Empresa) {
        Telefono_Empresa = telefono_Empresa;
    }

    public String getNit_Empresa() {
        return Nit_Empresa;
    }

    public void setNit_Empresa(String nit_Empresa) {
        Nit_Empresa = nit_Empresa;
    }
}
