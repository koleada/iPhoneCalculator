
/*
 * Kole Niznik
 *
 * 11/12/22
 *
 * This class will display a calculator designed to look and function similar to the IOS calculator. (Exercise 15.4)
 *
 */

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IPhoneCalculator extends Application {

  private String operator = "";

  private String num1;
  private String num2;

  @Override
  public void start(Stage primaryStage) {
    GridPane pane = new GridPane();
    pane.setMinSize(600, 350);
    pane.setMaxSize(600, 350);

    pane.setStyle("-fx-background-color: BLACK");
    pane.setAlignment(Pos.BOTTOM_CENTER);
    pane.setHgap(10.0);
    pane.setVgap(10.0);
    pane.setPadding(new Insets(10, 10, 10, 10));

    Button zero = new Button("0");
    zero.setMinSize(160, 75);
    zero.setMaxSize(160, 75);
    zero.setStyle(
      "-fx-alignment: left;" +
      "-fx-background-color: DIMGREY;" +
      "-fx-background-radius: 30;" +
      "-fx-background-insets: 0,1,1;" +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-text-alignment: left"
    );
    Button dec = new Button(".");
    dec.setMinSize(75, 75);
    dec.setMaxSize(75, 75);
    dec.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 40px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button equals = new Button("=");
    equals.setMinSize(75, 75);
    equals.setMaxSize(75, 75);
    equals.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: GOLDENROD;"
    );
    Button one = new Button("1");
    one.setMinSize(75, 75);
    one.setMaxSize(75, 75);
    one.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button two = new Button("2");
    two.setMinSize(75, 75);
    two.setMaxSize(75, 75);
    two.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button three = new Button("3");
    three.setMinSize(75, 75);
    three.setMaxSize(75, 75);
    three.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button add = new Button("+");
    add.setMinSize(75, 75);
    add.setMaxSize(75, 75);
    add.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: GOLDENROD;"
    );
    Button four = new Button("4");
    four.setMinSize(75, 75);
    four.setMaxSize(75, 75);
    four.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button five = new Button("5");
    five.setMinSize(75, 75);
    five.setMaxSize(75, 75);
    five.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button six = new Button("6");
    six.setMinSize(75, 75);
    six.setMaxSize(75, 75);
    six.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button sub = new Button("-");
    sub.setMinSize(75, 75);
    sub.setMaxSize(75, 75);
    sub.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: GOLDENROD;"
    );
    Button seven = new Button("7");
    seven.setMinSize(75, 75);
    seven.setMaxSize(75, 75);
    seven.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button eight = new Button("8");
    eight.setMinSize(75, 75);
    eight.setMaxSize(75, 75);
    eight.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button nine = new Button("9");
    nine.setMinSize(75, 75);
    nine.setMaxSize(75, 75);
    nine.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: DIMGREY;"
    );
    Button mult = new Button("x");
    mult.setMinSize(75, 75);
    mult.setMaxSize(75, 75);
    mult.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: GOLDENROD;"
    );
    Button clear = new Button("AC");
    clear.setMinSize(75, 75);
    clear.setMaxSize(75, 75);
    clear.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: BLACK;" +
      "-fx-font-size: 25px;"
    );
    Button negative = new Button("+/-");
    negative.setMinSize(75, 75);
    negative.setMaxSize(75, 75);
    negative.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: BLACK;" +
      "-fx-font-size: 25px;"
    );
    Button percent = new Button("%");
    percent.setMinSize(75, 75);
    percent.setMaxSize(75, 75);
    percent.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: BLACK;" +
      "-fx-font-size: 30px;"
    );
    Button div = new Button("÷");
    div.setMinSize(75, 75);
    div.setMaxSize(75, 75);
    div.setStyle(
      "-fx-background-radius: 5em; " +
      "-fx-background-insets: 0px; " +
      "-fx-text-fill: white;" +
      "-fx-font-size: 35px;" +
      "-fx-background-color: GOLDENROD;"
    );

    GridPane.setRowIndex(zero, 5);
    GridPane.setColumnSpan(zero, 2);
    GridPane.setColumnIndex(dec, 2);
    GridPane.setRowIndex(dec, 5);
    GridPane.setColumnIndex(equals, 3);
    GridPane.setRowIndex(equals, 5);

    GridPane.setColumnIndex(one, 0);
    GridPane.setRowIndex(one, 4);
    GridPane.setColumnIndex(two, 1);
    GridPane.setRowIndex(two, 4);
    GridPane.setColumnIndex(three, 2);
    GridPane.setRowIndex(three, 4);
    GridPane.setColumnIndex(add, 3);
    GridPane.setRowIndex(add, 4);

    GridPane.setColumnIndex(four, 0);
    GridPane.setRowIndex(four, 3);
    GridPane.setColumnIndex(five, 1);
    GridPane.setRowIndex(five, 3);
    GridPane.setColumnIndex(six, 2);
    GridPane.setRowIndex(six, 3);
    GridPane.setColumnIndex(sub, 3);
    GridPane.setRowIndex(sub, 3);

    GridPane.setColumnIndex(seven, 0);
    GridPane.setRowIndex(seven, 2);
    GridPane.setColumnIndex(eight, 1);
    GridPane.setRowIndex(eight, 2);
    GridPane.setColumnIndex(nine, 2);
    GridPane.setRowIndex(nine, 2);
    GridPane.setColumnIndex(mult, 3);
    GridPane.setRowIndex(mult, 2);

    GridPane.setColumnIndex(clear, 0);
    GridPane.setRowIndex(clear, 1);
    GridPane.setColumnIndex(negative, 1);
    GridPane.setRowIndex(negative, 1);
    GridPane.setColumnIndex(percent, 2);
    GridPane.setRowIndex(percent, 1);
    GridPane.setColumnIndex(div, 3);
    GridPane.setRowIndex(div, 1);

    TextField text1 = new TextField("");
    text1.setAlignment(Pos.TOP_RIGHT);
    text1.setStyle(
      "-fx-background-color: black;" +
      "-fx-text-fill: white;" +
      "-fx-font-size: 40px;"
    );

    zero.setOnAction(e -> {
      text1.appendText("0");
    });
    one.setOnAction(e -> {
      text1.appendText("1");
    });
    two.setOnAction(e -> {
      text1.appendText("2");
    });
    three.setOnAction(e -> {
      text1.appendText("3");
    });
    four.setOnAction(e -> {
      text1.appendText("4");
    });
    five.setOnAction(e -> {
      text1.appendText("5");
    });
    six.setOnAction(e -> {
      text1.appendText("6");
    });
    seven.setOnAction(e -> {
      text1.appendText("7");
    });
    eight.setOnAction(e -> {
      text1.appendText("8");
    });
    nine.setOnAction(e -> {
      text1.appendText("9");
    });
    clear.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), "");
    });

    dec.setOnAction(e -> {
      text1.appendText(".");
    });
    negative.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), signChange(text1));
    });

    percent.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), percent(text1, num1));
    });

    add.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), addition(text1));
    });
    sub.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), subtraction(text1));
    });
    mult.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), multiplication(text1));
    });

    div.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), division(text1));
    });

    equals.setOnAction(e -> {
      text1.replaceText(0, text1.getLength(), result(text1, num1));
    });

    pane
      .getChildren()
      .addAll(
        zero,
        dec,
        equals,
        one,
        two,
        three,
        add,
        four,
        five,
        six,
        sub,
        seven,
        eight,
        nine,
        mult,
        clear,
        percent,
        negative,
        div,
        text1
      );

    GridPane.setRowIndex(text1, 0);
    GridPane.setColumnSpan(text1, 4);

    Scene scene = new Scene(pane);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Calculator");
    primaryStage.setWidth(375);
    primaryStage.setHeight(600);
    primaryStage.show();
  }

  private String signChange(TextField text1) {
    String temp = text1.getText();

    Double double1 = Double.parseDouble(temp);

    if (temp.indexOf("-") == -1) {
      return ("-" + double1);
    } else {
      return temp.substring(1, temp.length());
    }
  }

  private String addition(TextField text1) {
    num1 = text1.getText();
    operator = "+";

    return "";
  }

  private String subtraction(TextField text1) {
    num1 = text1.getText();
    operator = "-";

    return "";
  }

  private String multiplication(TextField text1) {
    num1 = text1.getText();
    operator = "x";

    return "";
  }

  private String division(TextField text1) {
    num1 = text1.getText();
    operator = "÷";

    return "";
  }

  private String result(TextField text1, String num1) {
    num2 = text1.getText();
    Double number1;
    Double number2;

    try {
      number1 = Double.valueOf(num1);
      number2 = Double.valueOf(num2);
    } catch (NumberFormatException e) {
      return "Not a valid number!";
    }

    switch (operator) {
      case "+":
        return number1 + number2 + "";
      case ("-"):
        return number1 - number2 + "";
      case ("x"):
        return number1 * number2 + "";
      case ("÷"):
        return number1 / number2 + "";
    }
    return num1;
  }

  // returns the contents of TextField as a %
  String percent(TextField text1, String num1) {
    String temp = text1.getText();
    Double double1;
    try {
      double1 = Double.parseDouble(temp);
    } catch (NumberFormatException e) {
      return ("Not a valid number!");
    }

    double1 = double1 * .01;
    return double1 + "";
  }

  public static void main(String[] args) {
    launch(args);
  }
}
