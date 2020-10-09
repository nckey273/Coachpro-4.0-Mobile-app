/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : main_fn
 * Date : 21/02/2020 14:39:09
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.coachpro.wdgen;


import com.masociete.coachpro.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.potentiometre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFmain_fn extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de main_fn
////////////////////////////////////////////////////////////////////////////

/**
 * btn_connection
 */
class GWDbtn_connection extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de main_fn.btn_connection
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336481826066521257l);

super.setChecksum("1217098836");

super.setNom("btn_connection");

super.setType(4);

super.setBulle("");

super.setLibelle("connection");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(56, 220);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur btn_connection
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sChaineTmp = new WDChaineU();

WDObjet vWD_sListePeriphs = new WDChaineU();



// sChaineTmp est une chaîne


// sListePériphs est une chaîne


// SI BTEtat() = btActif ALORS
if(WDAPIBluetooth.btEtat().opEgal(1))
{
// 	Sablier(Vrai)
WDAPIDivers.sablier(new WDBooleen(true).getInt());

// 	sListePériphs = BTListePériphérique()    
vWD_sListePeriphs.setValeur(WDAPIBluetooth.btListePeripherique());

// 	IF sListePériphs <> "" ALORS
if(vWD_sListePeriphs.opDiff(""))
{
// 		POUR TOUTE CHAÎNE sChaineTmp DE sListePériphs SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursSousChaine.pourTout(vWD_sChaineTmp, null, null, vWD_sListePeriphs, "\r\n", 0x2);
while(parcours1.testParcours())
{
// 			sIdentifiant est une chaîne = ExtraitChaîne(sChaineTmp,1, TAB)
WDObjet vWD_sIdentifiant = new WDChaineU();


vWD_sIdentifiant.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),1,new WDChaineU("\t")));


// 			sAdresseMAC est une chaîne = ExtraitChaîne(sChaineTmp,2, TAB)
WDObjet vWD_sAdresseMAC = new WDChaineU();


vWD_sAdresseMAC.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),2,new WDChaineU("\t")));


// 			sNom est une chaîne = ExtraitChaîne(sChaineTmp,3, TAB)
WDObjet vWD_sNom = new WDChaineU();


vWD_sNom.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),3,new WDChaineU("\t")));


// 			SI sNom = "HC-06" ALORS
if(vWD_sNom.opEgal("HC-06"))
{
// 				SI SocketConnecteBluetooth("coachpro", "SerialPortServiceClass_UUID", sAdresseMAC) ALORS
if(WDAPISocketBT.socketConnecteBluetooth("coachpro","SerialPortServiceClass_UUID",vWD_sAdresseMAC.getString()).getBoolean())
{
// 					Info("Connecté a coachpro ")
WDAPIDialogue.info("Connecté a coachpro ");

// 					MachineConnected=Vrai
vWD_MachineConnected.setValeur(true);

// 					btn_connection..Visible=Faux
this.setProp(EWDPropriete.PROP_VISIBLE,false);

// 					btn_deconnection..Visible=Vrai
mWD_btn_deconnection.setProp(EWDPropriete.PROP_VISIBLE,true);

// 					Sablier(Faux)
WDAPIDivers.sablier(new WDBooleen(false).getInt());

// 					SORTIR 
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}
else
{
// 					Sablier(Faux)
WDAPIDivers.sablier(new WDBooleen(false).getInt());

// 					Info("Échec création Socket "+ErreurInfo())                    
WDAPIDialogue.info(new WDChaineU("Échec création Socket ").opPlus(WDAPIVM.erreurInfo()).getString());

}

}

// 			Sablier(Faux)
WDAPIDivers.sablier(new WDBooleen(false).getInt());

// 			Info("Aucun périphérique coachpro  disponible.") 
WDAPIDialogue.info("Aucun périphérique coachpro  disponible.");

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


}
else
{
// 		Sablier(Faux)
WDAPIDivers.sablier(new WDBooleen(false).getInt());

// 		Info("Aucun périphérique coachpro  disponible.") 
WDAPIDialogue.info("Aucun périphérique coachpro  disponible.");

}

// 	Sablier(Faux)
WDAPIDivers.sablier(new WDBooleen(false).getInt());

}
else
{
// 	Info("Veuillez activer le Bluetooth ")
WDAPIDialogue.info("Veuillez activer le Bluetooth ");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_connection mWD_btn_connection;

/**
 * btn_deconnection
 */
class GWDbtn_deconnection extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de main_fn.btn_deconnection
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336484330032972102l);

