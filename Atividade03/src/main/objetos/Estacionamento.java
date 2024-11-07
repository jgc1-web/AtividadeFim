package main.objetos;

import java.util.ArrayList;
import java.util.Scanner;

import main.LogicaCarro;
import main.LogicaVaga;

public class Estacionamento {
	public static ArrayList<Carro> listCarro = new ArrayList<Carro>();
	public static ArrayList<Vaga> listVaga= new ArrayList<Vaga>();
	public static Scanner scan= new Scanner(System.in);
	public static void ocuparVaga() {
		
	    int b = LogicaCarro.encontrarCarro(listCarro); 
	    int a = LogicaVaga.encontrarVaga(listVaga); 
		if (b!=-1&&a!=-1) {
			if (listVaga.get(a).getDisponibilidade().equals(true)&&listVaga.get(a).getTamanho().equalsIgnoreCase(listCarro.get(b).getTamanho())&&listCarro.get(b).getDisponivel().equals(true)) {
				listVaga.get(a).setDisponibilidade(false);
				listCarro.get(b).setDisponivel(false);
				listCarro.get(b).setVaga(listVaga.get(a));
				System.out.println("digite a hora de entrada  e após isso os minutos");
				double hora=scan.nextDouble()*60;
				double minutos=scan.nextDouble();
				listCarro.get(b).setHoraEntrada(hora+minutos);
				
				
				System.out.println("vaga ocupada");
				
			}
			else {
				System.out.println("vaga ou carro ocupados");
			}
		
		}
		else {
			System.out.println("Vaga ou Carro não Existem");
		}
		
		
	
	}
	public static void desocuparVaga() {
	
	    int b = LogicaCarro.encontrarCarro(listCarro); 
	    int a = LogicaVaga.encontrarVaga(listVaga); 
		if ( a!=-1 &&b!=-1) {
			if (listVaga.get(a).getDisponibilidade().equals(false)&&listVaga.get(a).getTamanho().equalsIgnoreCase(listCarro.get(b).getTamanho())&&listCarro.get(b).getDisponivel().equals(false)) {
				listVaga.get(a).setDisponibilidade(true);
				listCarro.get(b).setDisponivel(true);
				listCarro.get(b).setVaga(null);
				System.out.println("digite a hora de saida e após isso os minutos");
				double hora=scan.nextDouble()*60;
				double minutos=scan.nextDouble();
				listCarro.get(b).setHoraSaida(hora+minutos);
				double c= listCarro.get(b).getHoraSaida()-listCarro.get(b).getHoraEntrada();
				
				if (c<=60) {
					listCarro.get(b).setValorPago(5.00);
				}
				else if (c>60 &&c<=180) {
					listCarro.get(b).setValorPago(10.00);
				}
				else {
					listCarro.get(b).setValorPago(15.00);
				}
				
				System.out.println("vaga desocupada");
				
			}
			else {
				System.out.println("vaga ou carro ocupados");
			}
		
		}
		else {
			System.out.println("Vaga ou Carro não Existem");
		}
		
		
	
	}

public static void sistemaCarro() {
	int a=1;
	while (a!=0) {
		System.out.println("===Bem vindo====");
		System.out.println("===digite 1 para cadastrar carros==== ");
		System.out.println("===digite 2 para listar carros==== ");
		System.out.println("===digite 3 para remover um carro==== ");
		System.out.println("==0 para sair===");
		 a =scan.nextInt();
		switch (a) {
		case 1: {
			LogicaCarro.cadastrarCarro(listCarro);break;
		}
		case 2:{
			LogicaCarro.listarCarro(listCarro);break;
		}
		case 3:{
			LogicaCarro.removerCarro(listCarro);break;
		}
		case 0:{
			System.out.println("saindo ...");break;
			
		}
		default:
			System.out.println("opção errada");
		}}
	}
public static void sistemaVaga() {
	int a=1;
	while (a!=0) {
		System.out.println("===Bem vindo====");
		System.out.println("===digite 1 para cadastrar vagas==== ");
		System.out.println("===digite 2 para listar vagas==== ");
		System.out.println("===digite 3 para remover uma vaga==== ");
		System.out.println("==0 para sair===");
		 a =scan.nextInt();
		switch (a) {
		case 1: {
			LogicaVaga.cadastrarVaga(listVaga);break;
		}
		case 2:{
			LogicaVaga.listarVagas(listVaga);break;
		}
		case 3:{
			LogicaVaga.removerVaga(listVaga);break;
		}
		case 0:{
			System.out.println("saindo ...");break;
			
		}
		default:
			System.out.println("opção errada");
		}}
	}
public static void sistemaOcupar() {
    int a = 1;
    while (a != 0) {
        System.out.println("===Bem vindo====");
        System.out.println("===digite 1 para ocupar vagas === ");
        System.out.println("===digite 2 para desocupar vagas==== ");
        System.out.println("===digite 3 para listar carros com seus preços==== ");
        System.out.println("===digite 4 para exibir vagas ocupadas === ");
        System.out.println("===digite 5 para exibir histórico de permanência === ");
        System.out.println("==0 para sair===");
        a = scan.nextInt();
        switch (a) {
            case 1: {
                ocuparVaga();
                break;
            }
            case 2: {
                desocuparVaga();
                break;
            }
            case 3: {
                LogicaCarro.listarCarro(listCarro);
                break;
            }
            case 4: {
                LogicaVaga.listarVagasOcupadas(listVaga, listCarro);
                break;
            }
            case 5: {
                LogicaCarro.exibirHistorico(listCarro);
                break;
            }
            case 0: {
                System.out.println("saindo ...");
                break;
            }
            default:
                System.out.println("opção errada");
        }
    }
}
}

