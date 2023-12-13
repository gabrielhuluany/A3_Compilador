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
        String filePath = "src/Input.txt";
        CharStream entrada = null;
        try {
            entrada = CharStreams.fromPath(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Erro de acesso ao arquivo: ");
            e.printStackTrace();
        }
        // Passar a Stream lida para o Lexer
        FootballLexer lexer = new FootballLexer(entrada);

        // Passando o resultado da análise léxica para o processador de Tokens
        CommonTokenStream  tokens = new CommonTokenStream(lexer);
        // Passando os tokens para o Parser
        FootballParser parser = new FootballParser(tokens);
        // Pegar o ponto raíz da gramática
        FootballParser.Raiz_programaContext arvore = parser.raiz_programa();
        // Imprimir a árvore geradora do texto sendo analisado
        System.out.println(arvore.toStringTree(parser));

        // "Caminha" pela árvore disparando os métodos do Listener
        MeuFootballListener meuListener = new MeuFootballListener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(meuListener, arvore);
    }
}