super.setChecksum("1217616696");

super.setNom("btn_deconnection");

super.setType(4);

super.setBulle("");

super.setLibelle("deconnection");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(56, 25);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur btn_deconnection
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SocketFerme("coachpro")
WDAPISocket.socketFerme("coachpro");

// MoiMême..Visible=Faux
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,false);

// btn_connection..Visible=Vrai
mWD_btn_connection.setProp(EWDPropriete.PROP_VISIBLE,true);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_deconnection mWD_btn_deconnection;

/**
 * btn_mode1
 */
class GWDbtn_mode1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de main_fn.btn_mode1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336498086816358482l);

super.setChecksum("1220757191");

super.setNom("btn_mode1");

super.setType(4);

super.setBulle("");

super.setLibelle("MODE 1");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(506, 213);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur btn_mode1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// socketecrit  ("coachpro","J")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("J"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_mode1 mWD_btn_mode1;

/**
 * HOME
 */
class GWDHOME extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de main_fn.HOME
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336517100637203505l);

super.setChecksum("1221387249");

super.setNom("HOME");

super.setType(4);

super.setBulle("");

super.setLibelle("HOME");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(624, 213);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de HOME
 */
public void init()
{
super.init();

// si MachineConnected=Vrai alors
if(vWD_MachineConnected.opEgal(true))
{
// 	moimeme..Visible=Vrai
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,true);

}

}




/**
 * Traitement: Clic sur HOME
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// socketecrit  ("coachpro","H")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("H"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDHOME mWD_HOME;

/**
 * btn_profil
 */
class GWDbtn_profil extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de main_fn.btn_profil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336675734822896462l);

super.setChecksum("790039381");

super.setNom("btn_profil");

super.setType(4);

super.setBulle("");

super.setLibelle("Profil");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(506, 8);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur btn_profil
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SocketEcrit  ("coachpro","P")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("P"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_profil mWD_btn_profil;

/**
 * potvitesse
 */
class GWDpotvitesse extends WDPotentiometre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de main_fn.potvitesse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,130,19);
super.setRectCompPrincipal(0,19,130,164);
super.setQuid(3336681434263454782l);

super.setChecksum("809000884");

super.setNom("potvitesse");

super.setType(12);

super.setBulle("");

super.setLibelle("Vitesse");

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(315, 286);

super.setTailleInitiale(183, 130);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setPresenceLibelle(true);

super.setParamPotar(0, 100, 0, true, 10, true);

super.setParamGraduation(false, true);

super.setImage("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Sld_Cursor@dpi160.png?E2", 1, 0, 3);

super.setImageFond("", 1, 0, 1);

super.setTauxParallaxe(0, 0);

super.setStylePotar(WDCadreFactory.creerCadre_GEN(2, 0xE1E1E1, 0x616161, 0x50AF4C, 2.000000, 2.000000, 1, 1), 0xC9E6C8);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0, 0x222222);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(23, 0xE1E1E1, 0x616161, 0xC9E6C8, 2.000000, 2.000000, 1, 1));

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setPersistant(false);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de potvitesse
 */
public void init()
{
super.init();

// si  stop_btn..Visible=Vrai alors
if(mWD_stop_btn.getProp(EWDPropriete.PROP_VISIBLE).opEgal(true))
{
// 	moimeme..Visible=Vrai
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,true);

}

// potvitesse..BorneMax=3
this.setProp(EWDPropriete.PROP_BORNEMAX,3);

// potvitesse..BorneMin=1
this.setProp(EWDPropriete.PROP_BORNEMIN,1);

}




/**
 * Traitement: A chaque modification de potvitesse
 */
public void modification()
{
super.modification();

// si MoiMême..Valeur=1 alors
if(WDContexte.getMoiMeme().getValeur().opEgal(1))
{
// 	SocketEcrit  ("coachpro","E")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("E"));

}

// si MoiMême..Valeur=2 alors
if(WDContexte.getMoiMeme().getValeur().opEgal(2))
{
// 	SocketEcrit("coachpro","M")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("M"));

}

// Si MoiMême..Valeur=3 ALORS
if(WDContexte.getMoiMeme().getValeur().opEgal(3))
{
// 	SocketEcrit  ("coachpro","H")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("H"));

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDpotvitesse mWD_potvitesse;

/**
 * start_btn
 */
class GWDstart_btn extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de main_fn.start_btn
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336687056392813536l);

super.setChecksum("826166835");

super.setNom("start_btn");

super.setType(4);

super.setBulle("");

super.setLibelle("Start");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(427, 190);

super.setTailleInitiale(49, 64);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de start_btn
 */
public void init()
{
super.init();

// SI btn_mode1..Visible=Vrai ALORS
if(mWD_btn_mode1.getProp(EWDPropriete.PROP_VISIBLE).opEgal(true))
{
// 	MoiMême..Visible=Vrai
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,true);

}

}




