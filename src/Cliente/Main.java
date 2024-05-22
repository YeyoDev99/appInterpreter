package Cliente;
import javax.swing.JOptionPane;
import ExpresiónAbstracta.Expression;
import Interpreter.Interpreter;

public class Main {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una expresión
        String input = JOptionPane.showInputDialog("Ingrese una expresión (por ejemplo, 3 + 2):");

        try {
            // Parsear la expresión y evaluarla
            Expression expression = Interpreter.parse(input);
            int result = expression.interpret();

            // Mostrar el resultado al usuario
            JOptionPane.showMessageDialog(null, "El resultado es: " + result);
        } catch (Exception e) {
            // Manejar errores (por ejemplo, formato de entrada incorrecto)
            JOptionPane.showMessageDialog(null, "Error al evaluar la expresión: " + e.getMessage());
        }
    }
}
