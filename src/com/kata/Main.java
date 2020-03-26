package com.kata;

import java.util.Scanner;
public class Main {
	static int total =0;
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int continuer= 1;
			
			do {
				int res=0; //Résultat d'une manche
				System.out.println("Bonjour et bienvenue dans le jeu du Yahtzee codé par Vincent");
				int [] des = new int [5];
				des = lancer();
				Yahtzee yahtzee = new Yahtzee(des[0], des[1],des[2],des[3],des[4]);
				int choix = 0;

				System.out.println("Dans quelle catégorie voulez-vous scorer?");
				System.out.println("1. Chance");
				System.out.println("2. Yahtzee(5 identques)");
				System.out.println("3. 1s");
				System.out.println("4. 2s");
				System.out.println("5. 3s");
				System.out.println("6. 4s");
				System.out.println("7. 5s");
				System.out.println("8. 6s");
				System.out.println("9. Paire");
				System.out.println("10. Double Paire");
				System.out.println("11. Carré");
				System.out.println("12. Triplé");
				System.out.println("13. Petite suite");
				System.out.println("14. Grande suite");
				System.out.println("15. Full");
				
				choix = scan.nextInt();
				
				switch (choix) {
				case 1 :
					res = Yahtzee.chance();
					progres(res);
				break;
				
				case 2 :
					res = Yahtzee.yahtzeeRes();
					progres(res);
					break;
					
				case 3 :
					res = Yahtzee.ones();
					progres(res);
					break;
					
				case 4 :
					res = Yahtzee.twos();
					progres(res);
					break;
					
				case 5 :
					res = Yahtzee.threes();
					progres(res);
					break;
					
				case 6 :
					res = Yahtzee.fours();
					progres(res);
					break;
					
				case 7 :
					res = Yahtzee.fives();
					progres(res);
					break;
					
				case 8 :
					res = Yahtzee.sixes();
					progres(res);
					break;
					
				case 9 :
					res = Yahtzee.score_pair();
					progres(res);
					break;
					
				case 10 :
					res = Yahtzee.two_pair();
					progres(res);
					break;
					
				case 11 :
					res = Yahtzee.four_of_a_kind();
					progres(res);
				break;
				
				case 12 :
					res = Yahtzee.three_of_a_kind();
					progres(res);
				break;
				
				case 13 :
					res = Yahtzee.smallStraight();
					progres(res);
				break;
				
				case 14 :
					res = Yahtzee.largeStraight();
					progres(res);
				break;
				
				case 15 :
					res = Yahtzee.fullHouse();
					progres(res);
				break;
				
				default:
					System.out.println("Je n'ai pas compris votre choix. Vous allez être redirigé.");
				}
				System.out.println("Souhaitez-vous continuer? Entrez 0 si vous voulez partir, 1 sinon.");
				continuer = scan.nextInt();				
			}	while(continuer!= 0);
			scan.close();
		}
	
	
	 public static int[] lancer() {
		 Scanner scan = new Scanner(System.in);
		 int[] des = new int [5];
		 for (int i=0; i<des.length; i++) { 
				System.out.println("Entrez le résultat du dé "+(i+1));
				des[i]=scan.nextInt();		
		 }
		 //scan.close();
		 return des;	 
	 }
	 
	 public static void progres(int res) {
		 if (res!=0) System.out.println("Félicitations!");
		 total +=res;
		 System.out.println("Vous avez marqué "+res+" points au cours de cette manche, ce qui vous fait un total de "+total+" points");
	 }
	}

