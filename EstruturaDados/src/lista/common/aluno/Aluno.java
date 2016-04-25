package lista.common.aluno;

/**
 *
 * @author Leonardo Fiedler
 */
public class Aluno implements Comparable<Aluno> 
{
    private String nome;
    private String cpf;
    private int matricula;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    
    
    public int getMatricula() 
    {
		return matricula;
	}

	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}

	public Aluno()
    { }

    public Aluno(String nome, String cpf, int matricula) 
    {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setMatricula(matricula);
    }

	@Override
	public int compareTo(Aluno o) 
	{
		if (o.getMatricula() > this.getMatricula()) {
			return -1;
		} else if(o.getMatricula() == this.getMatricula()){
			return 0;	
		} else
			return 1;
	}

	
	@Override
	public String toString()
	{
		return "Nome: " + this.getNome() + "\n" +
			   "CPF: " + this.getCpf() + "\n"	+
				"Matrícula: " + this.getMatricula() + "\n";
	}   
}
