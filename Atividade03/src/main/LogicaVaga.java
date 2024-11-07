package main;

import java.util.ArrayList;
import java.util.Scanner;

import main.objetos.Carro;
import main.objetos.Vaga;

public class LogicaVaga {
	public static Scanner scan= new Scanner(System.in);
	public static int encontrarVaga(ArrayList<Vaga>lista) {
		System.out.println("digite o número da vaga que deseja ocupar");
		int numero= scan.nextInt();
		for (int i =lista.size()-1; i >=0 ; i--) {
			if (lista.get(i).getNumeroVaga()==numero) {
				System.out.println("encontrado");
				
				return i;
		}
			
		}
		
		return -1;
	}
	public static void listarVagasOcupadas(ArrayList<Vaga> listaVaga, ArrayList<Carro > listaCarro) {
	    boolean encontrado = false;
	    for (Vaga vaga : listaVaga) {
	        if (!vaga.getDisponibilidade()) {
	            for (Carro carro : listaCarro) {
	                if (carro.getVaga() != null && carro.getVaga().equals(vaga)) {
	                   
	                    System.out.println("Vaga nº " + vaga.getNumeroVaga() + " | Tamanho: " + vaga.getTamanho() + 
	                                       " | Placa do Carro: " + carro.getPlaca());
	                    encontrado = true;
	                    break;
	                }
	            }
	        }
	    }
	    if (!encontrado) {
	        System.out.println("Não há vagas ocupadas no momento.");
	    }
	}

	public static  ArrayList<Vaga> removerVaga(ArrayList<Vaga>lista){
		System.out.println("digite o número da vaga");
		int numero= scan.nextInt();
		for (int i =lista.size()-1; i >=0 ; i--) {
			if (lista.get(i).getNumeroVaga()==numero) {
				lista.remove(i);
		
				System.out.println("vaga removida");
			}
		}

		return lista;
	}
	public static  ArrayList<Vaga> cadastrarVaga(ArrayList<Vaga>lista)
	{
	Vaga vaga= new Vaga(null, true, null);
	System.out.println("Digite o número da vaga ");
	vaga.setNumeroVaga(scan.nextInt());


	Boolean b=true;
	while (b!=false) {
		System.out.println("digite 1 para vagas pequenas 2-médias 3-Grandes");
		int a = scan.nextInt();

		switch (a) {
		case 1: {
			vaga.setTamanho("Pequeno");
			lista.add(vaga);
			b=false;break;
		}
		case 2: {
			vaga.setTamanho("Médio");
			lista.add(vaga);
			b=false;break;
		}
		case 3: {
			vaga.setTamanho("Grande");
			lista.add(vaga);
			b=false;break;
		}
		default:
		{
			System.out.println("opção errada digite novamnete");break;
		}

	}
		
	}
	return lista;
}
	public static void listarVagas(ArrayList<Vaga>lista) {
		for (Vaga vaga : lista) {
			System.out.println(vaga);
		}
	}
}
