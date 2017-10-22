/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

public class Fornecedor
{
 
    private int idCliente;
    private int cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String email;
    private String telefone;
    private String endereco;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private VendedorRepresentante representante;
	


	public Fornecedor(int cnpj, String nomeFantasia, String razaoSocial, String email, String telefone, String endereco,
			String bairro, int numero, String cidade, String estado, VendedorRepresentante representante) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.representante = representante;
	}
	
	public VendedorRepresentante getRepresentante()
	{
			return representante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public int getCnpj() {
		return cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
    
    
    
    
    

}
