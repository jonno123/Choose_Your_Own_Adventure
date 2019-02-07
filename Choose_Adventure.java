import java.util.Scanner;
public class Choose_Adventure{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//Made a selection piece for each of the bar parts (sel7) now to add each part for other selections after it. 
		
		String introduction = ("Welcome ladies and gentlemen to my very first choose your own adventure story." + System.getProperty("line.separator")
				+"A choose your own adveventure novel allows the reader to make their own decisions, choose"+ System.getProperty("line.separator")
				+"their own fates, and design their own ending to the novel. The more you progress, the more"+ System.getProperty("line.separator")
				+"the story gets. So I hope the you enjoy the story and I guess we shall begin!");
		
		
		String start = ("Your story begins in what appears to be a normal teenager's bedroom. You can see a standard " + System.getProperty("line.separator")
				+ "double bed with a desk containing dragon action figures that you built. On the right side of " +System.getProperty("line.separator")
				+ "the bed there is a dresser probably containing your clothes. When you look up you can see that you "+System.getProperty("line.separator")
				+ "are facing a computer. What would you like to do?");
		
		String Desk = ("You walk over to your desk. Not realizing it, you see a paper hidden behind a dragon figurine."+System.getProperty("line.separator")
				+" When you pick up the paper it reads,'Zander's Medieval Magic Computer Game'. What do you do? ");
		
		String Bed = ("You walk over to your bed, there is nothing on it but a blanket. Looks very comfortable"+System.getProperty("line.separator")
				+"What would you like to do now?");
		
		String Computer = ("You walk back over to your computer and see that it is on a screensaver. You undo the screen saver"+System.getProperty("line.separator")
				+"to see the game title 'Zander's Medieval Magic Computer Game' on the screen and a button that says join." +System.getProperty("line.separator")
				+"Do you click the join button? Y or N");
		
		String Yes_No = ("When you click the button, your body begins to become weak. You feel a force pull against you"+System.getProperty("line.separator")
				+"as it slams you down to you computer desk. Vulnerable and unable to move, you can see your hand"+System.getProperty("line.separator")
				+"begin to vanish. You peer down to the rest of your body and notice it is vanishing too. "+System.getProperty("line.separator")
				+"In the matter of seconds, your screams of help vanish and your room becomes silent.");
		
		String Nap = ("When you begin to nap, you feel as if this has been the most relaxing and comforting nap you have experienced." +System.getProperty("line.separator") 
		+" The deeper you begin to sleep though, you begin to realize that your dreams begin to become more real. People become more vivid"+System.getProperty("line.separator")
		+" as you begin to see things in much more detail.When you try to wake up though, you cannot and the more you try the darker your "+System.getProperty("line.separator")
		+"vision gets until finally, you can't see anything. ");
		
		String Awake = ("Time goes by as you continue into a deep slumber. As you begin to feel your body awake, it apppears your head is resting on " +System.getProperty("line.separator")
		+ "a bar table. Dazed and confused, you anxiously get up from your slumber and look around. It clearly looks like a run down bar. The bar has " +System.getProperty("line.separator")
		+ "cobblestone walls and on these walls are many antique photos. To the right of you, there is the bar tender. His clothes look very tattered " +System.getProperty("line.separator")
		+ "and torn. When you look at the right you see a man with a very charming appearance. With eyes that seemed to glisten, he looks to you and asks" +System.getProperty("line.separator")
		+ "'My good friend it appears you have had some fun tonight. When are we going to carry on our adventure?' More confused after what this man has said" +System.getProperty("line.separator")
		+ "what will be your reaction to this?"+System.getProperty("line.separator")
											   +System.getProperty("line.separator")
		+ "A) Ask who the man is and where you are?" +System.getProperty("line.separator")
		+ "B) Analyze this man more in depth " +System.getProperty("line.separator")
		+ "C) Look at yourself ");
		
		
		String Man_introduction = (" The man replies 'Hello my name is Salazar, I am the greatest adventurer Northern of Vantucket! A while ago I have been " +System.getProperty("line.separator")
		+ "given a quest to find the treasures mysteriously left by a group of adventurers. My quest was to go into the forests of Valor and find a path marked  " +System.getProperty("line.separator")
		+ "with a magic like haze. The haze will supposedly give the answers. This now brings me to you young man. As I was walking to the forest, I came acrossed you. " +System.getProperty("line.separator")
		+ "You seemed to be very scared and worried, like you were lost, so I asked if you care to join me, which you agreed. Right now we are at the edge of the forest " +System.getProperty("line.separator")
		+ " of Valor in a farm village of Remont. After this response what do you do? ");
		
