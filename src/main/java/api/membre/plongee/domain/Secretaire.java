/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.membre.plongee.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Marine
 */
@Table(name = "Secretaire")
public class Secretaire extends Membre{
     public Secretaire( String nom, String prenom, String adresseMail, String login, String password, Date dateDebutCertificat, Date aPaye,  Integer niveauExpertise, String numLicence, Adresse adresse) {
        super(  nom,  prenom,  adresseMail,  login,  password,  dateDebutCertificat,  aPaye,   niveauExpertise,  numLicence,  adresse); 
    } 
}
