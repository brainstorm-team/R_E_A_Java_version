/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jemacom
 */
public class Client extends Utilisateur{

    public Client(int Id, String nom, String prenom, String email, String telephone, String adresse, String login, String pass) {
        super(Id, nom, prenom, email, telephone, adresse, login, pass , "client");
    }

    
    public Client() {
    }

    
    /**
     * 
     Possibilite d'ajout des attributs 
     */
    
    
    
}
