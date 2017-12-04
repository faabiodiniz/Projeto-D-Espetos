/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

public class Fornecedor
{
 
    private int idFornecedor;
    private String cnpj;
    private String nomeFornecedor;
    private String email;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;

    public Fornecedor(){
        
    }


    public Fornecedor(int id, String cnpj, String nomeFantasia, String email, String telefone, String rua,
                    String bairro, int numero, String cidade, String estado) {
        this.setCnpj(cnpj);
        this.setNomeFornecedor(nomeFantasia);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setIdFornecedor(id);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setRua(rua);
        this.setNumero(numero);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
        
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }
    
    public void setNomeFornecedor(String nomeFornecedor) {
        if ((nomeFornecedor == null) || (nomeFornecedor.equals(""))) {
            this.nomeFornecedor = "";
        }
        this.nomeFornecedor = nomeFornecedor;
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

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int id){
        this.idFornecedor = id;
    }

    public String getCnpj() {
        return cnpj;
    }
}
