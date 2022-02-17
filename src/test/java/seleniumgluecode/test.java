package seleniumgluecode;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
    private ChromeDriver driver = hooks.getDriver();

    @Given("El usuario se encuentra en la pagina HOME de imalittletester")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() {
        // Write code here that turns the phrase above into concrete actions
        String tittlehome = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(tittlehome,driver.getTitle());

    }
    @When("Hace click sobre el boton The little tester comics")
    public void hace_click_sobre_el_boton_the_little_tester_comics() {
        // Write code here that turns the phrase above into concrete actions
        WebElement tittleComic = driver.findElement(By.id("menu-item-2008"));
        tittleComic.click();
    }
    @Then("Se debe dirigir a la pantalla Comics")
    public void se_debe_dirigir_a_la_pantalla_comics() {
        // Write code here that turns the phrase above into concrete actions
        WebElement pagetittle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics",pagetittle.isDisplayed());
        Assert.assertEquals("Category: comics",pagetittle.getText());

    }

}