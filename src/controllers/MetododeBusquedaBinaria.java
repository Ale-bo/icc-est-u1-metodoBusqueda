package controllers;
import views.ShowConsole;

import java.util.Scanner;

import models.Person;


public class MetododeBusquedaBinaria {
    private Person[] people;
    private ShowConsole pantalla;


    public MetododeBusquedaBinaria(Person[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de Busqueda binaria");

    }
    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length-1;
        while (alto >= bajo){
            int central = (alto + bajo)/2;
            if (people[central].getCode() == code){
                return central;
    }
    if (people[central].getCode() > code){
        alto = central-1;
    } else {
        bajo = central+1;
    }
        }
        return -1;
    }
    
    private int findPersonByName (String name){
        int bajo = 0;
        int alto = people.length-1;

        while (alto >= bajo){
            int central = (alto + bajo)/2;
            if (people[0].getName().compareTo(name) > 0)
                return central;
            if (people[central].getName().compareTo(name) > 0){
                alto = central-1;
            } else {
                bajo = central+1;
            }
        }
        return -1;
    } 

    public void showPersonByCode (){
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1){
            pantalla.showMessage("Persona con codigo "+ codeToFind +" no encontarda ");
        } else{
            pantalla.showMessage("Persona con codigo "+ codeToFind +" encontarda ");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }


    public void showPersonByName (){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson == -1){
            pantalla.showMessage("Persona con nombre "+ nameToFind +" no encontarda ");
        } else{
            pantalla.showMessage("Persona con nombre "+ nameToFind +" encontarda ");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }


}


