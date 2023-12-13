// Generated from Football.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MeuFootballListener extends FootballBaseListener {
	FileWriter linguagemFinal = null;
	String time_visitante = "", time_mandante = "";
	int ataque_visitante = 0, ataque_mandante = 0, pontos_visitante = 0, pontos_mandante = 0, jardas_corridas_visitante = 0, jardas_corridas_mandante = 0, jardas_passadas_visitante = 0, jardas_passadas_mandante = 0;

	public MeuFootballListener() {
		try {
			linguagemFinal = new FileWriter (new File("src/Compilado.txt"));
		} catch (IOException e) {
			System.out.println("Erro de criação do arquivo: ");
			e.printStackTrace();
		}
	}

	@Override public void enterRaiz_programa(FootballParser.Raiz_programaContext ctx) { }

	@Override public void exitRaiz_programa(FootballParser.Raiz_programaContext ctx) { }

	@Override public void enterJogo(FootballParser.JogoContext ctx) { }

	@Override public void exitJogo(FootballParser.JogoContext ctx) { }

	@Override public void enterInicio(FootballParser.InicioContext ctx) {
		try {
			org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);
			org.antlr.v4.runtime.tree.ParseTree no1 = ctx.getChild(1);
			org.antlr.v4.runtime.tree.ParseTree no2 = ctx.getChild(2);
			org.antlr.v4.runtime.tree.ParseTree no3 = ctx.getChild(3);
			org.antlr.v4.runtime.tree.ParseTree no4 = ctx.getChild(4);
			org.antlr.v4.runtime.tree.ParseTree no5 = ctx.getChild(5);
			if(no0 != null && no2 != null && no4 != null){
				Random random = new Random();
				int num = 1 + random.nextInt(18);
				linguagemFinal.write("Boas-vindas a Semana " + num + " da Temporada 2023 da NFL!\n" + no0.getText() + no1.getText() + no2.getText() + no3.getText() + no4.getText() + no5.getText());
				linguagemFinal.flush();
				time_visitante = String.valueOf(no0.getText());
				time_mandante = String.valueOf(no4.getText());
			}
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo");
			e.printStackTrace();
		}
	}

	@Override public void exitInicio(FootballParser.InicioContext ctx) { }

	@Override public void enterJogada(FootballParser.JogadaContext ctx) {
		try {
			org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);
			org.antlr.v4.runtime.tree.ParseTree no1 = ctx.getChild(1);
			org.antlr.v4.runtime.tree.ParseTree no2 = ctx.getChild(2);
			org.antlr.v4.runtime.tree.ParseTree no3 = ctx.getChild(3);
			org.antlr.v4.runtime.tree.ParseTree no4 = ctx.getChild(4);
			org.antlr.v4.runtime.tree.ParseTree no5 = ctx.getChild(5);
			org.antlr.v4.runtime.tree.ParseTree no6 = ctx.getChild(6);
			org.antlr.v4.runtime.tree.ParseTree no7 = ctx.getChild(7);
			if(no0.getText().equals(time_visitante)){
				ataque_mandante = 0;
				if(ataque_visitante < 100) {
					ataque_visitante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
				if(ataque_visitante >= 100) {
					ataque_visitante = 0;
					pontos_visitante += 7;
					linguagemFinal.write("TOUCHDOWN! ");
					linguagemFinal.flush();
				}
				if(no2.getText().equals("correu")){
					jardas_corridas_visitante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
				if(no2.getText().equals("passou")){
					jardas_passadas_visitante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
			}
			if(no0.getText().equals(time_mandante)){
				ataque_visitante = 0;
				if(ataque_mandante < 100) {
					ataque_mandante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
				if(ataque_mandante >= 100) {
					ataque_mandante = 0;
					pontos_mandante += 7;
					linguagemFinal.write("TOUCHDOWN! ");
					linguagemFinal.flush();
				}
				if(no2.getText().equals("correu")){
					jardas_corridas_mandante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
				if(no2.getText().equals("passou")){
					jardas_passadas_mandante+= Integer.parseInt(String.valueOf(no4.getText()));
				}
			}
			linguagemFinal.write(no0.getText() + no1.getText() + no2.getText() + no3.getText() + no4.getText() + no5.getText() + no6.getText() + no7.getText());
			linguagemFinal.flush();
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo");
			e.printStackTrace();
		}
    }

	@Override public void exitJogada(FootballParser.JogadaContext ctx) { }

	@Override public void enterFim(FootballParser.FimContext ctx) {
		try {
			org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);
			linguagemFinal.write(no0.getText());
			linguagemFinal.write("\nResultado: " + time_visitante + " " + pontos_visitante + " x " + pontos_mandante + " " + time_mandante);
			linguagemFinal.write("\nJardas corridas: " + time_visitante + " " + jardas_corridas_visitante + " x " + jardas_corridas_mandante + " " + time_mandante);
			linguagemFinal.write("\nJardas passadas: " + time_visitante + " " + jardas_passadas_visitante + " x " + jardas_passadas_mandante + " " + time_mandante);
			linguagemFinal.write("\nJardas totais: " + time_visitante + " " + (jardas_corridas_visitante + jardas_passadas_visitante) + " x " + (jardas_corridas_mandante + jardas_passadas_mandante) + " " + time_mandante);
			linguagemFinal.flush();
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo");
			e.printStackTrace();
		}
	}

	@Override public void exitFim(FootballParser.FimContext ctx) { }

	@Override public void enterTime(FootballParser.TimeContext ctx) { }

	@Override public void exitTime(FootballParser.TimeContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) {
		super.exitEveryRule(ctx);
	}

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}