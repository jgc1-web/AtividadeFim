package main.objetos;

public class Vaga {
private Integer numeroVaga;
private Boolean disponibilidade;
private String tamanho;


public Integer getNumeroVaga() {
	return numeroVaga;
}
public void setNumeroVaga(Integer numeroVaga) {
	this.numeroVaga = numeroVaga;
}
public Boolean getDisponibilidade() {
	return disponibilidade;
}
public void setDisponibilidade(Boolean disponibilidade) {
	this.disponibilidade = disponibilidade;
}
public String getTamanho() {
	return tamanho;
}
public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}

@Override
public String toString() {
	if (this.disponibilidade.equals(true)) {
		return "Vaga [numeroVaga=" + numeroVaga + ", disponibilidade= Disponível" +  ", tamanho=" + tamanho
				+ "]";
	}
	else {
		return "Vaga [numeroVaga=" + numeroVaga + ", disponibilidade= indisponível" +", tamanho=" + tamanho
				+  "]";
	}

}
public Vaga(Integer numeroVaga, Boolean disponibilidade, String tamanho) {
	super();
	this.numeroVaga = numeroVaga;
	this.disponibilidade = disponibilidade;
	this.tamanho = tamanho;
	
}

}
