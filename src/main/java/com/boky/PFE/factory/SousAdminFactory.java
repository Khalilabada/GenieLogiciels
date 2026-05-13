package com.boky.PFE.factory;

import com.boky.PFE.entite.SousAdmin;
import com.boky.PFE.entite.TypeUtilisateur;
import com.boky.PFE.entite.Utilisateur;

public class SousAdminFactory extends UtilisateurFactory {
    @Override
    public Utilisateur creerUtilisateur() {
        SousAdmin sousAdmin = new SousAdmin();
        sousAdmin.setEtat(false);
        sousAdmin.setType(TypeUtilisateur.SOUS_ADMIN);
        return sousAdmin;
    }
}
