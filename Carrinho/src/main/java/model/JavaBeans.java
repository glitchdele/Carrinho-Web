package model;

public class JavaBeans {

	private String id;
	private String produto;
	private String quantidade;
	private String valor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

//construtor 1
	public JavaBeans() {
		super();

	}

	// construtor 2 (usado no metodo select com ArrayList (vetor)

	public JavaBeans(String id, String produto, String quantidade, String valor) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}
