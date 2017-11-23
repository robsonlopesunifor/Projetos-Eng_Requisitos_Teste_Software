package Porteiro;

import java.util.Scanner;

public class Porta 
{
	public Porta(){
		MostraFuncionalidades();
		DefinirFuncionalidade();
	}
	
	public void MostraFuncionalidades() {
		System.out.println("mostrar funcionalidade da porta");
		System.out.println(" - Para abrir a porta digite 1");
		System.out.println(" - Para conferir pemissão digite 2");
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
