import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MeuCompilador {
    public static void main(String[] args) {

        // Ler o texto a ser convertido transformando em Stream de "char"
        //CharStream entrada = CharStreams.fromString("Bears @ Packers");
        String filePath = "arquivo.txt";
        CharStream entrada = null;
        try {
            entrada = CharStreams.fromPath(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Erro de acesso ao arquivo");
            e.printStackTrace();
        }
        // Passar a Strem lida para o Lexer
        Gramatica2Lexer lexer = new Gramatica2Lexer(entrada);

        // Passando o resultado da analise Lexica para o processador de Tokens
        CommonTokenStream  tokens = new CommonTokenStream(lexer);
        // Passando os tokens para o parser 
        Gramatica2Parser parser = new Gramatica2Parser(tokens);
        // Pegar o ponto raiz da gramatica
        Gramatica2Parser.Raiz_programaContext arvore = parser.raiz_programa();
        // Imprimir a arvore geradora do texto sendo analisado
        System.out.println(arvore.toStringTree(parser));

        // "Caminha" pela arvore disparando os metodos do Listener
        MeuGramatica2Listener meuListener = new MeuGramatica2Listener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(meuListener, arvore);        
    }
}
