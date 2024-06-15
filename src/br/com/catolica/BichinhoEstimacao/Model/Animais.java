package br.com.catolica.BichinhoEstimacao.Model;

public class Animais {
    private String nome;
    private String classe;
    private String familia;
    private Integer idade;
    private Boolean estado;
    private Integer calorias;
    private Integer forca;

    public Animais(String nome, String classe, String familia, Integer idade,
                   Boolean estado, Integer calorias, Integer forca){
        this.nome= nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.calorias = calorias;
        this.forca = forca;
    }
    public Animais(String nome, String classe, String familia){
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.calorias = 10;
        this.forca = 10;
    }

    public String getNome(){
        return nome;
    }
    public String getClasse(){
        return classe;
    }
    public String getFamilia(){
        return familia;
    }
    public Integer getIdade(){
        return idade;
    }
    public Boolean getEstado(){
        return estado;
    }
    public Integer getCalorias(){
        return calorias;
    }
    public Integer getForca(){
        return forca;
    }
    public String nasceu(){
        return "O animal se chama " + getNome() + " é da classe " + getClasse() +
                " da familia " + getFamilia() + ". O animal possui força de "
                + getForca() + ", caloria de " + getCalorias() + " e a idade de " + getIdade();
    }
    public String morrer(){
        this.forca = 0;
        this.estado = false;
        String text = "O animal morreu!";
        return text;
    }
    public String comer(){
        String text = " ";
        //this.calorias = this.calorias + 10; // ou
        this.calorias +=10;
        this.forca -= 2;
        if (this.forca < 0){
            this.forca += 2;
            this.calorias += (this.calorias - 10);
            System.out.println(getNome() + " Esta exausto!");
        }else{
            text = "O animal comeu e agora seua forca é " + getForca()
                    + " e suas calorias valem " + getCalorias();
        }
        return text;
    }
    public String correr(){
        this.forca -= 5;
        this.calorias -= 5;
        return "O animal está correndo! Agora sua força é " + getForca()
                + " e suas calorias valem " + getCalorias();
    }
    public String dormir(){
        String text = " ";
        this.forca += 10;
        this.calorias -= 2;
        if (this.forca > 100) {
            this.forca -= (this.forca - 100);
            this.calorias += 2;
            System.out.println("O " + getNome() + " não pode mais comer! Ele esta cheio!\nSua força está em " + getForca()
            + " e as calorias em " + getCalorias());
        }else{
            text = "O animal esta dormindo agora! Sua força aumentou para "
                    + getForca() + " e suas calorias aumentaram para " + getCalorias();
        }
        return text;
    }
}
