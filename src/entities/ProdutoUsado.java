package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	private Date dataDeFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nomeProduto, Double preco, Date dataDeFabricacao) {
		super(nomeProduto, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String tagPreco() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Nome:"+this.getNomeProduto()+"\nData de fabricação:"+sdf.format(this.getDataDeFabricacao())+"\nPreço: R$"+String.format("%.2f",this.getPreco())+"\n";
	}
}
