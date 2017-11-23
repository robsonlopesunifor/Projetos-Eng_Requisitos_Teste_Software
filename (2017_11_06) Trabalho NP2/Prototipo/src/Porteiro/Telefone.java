package Porteiro;

import java.util.Scanner;

public class Telefone 
{
	public Telefone(){
		MostraFuncionalidades();
		DefinirFuncionalidade();
	}
	
	public void MostraFuncionalidades() {
		System.out.println("mostrar funcionalidade do telefone");
		System.out.println(" - Para mostrar a lista de telefone digite 1");
		System.out.println(" - Para fazer uma ligação digite 2");
	}
	
	public void DefinirFuncionalidade() 
	{	
		Scanner ler = new Scanner(System.in);
		String funcao = ler.nextLine();
        switch (funcao) {
            case "1":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda-feira");
                break;
            default:
                 System.out.println("Este não é um dia válido!");
         }
	}
}
