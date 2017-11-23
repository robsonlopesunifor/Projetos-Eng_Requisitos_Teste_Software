package Porteiro;

import java.util.Scanner;

public class Alarme 
{
	public Alarme(){
		MostraFuncionalidades();
		DefinirFuncionalidade();
	}
	
	public void MostraFuncionalidades() {
		System.out.println("mostrar funcionalidade do alarme");
		System.out.println(" - Para ativar o alarme de incêndio digite 1");
		System.out.println(" - Para ativar o alarme de polícia digite 2");
		System.out.println(" - Para ativar o alarme de individual digite 3");
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
            case "3":
                System.out.println("Terça-feira");
                break;
            default:
                 System.out.println("Este não é um dia válido!");
         }
	}
	
}
