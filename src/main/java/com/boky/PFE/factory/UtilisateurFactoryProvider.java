package com.boky.PFE.factory;

import com.boky.PFE.entite.TypeUtilisateur;
import com.boky.PFE.entite.Utilisateur;

public final class UtilisateurFactoryProvider {
    private UtilisateurFactoryProvider() {
    }

    public static UtilisateurFactory getFactory(TypeUtilisateur type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type utilisateur est obligatoire.");
        }

        return switch (type) {
            case CLIENT -> new ClientFactory();
            case ANNONCEUR -> new AnnonceurFactory();
            case FEMME_MENAGE -> new FemmeMenageFactory();
            case SOUS_ADMIN -> new SousAdminFactory();
            case SUPER_ADMIN -> new SuperAdminFactory();
        };
    }

    public static boolean typeCorrespondAuCompte(Utilisateur u, TypeUtilisateur type) {
        if (u == null || type == null) return false;
        return u.getType() == type;
    }
}
