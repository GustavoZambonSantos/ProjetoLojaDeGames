package com.LojadeGames.LojaDeGames.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Informar se a censura é livre ou classifique a idade indicada")
	@Size(min = 5, max = 20, message = "Informar se a censura é livre ou classifique a idade indicada")
	private String censura;

	@NotBlank(message = "Campo obrigatório para preenchimento")
	@Size(message = "Campo obrigatório para preenchimento")
	private String genero;

	@NotBlank(message = "Campo obrigatório para preenchimento")
	private Float notaCritica;

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Float getNotaCritica() {
		return notaCritica;
	}

	public void setNotaCritica(Float notaCritica) {
		this.notaCritica = notaCritica;
	}

}