		String Man_Analyze = ("Regaining your focus, you can see the man in much more detail then a couple minutes ago. When you look at his face you can see that his skin" +System.getProperty("line.separator")
		+ "consists of a bunch of scales. They are red and glistening, with a gold tinge to them. His eyes have are normal brown human eyes though he has teeth that are pointed" +System.getProperty("line.separator")
		+ "with a serated edge. He is wearing what appears to be a red cloak and seems to be holding a staff with a golden embroidered ball on the top of it. Probably the most startling " +System.getProperty("line.separator")
		+ "thing about this man is that he has a small scaled tail stick out of his robe. What do you do now?  ");
		
		String Your_Analysis = ("You nervously look into the mirror behind where the bartender stands. You can see that your clothing is of a hempen bag appearence, all tattered, and enough"+System.getProperty("line.separator") 
		+ "holes to place your neck, hands and legs. Your face is dirty, covered with dirt. Your arms have bruises and your shoes appear to now be of hempen bag quality as well. This brings you "+System.getProperty("line.separator")
		+ "anxiety as you know that button you pressed must have done this to you and that you are definitely not in your house anymore. What do you do? ");
		
		
		
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         	Welcome to Choose your own Adventure          ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println(introduction);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println(start);
		System.out.println();
		System.out.println("A) Go and check out your desk ");
		System.out.println("B) Go check your bed ");
		System.out.println("C) Look on your Computer");
		String sel = in.next();
		if(sel.equals("A") || sel.equals("a") ){
			System.out.println();
			System.out.println(Desk);
			System.out.println();
			System.out.println("A) Go Check Bed");
			System.out.println("B) Look on your Computer"); 
			String sel1 = in.next();
			if(sel1.equals("A")|| sel1.equals("a")){
				System.out.println();
				System.out.println(Bed);
				System.out.println("A) Look on your Computer");
				System.out.println("B) Take a nap");
				String sel3 = in.next();
				if(sel3.equals("A")||sel3.equals("a")){
					System.out.println(Computer);
					String Y_or_N = in.next();
					if(Y_or_N.equals("Y")||Y_or_N.equals("y")){
						System.out.println(Yes_No);
						System.out.println();
						System.out.println(Awake);
						String sel6 = in.next();
						if(sel6.equals("A")|| sel6.equals("a")){
							System.out.println();
							System.out.println(Man_introduction);
							System.out.println();
							System.out.println("A) Analyze the man more in Depth");
							System.out.println("B) Look at yourself");
							System.out.println("C) Ask when you guys head out? ");
						}
						else if(sel6.equals("B")||sel6.equals("b")){
							System.out.println();
							System.out.println(Man_Analyze);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at ");
							System.out.println("B) Nervously check out yourself in a mirror");
							
							
						}
						else if(sel6.equals("C")||sel6.equals("c")){
							System.out.println();
							System.out.println(Your_Analysis);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at");
							System.out.println("B) Analyze the man more in depth");
							
						}
						
					}
					else if(Y_or_N.equals("N")||Y_or_N.equals("n")){
						System.out.println("You get bored sitting in your seat for some time and you see that the button begins to glow more as you peer at it. Curious,you decide to click the button.");
						System.out.println(Yes_No);
						System.out.println();
						System.out.println(Awake);
						String sel6 = in.next();
						if(sel6.equals("A")|| sel6.equals("a")){
							System.out.println();
							System.out.println(Man_introduction);
							System.out.println();
							System.out.println("A) Analyze the man more in Depth");
							System.out.println("B) Look at yourself");
							System.out.println("C) Ask when you guys head out? ");
							
						}
						else if(sel6.equals("B")||sel6.equals("b")){
							System.out.println();
							System.out.println(Man_Analyze);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at ");
							System.out.println("B) Nervously check out yourself in a mirror");
							
						}
						else if(sel6.equals("C")||sel6.equals("c")){
							System.out.println();
							System.out.println(Your_Analysis);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at");
							System.out.println("B) Analyze the man more in depth");
							
						}
					}
				}
				else if(sel3.equals("B")|| sel3.equals("b")){
					System.out.println(Nap);
					System.out.println();
					System.out.println(Awake);
					String sel6 = in.next();
					if(sel6.equals("A")|| sel6.equals("a")){
						System.out.println();
						System.out.println(Man_introduction);
						System.out.println();
						System.out.println("A) Analyze the man more in Depth");
						System.out.println("B) Look at yourself");
						System.out.println("C) Ask when you guys head out? ");
						
					}
					else if(sel6.equals("B")||sel6.equals("b")){
						System.out.println();
						System.out.println(Man_Analyze);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at ");
						System.out.println("B) Nervously check out yourself in a mirror");
						
					}
					else if(sel6.equals("C")||sel6.equals("c")){
						System.out.println();
						System.out.println(Your_Analysis);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at");
						System.out.println("B) Analyze the man more in depth");
						
					}
				}
				
			
			}
			else if(sel1.equals("B")|| sel1.equals("b")){
				System.out.println(Computer);
				String Y_or_N = in.next();
				if(Y_or_N.equals("Y")|| Y_or_N.equals("y")){
					System.out.println(Yes_No);
					System.out.println();
					System.out.println(Awake);
					String sel6 = in.next();
					if(sel6.equals("A")|| sel6.equals("a")){
						System.out.println();
						System.out.println(Man_introduction);
						System.out.println();
						System.out.println("A) Analyze the man more in Depth");
						System.out.println("B) Look at yourself");
						System.out.println("C) Ask when you guys head out? ");
						
					}
					else if(sel6.equals("B")||sel6.equals("b")){
						System.out.println();
						System.out.println(Man_Analyze);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at ");
						System.out.println("B) Nervously check out yourself in a mirror");
						
					}
					else if(sel6.equals("C")||sel6.equals("c")){
						System.out.println();
						System.out.println(Your_Analysis);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at");
						System.out.println("B) Analyze the man more in depth");
						
					}
				}
				else if (Y_or_N.equals("N")|| Y_or_N.equals("n")){
					System.out.println("You get bored sitting in your seat for some time and you see that the button begins to glow more as you peer at it. Curious,you you decide to click the button. ");
					System.out.println(Yes_No);
					System.out.println();
					System.out.println(Awake);
					String sel6 = in.next();
					if(sel6.equals("A")|| sel6.equals("a")){
						System.out.println();
						System.out.println(Man_introduction);
						System.out.println();
						System.out.println("A) Analyze the man more in Depth");
						System.out.println("B) Look at yourself");
						System.out.println("C) Ask when you guys head out? ");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("B")||sel6.equals("b")){
						System.out.println();
						System.out.println(Man_Analyze);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at ");
						System.out.println("B) Nervously check out yourself in a mirror");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("C")||sel6.equals("c")){
						System.out.println();
						System.out.println(Your_Analysis);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at");
						System.out.println("B) Analyze the man more in depth");
						String sel7 = in.next();
						
					}
					
					
				}
				
			}
		
		}
		else if(sel.equals("B")||sel.equals("b")){
			System.out.println(Bed);
			System.out.println();
			System.out.println("A) Go to the Desk" );
			System.out.println("B) Go to the Computer");
			System.out.println("C) Take a nap");
			String sel4 = in.next();
			if(sel4.equals("A")|| sel4.equals("a")){
				System.out.println(Desk);
				System.out.println();
				System.out.println("A) Go to your Computer");
				String sel5 = in.next();
				if(sel5.equals("A")||sel5.equals("a")){
					System.out.println(Computer);
					String Y_or_N = in.next();
					if(Y_or_N.equals("Y")||Y_or_N.equals("y")){
						System.out.println(Yes_No);
						System.out.println();
						System.out.println(Awake);
						String sel6 = in.next();
						if(sel6.equals("A")|| sel6.equals("a")){
							System.out.println();
							System.out.println(Man_introduction);
							System.out.println();
							System.out.println("A) Analyze the man more in Depth");
							System.out.println("B) Look at yourself");
							System.out.println("C) Ask when you guys head out? ");
							String sel7 = in.next();
							
						}
						else if(sel6.equals("B")||sel6.equals("b")){
							System.out.println();
							System.out.println(Man_Analyze);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at ");
							System.out.println("B) Nervously check out yourself in a mirror");
							String sel7 = in.next();
							
						}
						else if(sel6.equals("C")||sel6.equals("c")){
							System.out.println();
							System.out.println(Your_Analysis);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at");
							System.out.println("B) Analyze the man more in depth");
							String sel7 = in.next();
							
						}
					}
					else if(Y_or_N.equals("N")||Y_or_N.equals("n")){
						System.out.println("You get bored sitting in your seat for some time and you see that the button begins to glow more as you peer at it. Curious,you decide to click the button.");
						System.out.println(Yes_No);
						System.out.println();
						System.out.println(Awake);
						String sel6 = in.next();
						if(sel6.equals("A")|| sel6.equals("a")){
							System.out.println();
							System.out.println(Man_introduction);
							System.out.println();
							System.out.println("A) Analyze the man more in Depth");
							System.out.println("B) Look at yourself");
							System.out.println("C) Ask when you guys head out? ");
							String sel7 = in.next();
							
						}
						else if(sel6.equals("B")||sel6.equals("b")){
							System.out.println();
							System.out.println(Man_Analyze);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at ");
							System.out.println("B) Nervously check out yourself in a mirror");
							String sel7 = in.next();
							
						}
						else if(sel6.equals("C")||sel6.equals("c")){
							System.out.println();
							System.out.println(Your_Analysis);
							System.out.println();
							System.out.println("A) Ask the man who he is and where you are at");
							System.out.println("B) Analyze the man more in depth");
							String sel7 = in.next();
							
						}
						
					}
				}
			
			
				
			}
			else if(sel4.equals("B")||sel4.equals("b")){
				System.out.println(Computer);
				String Y_or_N = in.next();
				if(Y_or_N.equals("Y")||Y_or_N.equals("y")){
					System.out.println(Yes_No);
					System.out.println();
					System.out.println(Awake);
					String sel6 = in.next();
					if(sel6.equals("A")|| sel6.equals("a")){
						System.out.println();
						System.out.println(Man_introduction);
						System.out.println();
						System.out.println("A) Analyze the man more in Depth");
						System.out.println("B) Look at yourself");
						System.out.println("C) Ask when you guys head out? ");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("B")||sel6.equals("b")){
						System.out.println();
						System.out.println(Man_Analyze);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at ");
						System.out.println("B) Nervously check out yourself in a mirror");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("C")||sel6.equals("c")){
						System.out.println();
						System.out.println(Your_Analysis);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at");
						System.out.println("B) Analyze the man more in depth");
						String sel7 = in.next();
						
					}
				}
				else if(Y_or_N.equals("N")||Y_or_N.equals("n")){
					System.out.println("You get bored sitting in your seat you some time and you see that the button begins to glow more as you peer at it. Curious, you decide to click the button.");
					System.out.println(Yes_No);
					System.out.println();
					System.out.println(Awake);
					String sel6 = in.next();
					if(sel6.equals("A")|| sel6.equals("a")){
						System.out.println();
						System.out.println(Man_introduction);
						System.out.println();
						System.out.println("A) Analyze the man more in Depth");
						System.out.println("B) Look at yourself");
						System.out.println("C) Ask when you guys head out? ");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("B")||sel6.equals("b")){
						System.out.println();
						System.out.println(Man_Analyze);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at ");
						System.out.println("B) Nervously check out yourself in a mirror");
						String sel7 = in.next();
						
					}
					else if(sel6.equals("C")||sel6.equals("c")){
						System.out.println();
						System.out.println(Your_Analysis);
						System.out.println();
						System.out.println("A) Ask the man who he is and where you are at");
						System.out.println("B) Analyze the man more in depth");
						String sel7 = in.next();
						
					}
				}
				
			}
			else if(sel4.equals("C")||sel4.equals("c")){
				System.out.println(Nap);
				System.out.println();
				System.out.println(Awake);
				String sel6 = in.next();
				if(sel6.equals("A")|| sel6.equals("a")){
					System.out.println();
					System.out.println(Man_introduction);
					System.out.println();
					System.out.println("A) Analyze the man more in Depth");
					System.out.println("B) Look at yourself");
					System.out.println("C) Ask when you guys head out? ");
					String sel7 = in.next();
					
				}
				else if(sel6.equals("B")||sel6.equals("b")){
					System.out.println();
					System.out.println(Man_Analyze);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at ");
					System.out.println("B) Nervously check out yourself in a mirror");
					String sel7 = in.next();
					
				}
				else if(sel6.equals("C")||sel6.equals("c")){
					System.out.println();
					System.out.println(Your_Analysis);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at");
					System.out.println("B) Analyze the man more in depth");
					String sel7 = in.next();
					
				}
				
			}
		}
		else if (sel.equals("C") || sel.equals("c")){
			System.out.println(Computer);
			String Y_or_N = in.next();
			if(Y_or_N.equals("Y")||Y_or_N.equals("y")){
				System.out.println(Yes_No);
				System.out.println();
				System.out.println(Awake);
				String sel6 = in.next();
				if(sel6.equals("A")|| sel6.equals("a")){
					System.out.println();
					System.out.println(Man_introduction);
					System.out.println();
					System.out.println("A) Analyze the man more in Depth");
					System.out.println("B) Look at yourself");
					System.out.println("C) Ask when you guys head out? ");
					String sel7 = in.next();
					
				}
				else if(sel6.equals("B")||sel6.equals("b")){
					System.out.println();
					System.out.println(Man_Analyze);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at ");
					System.out.println("B) Nervously check out yourself in a mirror");
					String sel7 = in.next();
					
				}
				else if(sel6.equals("C")||sel6.equals("c")){
					System.out.println();
					System.out.println(Your_Analysis);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at");
					System.out.println("B) Analyze the man more in depth");
					String sel7 = in.next();
					
				}
			}
			else if(Y_or_N.equals("N")||Y_or_N.equals("n")){
				System.out.println("You get bored sitting in your seat you some time and you see that the button begins to glow more as you peer at it. Curious, you decide to click the button.");
				System.out.println(Yes_No);
				System.out.println();
				System.out.println(Awake);
				String sel6 = in.next();
				if(sel6.equals("A")|| sel6.equals("a")){
					System.out.println();
					System.out.println(Man_introduction);
					System.out.println();
					System.out.println("A) Analyze the man more in Depth");
					System.out.println("B) Look at yourself");
					System.out.println("C) Ask when you guys head out? ");
					String sel7 = in.next();
				}
				else if(sel6.equals("B")||sel6.equals("b")){
					System.out.println();
					System.out.println(Man_Analyze);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at ");
					System.out.println("B) Nervously check out yourself in a mirror");
					String sel7 = in.next();
					
				}
				else if(sel6.equals("C")||sel6.equals("c")){
					System.out.println();
					System.out.println(Your_Analysis);
					System.out.println();
					System.out.println("A) Ask the man who he is and where you are at");
					System.out.println("B) Analyze the man more in depth");
					String sel7 = in.next();
					
				
				}
			}
			
		}
	
	}
}
