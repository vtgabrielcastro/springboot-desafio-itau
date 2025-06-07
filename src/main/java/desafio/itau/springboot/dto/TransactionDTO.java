package desafio.itau.springboot.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionDTO {
	
	@NotNull
	@Min(0)
	private Double valor;
	
	@NotNull
	private OffsetDateTime dataHora;

	public Double getValor() {
		return valor;
	}

	public OffsetDateTime getDataHora() {
		return dataHora;
	}

	
}
