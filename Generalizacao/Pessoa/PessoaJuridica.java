package POOGeneralizacao.Pessoa;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String tipoEmpresa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
        super.setNome(nome);
        super.setEndereco(endereco);
        setCnpj(cnpj);
        setTipoEmpresa(tipoEmpresa);
    }

    public PessoaJuridica(){

    }

}
