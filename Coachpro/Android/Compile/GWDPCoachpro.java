/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Projet
 * Classe Android : Coachpro
 * Date : 21/02/2020 14:39:09
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.coachpro.wdgen;


import com.masociete.coachpro.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPCoachpro extends WDProjet
{
/**
 * Accès au projet: Coachpro
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPCoachpro.getInstance()
 */
public static GWDPCoachpro getInstance()
{
return (GWDPCoachpro) ms_instance;
}

 // main_fn
public GWDFmain_fn mWD_main_fn = new GWDFmain_fn();
 // accesseur de main_fn
public GWDFmain_fn getmain_fn()
{
mWD_main_fn.checkOuverture();
return mWD_main_fn;
}


 // Constructeur de la classe GWDPCoachpro
public GWDPCoachpro()
{
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("main_fn", mWD_main_fn);



}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "0.0.13.0";}
public String getNomSociete(){ return "esprit";}
public String getNomAPK(){ return "Coachpro";}
public int getIdNomApplication(){return com.masociete.coachpro.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.coachpro";}
public int getIdIconeApplication(){ return com.masociete.coachpro.R.drawable.greenbouton_01_0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 640;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 760;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Coachpro";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\COACHPRO\\GABARITS\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_SLD_CURSOR.PNG?E2",com.masociete.coachpro.R.drawable.material_design_green_sld_cursor_2_selector+23, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\COACHPRO\\GABARITS\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_BTN_STD.PNG?E5_3NP_10_10_10_10",com.masociete.coachpro.R.drawable.material_design_green_btn_std_1_np3_10_10_10_10_selector+23, "");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPCoachpro.class;
}
}
}
