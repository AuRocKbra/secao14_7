package entities;

public class Produto {
	private String nomeProduto;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nomeProduto, Double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String tagPreco() {
		return "Nome:"+getNomeProduto()+"\nPreço: R$"+String.format("%.2f",getPreco())+"\n";
	}
}
