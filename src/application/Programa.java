package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de produtos?");
		int quantidadeDeProdutos = sc.nextInt();
		List <Produto> produtos = new ArrayList<>();
		for(int aux=0;aux<quantidadeDeProdutos;aux++) {
			sc.nextLine();
			System.out.println("Produto - "+(aux+1));
			System.out.print("Qual tipo do produto (N/I/U)?");
			String tipoProduto = sc.nextLine();
			System.out.print("Nome:");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto:");
			Double preco = sc.nextDouble();
			switch(tipoProduto.toUpperCase()) {
				case "I":
					System.out.print("Taxa de importação:");
					sc.nextLine();
					Double taxaImportacao = sc.nextDouble();
					ProdutoImportado produtoImportado = new ProdutoImportado(nomeProduto, preco, taxaImportacao);
					produtos.add(produtoImportado);
					break;
				case "U":
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					System.out.print("Data de fabricação (dd/MM/yyyy):");
					sc.nextLine();
					Date dateDeFabricacao = sdf.parse(sc.nextLine());
					ProdutoUsado produtoUsado = new ProdutoUsado(nomeProduto, preco, dateDeFabricacao);
					produtos.add(produtoUsado);
					break;
				default:
					Produto produto = new Produto(nomeProduto, preco);
					produtos.add(produto);
					break;
			}
		}
		System.out.println("\nDados dos produtos:\n");
		for(Produto x : produtos) {
			System.out.println(x.tagPreco());
		}
		sc.close();
	}

}
