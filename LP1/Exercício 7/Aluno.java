public class Aluno{
  private String prontuario;
  private String nome;

  public Aluno(){

  }

  public Aluno(String prontuario, String nome){
    this.setProntuario(prontuario);
    this.setNome(nome);
  }

  public void setProntuario(String prontuario){
    if(prontuario.length() != 8 || !prontuario.toLowerCase().startsWith("sp")){
          throw new IllegalArgumentException("E5rro");
	}
    
    this.prontuario = prontuario;

  }

  public String getProntuario(){
    return prontuario;
  }

   public void setNome(String nome){
     if(nome.length() < 5 || nome.length() > 100 || nome.trim().equals("")){
	throw new IllegalArgumentException("ERROOOOO");
     }
     
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }


}