package org.example;

//Ejercicio realizado con la arquitectura POM.
//Incorporación de librerias

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Dejamos la configuracion en el main a pesar de que se puede ver como un comportamiento
        //debido a la importancia de la configuracion
        System.setProperty("webdriver.gecko.driver","C:\\Users\\eduarmar\\OneDrive - Capgemini\\Desktop\\Curso Selenium TG\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Instancia de la clase y mediante esta clase traemos sus metodos
        TextBoxPage textBoxPage = new TextBoxPage(driver);

        //Referencia a los metodos textBNoxPage
        try{
            //Codigo con referencia a los metodos.
            textBoxPage.navigateTo();
            textBoxPage.takeScreenshot("C:\\Users\\eduarmar\\OneDrive - Capgemini\\Desktop\\Curso Selenium TG\\Capturas de Pantalla\\ejemplo.png");
            System.out.println("Se generó captura de pantalla dese MAIN");

        }catch (IOException e){
            System.out.println("Existe un error al capturar pantalla.");

        }

    }
}