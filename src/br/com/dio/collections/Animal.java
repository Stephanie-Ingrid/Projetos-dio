package br.com.dio.collections;

import java.time.LocalDate;

public class Animal {

    private String nome;
    private String ambiente;
    private boolean sexo;

    private LocalDate dataEntrada;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getAmbiente(){
        return ambiente;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }
    public boolean getSexo(){
        return sexo;
    }
    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }
    public LocalDate getDataEntrada(){
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return " Dados de animais: \n" + " Nome: " + nome + "\n Ambiente Natural: " + ambiente + "\n Sexo :" + sexo +
                "\nData de entrada : " + dataEntrada;
    }
   public void alimentar(String nome){
        String comer = "\ncomeu";
       System.out.println(nome + comer);

    }
    public void reproduzir(int filhotes){
        if (filhotes < 5 ){
            System.out.println("Teve poucos filhote");
        }else if(filhotes <= 10){
            System.out.println("Não teve muitos filhotes");
        }else{
            System.out.println("Não teve muitos filhotes");
        }
    }
}
