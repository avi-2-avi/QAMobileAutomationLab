package com.nttdata.steps;

import com.nttdata.screens.SauceLoginScreen;
import org.junit.Assert;

public class SauceLabsLoginSteps {
    SauceLoginScreen login;


    public void ingresoElUsuario(String usuario) {
        login.ingresarUsuario(usuario);

    }

    public void ingresarClave(String arg0) {
        login.ingresarClave(arg0);
    }

    public void ingresar() {
        login.ingresar();
    }

    public void validacionLogin() {
        Assert.assertEquals("PRODUCTS",login.getTitulo() );
        Assert.assertTrue(login.getCountElements()>1);

    }
}
