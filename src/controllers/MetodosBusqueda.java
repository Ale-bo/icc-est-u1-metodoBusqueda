package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }
    public int busquedaLieneal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    /*
     * 
     * @param code a buscar
     * @return psicion de la persona
     */

     public int finPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPerson (){
        int codeToFind = showConsole.inputCode();
        int indexPerson = finPersonByCode(codeToFind);
        if (indexPerson >=0){
            showConsole.showMessage("Persona con codigo "+ codeToFind +" encontrada  ");
            //showConsole.showMessage(people[indexPerson].toString());
            //showConsole.showMessage(people[indexPerson]+"");
        } else{
            showConsole.showMessage("Persona no encontrada");
        }
    }
}