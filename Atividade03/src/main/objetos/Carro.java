package main.objetos;

public class Carro {
	private String placa;
	private String modelo;
	private String tamanho;
	private Double horaEntrada;
	private Double horaSaida;
	private Vaga vaga;
	private Boolean disponivel;
	private Double valorPago;
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Double getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Double horaSaida) {
		this.horaSaida = horaSaida;
	}
	@Override
	public String toString() {
		int a=0,b=0;
		if(horaEntrada!=null&&horaSaida!=null) {
		 a=(int) (horaEntrada/60);
		 b=(int) (horaSaida/60);
		 return "Carro [placa=" + placa + ", modelo=" + modelo + ", tamnho=" + tamanho + ", horaEntrada=" +a+":"+horaEntrada%60
					+ ", horaSaida=" +b +":"+horaSaida%60+ "valor a ser pago"+valorPago+"]";
		}
		else {
		
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", tamnho=" + tamanho +"]";
	}}
	public Carro(String placa, String modelo, String tamanho, Double horaEntrada, Double horaSaida, Vaga vaga) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.vaga = vaga;
	}
	public Carro(String placa, String modelo, String tamanho, Double horaEntrada, Double horaSaida) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	
	
	

}
