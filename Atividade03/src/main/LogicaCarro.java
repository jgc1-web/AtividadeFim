package main;

import java.util.ArrayList;
import java.util.Scanner;

import main.objetos.Carro;

public class LogicaCarro {
	public static Scanner scan= new Scanner(System.in);
	public static int encontrarCarro(ArrayList<Carro>lista) {
		System.out.println("digite a placa do seu carro");
		String placa= scan.next();
		for (int i =lista.size()-1; i >=0 ; i--) {
		
			if (lista.get(i).getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("encontrado");
				return i;
			}
		}
		return -1;
	
	
	}
	public static void exibirHistorico(ArrayList<Carro> listaCarro) {
	    for (Carro carro : listaCarro) {
	        if (carro.getHoraEntrada() != null && carro.getHoraSaida() != null) {
	            int horaEntrada = (int)(carro.getHoraEntrada() / 60);
	            int minutoEntrada = (int)(carro.getHoraEntrada() % 60);
	            int horaSaida = (int)(carro.getHoraSaida() / 60);
	            int minutoSaida = (int)(carro.getHoraSaida() % 60);
	            
	            double tempoPermanencia = carro.getHoraSaida() - carro.getHoraEntrada();
	            int horasPermanencia = (int)(tempoPermanencia / 60);
	            int minutosPermanencia = (int)(tempoPermanencia % 60);
	            
	            System.out.println("Placa do Carro: " + carro.getPlaca());
	            System.out.println("Hora de Entrada: " + horaEntrada + ":" + minutoEntrada);
	            System.out.println("Hora de Saída: " + horaSaida + ":" + minutoSaida);
	            System.out.println("Tempo de Permanência: " + horasPermanencia + " horas e " + minutosPermanencia + " minutos");
	            System.out.println("Valor Pago: R$ " + carro.getValorPago());
	            System.out.println("-------------------------------------------");
	        }
	    }
	}

public static  ArrayList<Carro> cadastrarCarro(ArrayList<Carro>lista)
{
Carro carro= new Carro(null, null, null, null, null);
carro.setDisponivel(true);
System.out.println("Digite a Placa do seu Carro ");
carro.setPlaca(scan.next());
System.out.println("Digite o modelo  do seu Carro ");
carro.setModelo(scan.next());

Boolean b=true;
while (b!=false) {
	System.out.println("digite 1 para carros pequenos 2-médios 3-Grandes");
	int a = scan.nextInt();

	switch (a) {
	case 1: {
		carro.setTamanho("Pequeno");
		lista.add(carro);
		b=false;break;
	}
	case 2: {
		carro.setTamanho("Médio");
		lista.add(carro);
		b=false;break;
	}
	case 3: {
		carro.setTamanho("Grande");
		lista.add(carro);
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
public static  ArrayList<Carro> removerCarro(ArrayList<Carro>lista){
	System.out.println("digite a placa do seu carro");
	String placa= scan.next();
	for (int i =lista.size()-1; i >=0 ; i--) {
		if (lista.get(i).getPlaca().equalsIgnoreCase(placa)) {
			lista.remove(i);
	
			System.out.println("Carro removido");
		}
	}

	return lista;
}
public static  void listarCarro(ArrayList<Carro>lista)
{
	for (Carro carro : lista) {
		System.out.println(carro);
	}
}
}
