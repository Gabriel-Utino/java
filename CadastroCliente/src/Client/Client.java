package Client;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.utino_uscson
 */
public class Client {
    private String name;
    private String cpf;
    private String rg;
    private String email;
    private String address;
    private String number;
    private String cep;
    
    public Client() {
    }
    
    public Client(String name, String cpf, String rg, String email, 
            String address, String number, String cep) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.address = address;
        this.number = number;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    public void printClient() {
        System.out.println("Name :"+this.name);
    }
}