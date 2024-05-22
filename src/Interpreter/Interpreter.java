package Interpreter;
import ExpresiónAbstracta.Expression;
import ExpresiónConcreta.*;
import ExpresiónConcreta.Number;

//Clase que se encarga de parsear y evaluar la expresión
public class Interpreter {
 public static Expression parse(String expression) {
     String[] tokens = expression.split(" ");
     Expression left = new Number(Integer.parseInt(tokens[0]));
     Expression right = new Number(Integer.parseInt(tokens[2]));

     switch (tokens[1]) {
         case "+":
             return new Add(left, right);
         case "-":
             return new Subtract(left, right);
         default:
             throw new UnsupportedOperationException("Operación no soportada: " + tokens[1]);
     }
 }
}
