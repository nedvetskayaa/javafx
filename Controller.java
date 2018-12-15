package sample.controller;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    Button r0c0;
    Button r0c1;
    Button r0c2;
    Button r1c0;
    Button r1c1;
    Button r1c2;
    Button r2c0;
    Button r2c1;
    Button r2c2;
    public void clickButtonR0C0(javafx.event.ActionEvent actionEvent) {
        r1c1.setLabel("X");
        System.out.println("Вы нажали 1 кнопку справа ");
    }

    public void clickButtonR0C1(javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 2 кнопку сверху");
    }
    public void clickButtonR1C0(javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 1 кнопку справа по центру ");
    }
    public void clickButtonR2C0(javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 1 кнопку справа снизу ");
    }
    public void clickButtonR1C1 (javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 2 кнопку по центру ");
    }
    public void clickButtonR1C2 (javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 3 кнопку по центру слева ");
    }
    public void clickButtonR2C1 (javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 3 кнопку слева ");
    }
    public void clickButtonR2C2 (javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 2 кнопку снизу  ");
    }
    public void clickButtonR0C2 (javafx.event.ActionEvent actionEvent) {
        System.out.println("Вы нажали 3 кнопку снизу слева ");
    }

     {
    }
}
