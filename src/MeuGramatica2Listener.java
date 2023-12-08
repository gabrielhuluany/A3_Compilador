import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MeuGramatica2Listener extends Gramatica2BaseListener{
    FileWriter linguagemFinal = null;
    String ultimoNome = null;
    Map<String, String> minhasVariaveis = new HashMap<String, String>();
    
    public MeuGramatica2Listener() {
        try {
            linguagemFinal = new FileWriter (new File("LinguagemProc.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);             
            if(no0 != null ){
                if((no0).getText().trim().equalsIgnoreCase("NFL")){
                    if(ctx.getChild(0)!=null && ctx.getChild(2)!=null && ctx.getChild(3)!=null){
                        linguagemFinal.write("Bears @ Packers " + ctx.getChild(1).getText() + " e " + ctx.getChild(3).getText() + "\n");
                        linguagemFinal.flush();
                    }
                }
                if((no0).getText().trim().equalsIgnoreCase("se")){
                    String personagem = ctx.getChild(1).getChild(0).getText();
                    String valor      = ctx.getChild(1).getChild(2).getText();
                    String valorArmazenado = minhasVariaveis.get(personagem);
                    if(valor.trim().equalsIgnoreCase(valorArmazenado)){
                        linguagemFinal.write(personagem + " " + ctx.getChild(3).getText() + "\n");  
                    }
                    
                }
            }
            org.antlr.v4.runtime.tree.ParseTree no = ctx.getChild(1);
            if(no != null){            
                if(no.getText().trim().equalsIgnoreCase("correu")){
                    int vezes = Integer.parseInt(ctx.getChild(2).getText());                
                    for(int i=0; i < vezes; i++){
                        linguagemFinal.write(ctx.getChild(0).getText() + " correu " + (i+1)+ "10 jardas\n");
                    }
                }
            }
            if(no != null){            
                if(no.getText().trim().equalsIgnoreCase("venceu")){
                    minhasVariaveis.put(ctx.getChild(0).getText(), ctx.getChild(2).getText());
                }
            }

            org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(2);
            if(no != null){
                if(no.getText().trim().equalsIgnoreCase("Fim de jogo")){
                    minhasVariaveis.put(ctx.getChild(0).getText(), ctx.getChild(2).getText());
                }
            }

            linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }


    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {       
        /* 
        try {
            //linguagemFinal.write("Entrando Terminal " + node.getText() + "\n");
            //linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }*/
    }


    
    
}
