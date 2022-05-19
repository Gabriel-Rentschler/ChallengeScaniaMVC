package br.com.cargapesada.truckpass.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long codVeiculo;
	private int tipoVeiculo; // 0 = caminhão; 1 = ônibus;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private String corVeiculo;
	private String placaVeiculo;
	private String estado;
	private int kmRodado;
	private int tipoCombustivel;
	// 0 = gasolina; 1 = alcool; 2 = gasolina; 3 = eletrico; 4 = hibrido;
	private int dataRevisao;
	private String nr_chassi;

	
	
	//GETTERS and SETTERS
	public int getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(int tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCorVeiculo() {
		return corVeiculo;
	}

	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public int getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getDataRevisao() {
		return dataRevisao;
	}

	public void setDataRevisao(int dataRevisao) {
		this.dataRevisao = dataRevisao;
	}

	public String getNr_chassi() {
		return nr_chassi;
	}

	public void setNr_chassi(String nr_chassi) {
		this.nr_chassi = nr_chassi;
	}

	public Long getCodVeiculo() {
		return codVeiculo;
	}

}
