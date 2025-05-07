import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Uso: java -jar miPrograma.jar <ruta_fichero.pas>");
            System.exit(1);
        }

// Fichero de entrada
        String filePath = args[0];
        CharStream input = CharStreams.fromFileName(filePath);

// Reemplazar .pas por .c para el nombre del archivo de salida
        String nombreArchivo;
        if (filePath.endsWith(".pas")) {
            nombreArchivo = filePath.substring(0, filePath.length() - 4) + ".c";
        } else {
            nombreArchivo = filePath + ".c"; // por si no tiene .pas
        }

        FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo);
        PrintStream printStream = new PrintStream(archivoSalida);
        PrintStream stdout = System.out;
        System.setOut(printStream);


        //Ejecutar gramatica
        gramaticaLexer lexer = new gramaticaLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());

        ParseTree tree = parser.prg();

        if (!(parser.getNumberOfSyntaxErrors() == 0)){
            System.err.println("Se encontraron errores en el código.");
        }
    }

    // Listener personalizado para mostrar errores con más detalle
    static class CustomErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            System.err.println("Error en línea " + line + ", columna " + charPositionInLine + ": " + msg);
        }
    }
}
