package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "ctrlDatos")
@RequestScoped
public class ctrlDatos {
  private String nombre;
  private String edad;
  private String animal;
  private String ciudad;
  
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getEdad() {
    return edad;
  }
  public void setEdad(String edad) {
    this.edad = edad;
  }
  
  public String getAnimal() {
    return animal;
  }
  public void setAnimal(String animal) {
    this.animal = animal;
  }
  
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  
  public void datosobtenidos() {
    final String nombre1 = "Tu Nombre es: " + getNombre() + ".";
    final String edad1 = "Tu Edad es: " + getEdad() + ".";
    final String animal1 = "Tu Animal Favorito es: " + getAnimal() + ".";
    final String ciudad1 = "Tu ciudad es: " + getCiudad() + ".";
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(nombre1));
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(edad1));
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(animal1));
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ciudad1));
  }
}
