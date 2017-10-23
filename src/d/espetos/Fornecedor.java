/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

public class Fornecedor
{
 
    private int idCliente;
    private String cnpj;
    private String nomeFornecedor;
    private String email;
    private String telefone;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private VendedorRepresentante representante;

    public Fornecedor(){
        
    }


	public Fornecedor(String cnpj, String nomeFantasia, String email, String telefone, String endereco,
			String bairro, int numero, String cidade, String estado, VendedorRepresentante representante) {
		super();
		this.cnpj = cnpj;
		this.nomeFornecedor = nomeFantasia;
		this.email = email;
		this.telefone = telefone;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.representante = representante;
	}

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

	public String getCnpj() {
		return cnpj;
	}
}
