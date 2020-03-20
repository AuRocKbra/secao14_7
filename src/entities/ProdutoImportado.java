package entities;

public class ProdutoImportado extends Produto{
	private Double taxaDeImportacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nomeProduto, Double preco, Double taxaDeImportacao) {
		super(nomeProduto, preco);
		this.taxaDeImportacao = taxaDeImportacao;
	}

	public Double getTaxaDeImportacao() {
		return taxaDeImportacao;
	}

	public void setTaxaDeImportacao(Double taxaDeImportacao) {
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	@Override
	public String tagPreco() {
		return "Nome:"+this.getNomeProduto()+"\nPreço sem taxa: R$"+String.format("%.2f",this.getPreco())+"\nValor total: R$"+String.format("%.2f",this.getPreco()+this.getTaxaDeImportacao())+"\n";
	}
}
