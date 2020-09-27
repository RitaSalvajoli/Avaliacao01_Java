
public class Aluno {
	
        private String nome;
        private String curso;
        private int ra;
        private int matricula;
        
        public Aluno (String nome,String curso, int ra, int matricula){	
            
        }
        
        public String getNome(){
            return this.nome;
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
      
        public String getCurso(){
            return this.curso;
        }
        
        public void setCurso(String curso){
            this.curso = curso;
        }
   
        public int getRa(){
            return this.ra;
        }
        
        public void setRa(int ra){
            this.ra = ra;
        }
      
        public int getMatricula(){
            return this.matricula;
        }
        
        public void setMatricula(int matricula){
            this.matricula = matricula;
        }
        
    }