/**
 * Traitement: Clic sur start_btn
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SocketEcrit  ("coachpro","F")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("F"));

// MoiMême..Visible=Faux
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,false);

// stop_btn..Visible=Vrai
mWD_stop_btn.setProp(EWDPropriete.PROP_VISIBLE,true);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDstart_btn mWD_start_btn;

/**
 * stop_btn
 */
class GWDstop_btn extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de main_fn.stop_btn
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336690363527051911l);

super.setChecksum("835588060");

super.setNom("stop_btn");

super.setType(4);

super.setBulle("");

super.setLibelle("Stop");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(427, 118);

super.setTailleInitiale(48, 64);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Coachpro\\Gabarits\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur stop_btn
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SocketEcrit  ("coachpro","B")
WDAPISocket.socketEcrit("coachpro",new WDChaineU("B"));

// MoiMême..Visible=Faux
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,false);

// start_btn..Visible=vrai
mWD_start_btn.setProp(EWDPropriete.PROP_VISIBLE,true);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDstop_btn mWD_stop_btn;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de main_fn.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3336481765930345759l);

super.setChecksum("1210465012");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ main_fn.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * ActionBar
 */
class GWDActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de main_fn.ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x50AF4C, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDActionBar mWD_ActionBar;

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOption extends WDOptionMenu
{
public GWDMOption(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(3336527206701995655l);

super.setNom("Option");

super.setType(40001);

super.setLibelle("Option");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(1);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(12);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// Ferme(main_fn)
WDAPIFenetre.ferme(GWDPCoachpro.getInstance().mWD_main_fn);

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOption mWD_Option = new GWDMOption(true);

public void initialiserSousObjets()
{
mWD_Option.initialiserObjet();
super.ajouterMenu(mWD_Option);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3024189436375393722l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));
super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));
activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



/**
 * Traitement: Déclarations globales de main_fn
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// MachineConnected est un boolean = Faux
vWD_MachineConnected = new WDBooleen();

vWD_MachineConnected.setValeur(false);

super.ajouterVariableGlobale("MachineConnected",vWD_MachineConnected);



}




/**
 * Traitement: Fermeture de main_fn
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// si MachineConnected= Vrai alors
if(vWD_MachineConnected.opEgal(true))
{
// 	SocketFerme("coachpro")
WDAPISocket.socketFerme("coachpro");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_MachineConnected = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre main_fn
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_btn_connection = new GWDbtn_connection();
mWD_btn_deconnection = new GWDbtn_deconnection();
mWD_btn_mode1 = new GWDbtn_mode1();
mWD_HOME = new GWDHOME();
mWD_btn_profil = new GWDbtn_profil();
mWD_potvitesse = new GWDpotvitesse();
mWD_start_btn = new GWDstart_btn();
mWD_stop_btn = new GWDstop_btn();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();
mWD__Menu = new GWDM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre main_fn
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3336481765930280223l);

super.setChecksum("1217608117");

super.setNom("main_fn");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(680, 410);

super.setTitre("CoachPro4.0");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de main_fn
////////////////////////////////////////////////////////////////////////////
mWD_btn_connection.initialiserObjet();
super.ajouter("btn_connection", mWD_btn_connection);
mWD_btn_deconnection.initialiserObjet();
super.ajouter("btn_deconnection", mWD_btn_deconnection);
mWD_btn_mode1.initialiserObjet();
super.ajouter("btn_mode1", mWD_btn_mode1);
mWD_HOME.initialiserObjet();
super.ajouter("HOME", mWD_HOME);
mWD_btn_profil.initialiserObjet();
super.ajouter("btn_profil", mWD_btn_profil);
mWD_potvitesse.initialiserObjet();
super.ajouter("potvitesse", mWD_potvitesse);
mWD_start_btn.initialiserObjet();
super.ajouter("start_btn", mWD_start_btn);
mWD_stop_btn.initialiserObjet();
super.ajouter("stop_btn", mWD_stop_btn);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPCoachpro.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPCoachpro.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPCoachpro.getInstance().mWD_main_fn;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN GREEN#WM";
}
}
