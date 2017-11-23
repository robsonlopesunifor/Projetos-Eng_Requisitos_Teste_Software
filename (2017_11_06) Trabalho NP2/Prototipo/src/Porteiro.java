import java.util.Scanner;

import Porteiro.Alarme;
import Porteiro.Porta;
import Porteiro.Telefone;

public class Porteiro 
{
	Porteiro(){
		System.out.println("mostrar funcionalidade do porteiro");
	}
	
    public static void main(String[] args) {
    	MostraFuncionalidades();
    	DefinirFuncionalidade();
	}
	
	public static void MostraFuncionalidades() {
		System.out.println("mostrar funcionalidade do Porteiro");
		System.out.println(" - Para ativar as fun��es do alarme digite 1");
		System.out.println(" - Para ativar as fun��es da portaria digite 2");
		System.out.println(" - Para ativar as fun��es do telefone digite 3");
	}
	
	public static void DefinirFuncionalidade() 
	{	
		Scanner ler = new Scanner(System.in);
		String funcao = ler.nextLine();
        switch (funcao) {
            case "1":
            	Alarme alarme = new Alarme();
                break;
            case "2":
            	Porta porta = new Porta();
                break;
            case "3":
            	Telefone telefone = new Telefone();
                break;
            default:
                 System.out.println("Este n�o � um dia v�lido!");
         }
	}
}


