package com.nttdata.stepsdefinitions;

//import com.nttdata.steps.SauceLabsLoginSteps;
import com.nttdata.steps.SauceLabsProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {
    /*
    @Steps
    SauceLabsLoginSteps login;

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String usuario) {
        login.ingresoElUsuario(usuario);
    }

    @Given("ingreso al aplicativo de SauceLabs")
    public void ingresoAlAplicativoDeSauceLabs() {
    }

    @When("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String arg0, String arg1) {
        login.ingresoElUsuario(arg0);
        login.ingresarClave(arg1);
        login.ingresar();

    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String arg0) {
        login.ingresarClave(arg0);
    }

    @And("hago clic en LOGIN")
    public void hagoClicEn() {
        login.ingresar();
    }

    @And("valido el login OK")
    public void validoElLoginOK() {
        login.validacionLogin();
    }

     */


   // New tests
    @Steps
    SauceLabsProductSteps product;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        product.waitForGalery();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int arg0, String arg1) {
        product.navigateToProduct(arg1);
        product.addProductUnits(arg0);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        product.navigateToCart();
        product.assertProductQuantity();
    }
}
