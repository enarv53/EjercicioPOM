package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

//Creamos una clase donde implemntemos a POM
class TextBoxPage {

    //Metodo privado para acceder al navegador
    private WebDriver driver;

    //Generamos el metodo constructor de la clase TextBoxPage
    public TextBoxPage(WebDriver driver){
        this.driver = driver;
    }

    //Comportamiento en POM
    public void navigateTo(){
        driver.get("https://demoqa.com/text-box");
    }
    //Comportamiento 2
    public void takeScreenshot(String path) throws IOException  {
        //Código para tomar la captura
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path);
        FileUtils.copyFile(srcFile,destFile);
    }

}