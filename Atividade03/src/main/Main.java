package main;

import java.util.Scanner;

import main.objetos.Estacionamento;

public class Main {
	public static Scanner scan= new Scanner(System.in);
	

	public static void main(String[] args) {
	int a=1;
	while (a!=0) {
		System.out.println("===bem vindo=== ");
		System.out.println("===digite 1 para entrar no sistema de Carros===");
		System.out.println("===digite 2 para entrar no sistema de Vagas===");
		System.out.println("===digite 3 para gerenciar vagas===");
		System.out.println("===digite 0 para sair===");
		a = scan.nextInt();
		switch (a) {
		case 1: {
			
			Estacionamento.sistemaCarro();break;
		}
		case 2:
			{
			Estacionamento.sistemaVaga();break;
			}
		case 3:
		{
		Estacionamento.sistemaOcupar();	break;
		}
		case 0:
		{
		System.out.println("saindo");break;
		}
		default:
		System.out.println("digite novamnete");break;
		}
	}

	}
}