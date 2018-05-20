/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.membre.service;

import api.membre.plongee.domain.Membre;
import api.membre.enumeration.TypeMembre;
import java.util.Date;

/**
 *
 * @author Marine
 */
public interface GestionMembre {
   /**
     * Correspond au DSS s'inscrire
     * @param nom
     * @param prenom
     * @param adresseMail
     * @param login
     * @param password
     * @param dateDebutCertificat
     * @param niveauExpertise
     * @param numLicence
     * @param type
     * @param pays
     * @param ville
     * @return 
     */
    public Membre creerMembre ( String nom, String prenom, String adresseMail, String login, String password, Date dateDebutCertificat,  Integer niveauExpertise, String numLicence, String pays, String ville, TypeMembre type);
   
}
